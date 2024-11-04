import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalStageBBG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalStageBBG extends World
{
    private GreenfootSound finalBMusic;
    /**
     * Constructor for objects of class FinalStageBBG.
     * 
     */
    public FinalStageBBG()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 600, 1); 
        finalBMusic =  new  GreenfootSound("CYBER_FINAL2_BGM.wav");
        playSound();
    }
    
    /**
     * 
     */
    public void playSound()
    {
        finalBMusic.playLoop();
    }

    /**
     * 
     */
    public void stopSound()
    {
        finalBMusic.stop();
    }
}
