import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movie extends Actor
{   
    GifImage myGif = new GifImage("EndMovie.gif");
    
    // Define the width and height you want for scaling
    private int scaleWidth = 1200;  // Set to desired width
    private int scaleHeight = 600; // Set to desired height

    /**
     * Act - do whatever the Movie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       GreenfootImage currentImage = myGif.getCurrentImage();
       currentImage.scale(scaleWidth, scaleHeight);  // Scale the image
       setImage(currentImage);  // Set the scaled image
    }
}
