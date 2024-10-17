import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Robot extends Actor
{

    /**
     * Act - do whatever the Robot wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        eat();
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
            Greenfoot.playSound(".wav");
        }
    }
}
