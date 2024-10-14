// WARNING: This file is auto-generated and any changes to it will be overwritten
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
        cityBuilding1.setLocation(31, 360);
        cityBuilding1.setLocation(65, 371);
        cityBuilding1.setLocation(44, 358);
        cityBuilding1.setLocation(69, 366);
        cityBuilding1.setLocation(86, 378);
        cityBuilding1.setLocation(72, 364);
        cityBuilding1.setLocation(157, 282);
        cityBuilding1.setLocation(54, 365);
        cityBuilding1.setLocation(71, 363);
        cityBuilding1.setLocation(43, 371);
        cityBuilding1.setLocation(65, 356);
        cityBuilding1.setLocation(46, 371);
        cityBuilding1.setLocation(60, 375);
        cityBuilding1.setLocation(62, 362);
        cityBuilding1.setLocation(129, 339);
        cityBuilding1.setLocation(117, 344);
        cityBuilding1.setLocation(70, 363);
        cityBuilding1.setLocation(38, 364);
        cityBuilding1.setLocation(33, 353);
        cityBuilding1.setLocation(58, 361);
        cityBuilding1.setLocation(67, 358);
        cityBuilding1.setLocation(49, 365);
        cityBuilding1.setLocation(61, 356);
        cityBuilding1.setLocation(41, 362);
        cityBuilding1.setLocation(50, 366);
        cityBuilding1.setLocation(40, 348);
        cityBuilding1.setLocation(73, 364);
        cityBuilding1.setLocation(59, 363);
        cityBuilding1.setLocation(58, 365);
        cityBuilding1.setLocation(44, 358);
        cityBuilding1.setLocation(58, 351);
        cityBuilding1.setLocation(71, 374);
        cityBuilding1.setLocation(41, 360);
        cityBuilding1.setLocation(42, 351);
        cityBuilding1.setLocation(58, 361);
        cityBuilding1.setLocation(57, 358);
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
