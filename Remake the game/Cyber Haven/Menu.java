import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 1600x600 cells with a cell size of 1x1 pixels.
        super(1600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ExitButton exitButton = new ExitButton();
        addObject(exitButton,800,513);
        exitButton.setLocation(800,513);
        ResumeButton resumeButton = new ResumeButton();
        addObject(resumeButton,800,393);
        resumeButton.setLocation(800,393);
        CyberHavenTitle cyberHavenTitle = new CyberHavenTitle();
        addObject(cyberHavenTitle,800,136);
        cyberHavenTitle.setLocation(800,136);        
    }
}
