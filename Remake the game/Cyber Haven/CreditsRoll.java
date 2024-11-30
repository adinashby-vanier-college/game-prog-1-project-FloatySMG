import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CreditsRoll extends World
{
    private GreenfootSound bgm;  // Variable to hold the background music
    private int elapsedTime = 0;  // Variable to track time passed

    // Variables to track text addition times
    private boolean firstTextAdded = false;
    private boolean secondTextAdded = false;

    /**
     * Constructor for objects of class CreditsRoll.
     * 
     */
    public CreditsRoll()
    {    
        // Create a new world with 1600x600 cells with a cell size of 1x1 pixels.
        super(1600, 600, 1); 

        // Create the background music object and play it
        bgm = new GreenfootSound("CYBER_STAFFROLL_BGM.wav");
        bgm.playLoop();  // Play the song in a loop during the credits roll
        prepare();
    }

    /**
     * Optional: If you want the music to stop after the credits, you can add this method.
     */
    public void stopMusic() {
        bgm.stop();  // Stop the music when necessary
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Add the first credits object with a delay of 5000 ms (5 seconds)

        CyberHavenCredits cyberHavenCredits = new CyberHavenCredits();
        addObject(cyberHavenCredits,858,76);
        CreditsA creditsA = new CreditsA();
        addObject(creditsA,858,176);
        CreditsB creditsB = new CreditsB();
        addObject(creditsB,858,226);
        CreditsC creditsC = new CreditsC();
        addObject(creditsC,858,276);
        CreditsD creditsD = new CreditsD();
        addObject(creditsD,858,326);
        CreditsE creditsE = new CreditsE();
        addObject(creditsE,858,376);
        CreditsF creditsF = new CreditsF();
        addObject(creditsF,858,426);
        CreditsG creditsG = new CreditsG();
        addObject(creditsG,858,476);;
        CreditsH creditsH = new CreditsH();
        addObject(creditsH,858,526);
    }

    /**
     * Act - do whatever the CreditsRoll wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

    }
}
