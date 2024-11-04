import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialStageBG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialStageBG extends World
{
    private GreenfootSound tutorialMusic;
    
    /**
     * Constructor for objects of class TutorialStageBG.
     * 
     */
    public TutorialStageBG()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 600, 1); 
        tutorialMusic =  new  GreenfootSound("CYBER_TUTORIAL_BGM.wav");
        playSound();
    }
    
    /**
     * 
     */
    public void playSound()
    {
        tutorialMusic.playLoop();
    }

    /**
     * 
     */
    public void stopSound()
    {
        tutorialMusic.stop();
    }
}
