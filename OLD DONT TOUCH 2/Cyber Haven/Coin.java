import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Coin extends Actor
{
    public Coin(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight() / 2;
        int myNewWidth = (int)myImage.getWidth() / 5;
        myImage.scale(myNewHeight, myNewWidth);
    }
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
}
