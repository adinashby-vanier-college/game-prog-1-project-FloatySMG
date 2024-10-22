import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Robot extends Actor
{
    private int vSpeed;
    public Robot()
    {vSpeed = 0;
    }
    
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        eat();
        vSpeed--;//gravity
        setLocation(getX(), getY() - vSpeed);
    }
    
    /**
     * 
     */
    public void eat()
    {
        Actor cyrus = getOneIntersectingObject(Cyrus.class);
        if (cyrus != null) {
            World world = getWorld();
            world.removeObject(cyrus);
            //Greenfoot.playSound(".wav");
        }
    }
}
