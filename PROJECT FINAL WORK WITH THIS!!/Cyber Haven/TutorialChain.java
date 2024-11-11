import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TutorialChain extends NoCollisionParts
{

    /**
     * Constructor for objects of class TutorialChain.
     */
    public TutorialChain()
    {
        GreenfootImage image = getImage(); // Get the current image
        image.scale((int)(image.getWidth() * 0.7), (int)(image.getHeight() * 0.7)); // Scale the image by 0.7x
        setImage(image); // Set the scaled image as the actor's image
    }

    /**
     * Act - do whatever the TutorialChain wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
}
