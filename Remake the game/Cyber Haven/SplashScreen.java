import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{
    private int timer;
    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public SplashScreen()
    {    
        // Create a new world with 1600x600 cells with a cell size of 1x1 pixels.
        super(1600, 600, 1); 
    }
    
    public void act() {
        updateTimerAndCheckTransition();
    }
        
    private void updateTimerAndCheckTransition() {
       // Show the Splash Screen for a certain amount of time
        timer++; //Increment the timer
       if (timer == 180) { // Check if the timer has reached 180 frames (3 secnds)
       Greenfoot.setWorld(new StartMenu()); // Transitions to the StartMenu world
       }
    }
}
