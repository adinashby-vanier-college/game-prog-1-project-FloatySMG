import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialStageBG here.
 * 
 * @version (a version number or a date)
 */
public class TutorialStageBG extends World
{
    private static GreenfootSound tutorialMusic = new GreenfootSound("CYBER_TUTORIAL_BGM.mp3");

    /**
     * Constructor for objects of class TutorialStageBG.
     */
    public TutorialStageBG()
    {    
        // Create a new world with 1600x600 cells with a cell size of 1x1 pixels.
        super(1600, 600, 1); 
        playSound();
        prepare();
    }

    /**
     * Plays the background music in a loop.
     */
    public void playSound()
    {
        tutorialMusic.playLoop();
    }

    /**
     * Stops the background music.
     */
    public static void stopMusic()
    {
        tutorialMusic.stop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CoinCounter coinCounter = new CoinCounter();
        addObject(coinCounter,52,54);
        coinCounter.setLocation(52,44);
    }
}
