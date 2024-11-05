import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoinImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinImage extends Images
{
    private GreenfootImage CoinCounterImage;
    /**
     * Act - do whatever the CoinImage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public CoinImage()
    {CoinCounterImage = new GreenfootImage("CoinCounterImage.png");
     scaleImage();
    }
    
    private void scaleImage()
    {GreenfootImage myImage = getImage();
     int myNewHeight = (int)myImage.getHeight()/3;
     int myNewWidth = (int)myImage.getWidth()/1;
     myImage.scale(myNewHeight, myNewWidth);  
    }
}
