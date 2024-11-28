import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends World
{

    /**
     * Constructor for objects of class StartMenu.
     * 
     */
    public StartMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartButton startButton = new StartButton();
        addObject(startButton,800,375);
        startButton.setLocation(800,375);
        CyberHavenTitle cyberHavenTitle = new CyberHavenTitle();
        addObject(cyberHavenTitle,800,136);
        cyberHavenTitle.setLocation(800,136);
        TutorialButton tutorialButton = new TutorialButton();
        addObject(tutorialButton,796,513);
        tutorialButton.setLocation(800,513);
    }
}
