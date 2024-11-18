import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalStageBBG here.
 */
public class FinalStageBBG extends World
{
    private GreenfootSound finalBMusic;

    /**
     * Constructor for objects of class FinalStageBBG.
     */
    public FinalStageBBG()
    {    
        // Create a new world with 1600x600 cells with a cell size of 1x1 pixels.
        super(1600, 600, 1); 
        finalBMusic = new GreenfootSound("CYBER_FINAL2_BGM.wav");
        playSound();
        prepare();
    }
    
    /**
     * Plays the background music.
     */
    public void playSound()
    {
        finalBMusic.playLoop();
    }

    /**
     * Stops the background music.
     */
    public void stopSound()
    {
        finalBMusic.stop();
    }
    
    private void prepare()
    {
        CoinCounter coinCounter = new CoinCounter();
        addObject(coinCounter, 52, 44);
    }
}
