import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialStageBG here.
 * 
 * @version (a version number or a date)
 */
public class TutorialStageBG extends World
{
    public static GreenfootSound tutorialMusic;
    public static int counter = 0;
    /**
     * Constructor for objects of class TutorialStageBG.
     */
    public TutorialStageBG()
    {    
        // Create a new world with 1600x600 cells with a cell size of 1x1 pixels.
        super(1600, 600, 1); 
        tutorialMusic = new GreenfootSound("cybertutorialbgm.wav") ;
        playMusic();
        prepare();
        
    }

    /**
     * Plays the background music in a loop.
     */
    public void playMusic()
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
        //CoinCounter coinCounter = new CoinCounter();
        //addObject(coinCounter,52,54);
        //coinCounter.setLocation(52,44);
        CoinCounter coinCounter = new CoinCounter();
        addObject(coinCounter,40,44);
        CyrusPlayer cyrus = new CyrusPlayer(coinCounter);
    }
}
