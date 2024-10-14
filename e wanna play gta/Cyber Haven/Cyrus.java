// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Cyrus extends Actor
{
    private int speed = 2;
    /* Normal speed*/
    private int runSpeed = 4;
    /* Speed when running*/
    private GreenfootImage[] runningImages;
    /* Array to hold running animation images*/
    private int currentImageIndex = 0;
    /* Index for current animation frame*/
    private int vSpeed;

    /**
     * 
     */
    public Cyrus()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight() * 4;
        int myNewWidth = (int)myImage.getWidth() * 2;
        myImage.scale(myNewHeight, myNewWidth);
        vSpeed = vSpeed + 1;
        /* gravity*/
    }

    /**
     * Act - do whatever the Cyrus wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        handleMovement();
        jump();
    }

    /**
     * 
     */
    private void handleMovement()
    {
        if (Greenfoot.isKeyDown("right")) {
            move(speed);
            if (Greenfoot.isKeyDown("shift")) {
                move(runSpeed);
            }
        }
        
        if (Greenfoot.isKeyDown("left")) {
            move( - speed);
            if (Greenfoot.isKeyDown("shift")) {
                move( - runSpeed);
            }
        }
        
        if (Greenfoot.isKeyDown("space")) {
            setLocation(getX(), getY() - 8);
        }
    }

    /**
     * 
     */
    private void animateRunning()
    {
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("left")) {
            currentImageIndex = (currentImageIndex + 1) % 2;
            setImage("CryrusRunning.png");
            /* [currentImageIndex]);*/
        }
        else {
            /* Set a standing image when not moving (add standing image)*/
            setImage("CyrusStand.png");
            /* Replace with your standing image*/
        }
    }

    /**
     * 
     */
    private void jump()
    {
        /* in act or a 'moveVertically' method that it calls vSpeed++; // gravity*/
        setLocation(getX(), getY() + vSpeed);
        /* verical movement*/
        if (vSpeed < 0) {
            /* if rising bumps head*/
            if (isTouching(null)) {
                /* adjustPosition under object*/
                vSpeed = 20;
            }
            if (vSpeed > 0) {
                /* falling on surface*/
                if (isTouching(CityBuilding1.class) || isAtEdge()) {
                    /* adjust position over object or edge*/
                    vSpeed = 10;
                    if (isTouching(null)) {
                        vSpeed = vSpeed - 15;
                    }
                    /* adjust value as needed*/
                }
            }
        }
    }
}
