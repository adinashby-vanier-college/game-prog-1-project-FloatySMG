import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalStageABG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalStageABG extends World
{
    private GreenfootSound finalAMusic;
    /**
     * Constructor for objects of class FinalStageABG.
     * 
     */
    public FinalStageABG()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 600, 1); 
        finalAMusic =  new  GreenfootSound("CYBER_FINAL1_BGM.wav");
        playSound();
        prepare();
    }
    
    /**
     * 
     */
    public void playSound()
    {
        finalAMusic.playLoop();
    }

    /**
     * 
     */
    public void stopSound()
    {
        finalAMusic.stop();
    }
    
    private void prepare()
    {
        CoinCounter coinCounter = new CoinCounter();
        addObject(coinCounter,52,54);
        coinCounter.setLocation(52,44);
    }
    
}
