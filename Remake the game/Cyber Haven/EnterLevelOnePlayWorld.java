import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnterLevelOnePlayWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnterLevelOnePlayWorld extends World
{

    /**
     * Constructor for objects of class EnterLevelOnePlayWorld.
     * 
     */
    public EnterLevelOnePlayWorld()
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
        EnterLevelTwoMovie enterLevelTwoMovie = new EnterLevelTwoMovie();
        addObject(enterLevelTwoMovie,814,278);
        enterLevelTwoMovie.setLocation(1104,291);
        removeObject(enterLevelTwoMovie);
        addObject(enterLevelTwoMovie,801,302);
    }
}
