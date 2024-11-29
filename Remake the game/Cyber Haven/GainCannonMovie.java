import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GainCannonMovie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GainCannonMovie extends Actor
{   
    GifImage myGif = new GifImage("GainCannonMovie.gif");
    private int scaleWidth = 1600;  // Set to desired width
    private int scaleHeight = 600;  // Set to desired height

    private int frameCount = 0;     // Frame counter

    public void act()
    {
       // Increment the frame counter each time act is called
       frameCount++;

       // Display the current frame of the GIF
       GreenfootImage currentImage = myGif.getCurrentImage();
       currentImage.scale(scaleWidth, scaleHeight);
       setImage(currentImage);

       // Check if the frame count has reached 114
       if (frameCount >= 600) {
           // Transition to TutorialStageA
       }
    }
}