import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LivesImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LivesImage extends Images
{
    private GreenfootImage LifeCounterImage;
    /**
     * Act - do whatever the LivesImage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public LivesImage()
    {LifeCounterImage = new GreenfootImage("LifeCounterImage.png");
     scaleImage();    
    }
    
    private void scaleImage()
    {GreenfootImage myImage = getImage();
     int myNewHeight = (int)myImage.getHeight()/1;
     int myNewWidth = (int)myImage.getWidth()/13;
     myImage.scale(myNewHeight, myNewWidth);
    }
}
