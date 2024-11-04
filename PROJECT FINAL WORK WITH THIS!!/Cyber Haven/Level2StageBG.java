import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2StageBG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2StageBG extends World
{
    private GreenfootSound level2Music;
    /**
     * Constructor for objects of class Level2StageBG.
     * 
     */
    public Level2StageBG()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 600, 1); 
        level2Music =  new  GreenfootSound("CYBER_LEVEl2_BGM.wav");
        playSound();
    }
    
    /**
     * 
     */
    public void playSound()
    {
        level2Music.playLoop();
    }

    /**
     * 
     */
    public void stopSound()
    {
        level2Music.stop();
    }
}
