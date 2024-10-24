import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CityBuilding1 extends Actor
{
    private int vSpeed;
    /**
     * 
     */
    public CityBuilding1()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight() / 2;
        int myNewWidth = (int)myImage.getWidth() / 4;
        myImage.scale(myNewHeight, myNewWidth);
        
        vSpeed = 0;
    }

    /**
     * Act - do whatever the CityBuilding1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        vSpeed--;
        setLocation(getX(), getY() - vSpeed);
    }
}
