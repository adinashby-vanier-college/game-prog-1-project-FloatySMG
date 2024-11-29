import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovieBPlayWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonGainPlayWorld extends World
{

    /**
     * Constructor for objects of class MovieBPlayWorld.
     * 
     */
    public CannonGainPlayWorld()
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
        GainCannonMovie gainCannonMovie = new GainCannonMovie();
        addObject(gainCannonMovie,801,301);
        gainCannonMovie.setLocation(801,301);
    }
}