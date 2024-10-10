import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Cyrus extends Actor
{   private int speed = 5; // Normal speed
    private int runSpeed = 10; // Speed when running
    private GreenfootImage[] runningImages; // Array to hold running animation images
    private int currentImageIndex = 0; // Index for current animation frame

    /**
     * 
     */
    public Cyrus()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight() * 4;
        int myNewWidth = (int)myImage.getWidth() * 2;
        myImage.scale(myNewHeight, myNewWidth);
        
        
    }

    /**
     * Act - do whatever the Cyrus wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        handleMovement();
        animateRunning();
    }
    
    private void handleMovement() {
        if (Greenfoot.isKeyDown("right")) {
            move(Greenfoot.isKeyDown("shift") ? runSpeed : speed);
        } 
        if (Greenfoot.isKeyDown("left")) {
            move(Greenfoot.isKeyDown("shift") ? -runSpeed : -speed);
        }
    }

    private void animateRunning() {
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("left")) {
            currentImageIndex = (currentImageIndex + 1) % runningImages.length;
            setImage(runningImages[currentImageIndex]);
        } else {
            // Set a standing image when not moving (add standing image)
            setImage("CyrusStand.png"); // Replace with your standing image
        }
    }
}
