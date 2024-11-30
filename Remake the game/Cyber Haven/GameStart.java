import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameStart extends World
{
    private int timer;  // Timer to track elapsed time

    /**
     * Constructor for objects of class GameStart.
     * 
     */
    public GameStart()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 600, 1); 
        timer = 0; // Initialize the timer
    }

    public void act() {
        timer++; // Increment the timer

        // Transition to SplashScreen after 2 seconds (assuming 60 frames per second)
        if (timer >= 120) {  // 60 frames/second * 2 seconds = 120 frames
            Greenfoot.setWorld(new SplashScreen());  // Transition to SplashScreen
        }
    }
}
