import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoviePlayWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoviePlayWorld extends World
{

    /**
     * Constructor for objects of class MoviePlayWorld.
     * 
     */
    public MoviePlayWorld()
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
        Movie movie = new Movie();
        addObject(movie,802,306);
    }
}
