import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1StageBG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1StageBG extends World
{
    private GreenfootSound level1Music;
    
    /**
     * Constructor for objects of class Level1StageBG.
     * 
     */
    public Level1StageBG()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 600, 1); 
        level1Music =  new  GreenfootSound("CYBER_LEVEL1_BGM.wav");
        playSound();
        prepare();
    }
    
    /**
     * 
     */
    public void playSound()
    {
        level1Music.playLoop();
    }

    /**
     * 
     */
    public void stopSound()
    {
        level1Music.stop();
    }
    
    private void prepare()
    {
        CoinCounter coinCounter = new CoinCounter();
        addObject(coinCounter,52,54);
        coinCounter.setLocation(52,44);
    }
}
