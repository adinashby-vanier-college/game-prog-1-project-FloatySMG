import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovieBPlayWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovieBPlayWorld extends World
{

    /**
     * Constructor for objects of class MovieBPlayWorld.
     * 
     */
    public MovieBPlayWorld()
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
        MovieRGF movieRGF = new MovieRGF();
        addObject(movieRGF,774,284);
        movieRGF.setLocation(842,294);
        movieRGF.setLocation(700,268);
        movieRGF.setLocation(782,284);
    }
}
