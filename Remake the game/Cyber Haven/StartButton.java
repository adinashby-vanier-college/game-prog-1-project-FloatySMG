import lang.stride.*;
import greenfoot.*;


public class StartButton extends MenuButtons
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private GreenfootImage startImage;
    private GreenfootImage startHoverImage;


    public StartButton()
    {
        // Initialize the button images and sets the default image.
        startImage =  new  GreenfootImage("StartButton.png"); 
        startHoverImage =  new  GreenfootImage("StartHoverButton.png");
        setImage(startImage);
    }

    public void act()
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage(startHoverImage);
        }
        else if (Greenfoot.mouseMoved(null)) {
            setImage(startImage);
        }
        if (Greenfoot.mouseClicked(this)) {
            transitionToWorldOne();
            Greenfoot.playSound("startClick.wav");
        }
  
    }
   
    public void transitionToWorldOne()
    {
        // Transition to WorldOne when the button is clicked.
        World WorldOne =  new  WorldOne();
        Greenfoot.setWorld(WorldOne);
    }
}
        
    
