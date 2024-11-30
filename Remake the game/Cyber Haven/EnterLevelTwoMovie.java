import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnterLevelTwoMovie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnterLevelTwoMovie extends Actor
{   
    GifImage myGif = new GifImage("EnterLevelTwoMovie.gif");
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

       // Check if the frame count has reached 600
       if (frameCount >= 235) {
           // Transition to WorldTwoStageA
           Greenfoot.setWorld(new WorldTwoStageA());
       }
    }
}
