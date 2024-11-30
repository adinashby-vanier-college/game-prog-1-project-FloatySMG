import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotBoss extends Robots
{
    /**
     * Act - do whatever the RobotBoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act(); // Inherit behavior from Robots (and Characters)
    }

    public RobotBoss() {
    hitPoints = 40; // Level 1 robot dies in 1 hit
    }
}
