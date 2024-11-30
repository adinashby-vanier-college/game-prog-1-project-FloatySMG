import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovieRGF extends Actor
{   
    GifImage myGif = new GifImage("MovieB.gif");
    private int scaleWidth = 1200;  // Set to desired width
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

       // Check if the frame count has reached 590
       if (frameCount >= 590) {
           // Transition to WorldOneStageA
           Greenfoot.setWorld(new WorldOneStageA());
       }
    }
}
