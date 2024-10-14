import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Tutorial extends World
{
    private Cyrus cyrus;
    /* Replace with your character class*/
    private GreenfootImage background;
    private int bgOffset;

    /* Offset for scrolling*/

    /**
     * Constructor for objects of class Tutorial.
     */
    public Tutorial()
    {
        super(380, 380, 1);
        background =  new  GreenfootImage("BackgroundLV1.png");
        /* Your background image*/
        setBackground(background);
        cyrus =  new  Cyrus();
        /* Initial position*/
        bgOffset = 0;
        /* Start with no offset*/
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cyrus cyrus =  new  Cyrus();
        addObject(cyrus, 42, 330);
        cyrus.setLocation(178, 236);
        cyrus.setLocation(178, 234);
        CityBuilding1 cityBuilding1 =  new  CityBuilding1();
        addObject(cityBuilding1, 141, 376);
        
    }

    /**
     * 
     */
    private void scrollBackground()
    {
        /* Move the character (handle input)*/
        if (Greenfoot.isKeyDown("right")) {
            cyrus.setLocation(cyrus.getX() + 5, cyrus.getY());
            bgOffset = bgOffset + 5;
            /* Adjust based on character speed*/
        }
        if (Greenfoot.isKeyDown("left")) {
            cyrus.setLocation(cyrus.getX() - 5, cyrus.getY());
            bgOffset = bgOffset - 5;
            /* Adjust based on character speed*/
        }
        /* Scroll the background*/
        if (bgOffset > 0) {
            bgOffset = 0;
            /* Prevent scrolling back too far*/
        }
        setBackground(background);
        getBackground().drawImage(background, bgOffset, 0);
        /* Draw background with offset*/
    }
}
