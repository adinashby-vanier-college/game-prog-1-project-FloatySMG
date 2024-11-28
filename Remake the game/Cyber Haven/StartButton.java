import lang.stride.*;
import greenfoot.*;


public class StartButton extends MenuButtons
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private GreenfootImage startImage;
    private GreenfootImage startHoverImage;


    /**
     * Constructor - Initialize the button images and sets the default image. 
     */
    
    public StartButton()
    {
        startImage =  new  GreenfootImage("StartButton.png"); 
        startHoverImage =  new  GreenfootImage("StartHoverButton.png");
        setImage(startImage);
    }

    /**
     * Act - Check for mouse interactions with the button. Changes the button image on hover and handles click events.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage(startHoverImage);
        }
        else if (Greenfoot.mouseMoved(null)) {
            setImage(startImage);
        }
        if (Greenfoot.mouseClicked(this)) {
            transitionToWorldTwo();
            Greenfoot.playSound("startClick.wav");
        }
  
    }
   
    /**
     * Transition to WorldOne when the button is clicked.
     */
    public void transitionToWorldTwo()
    {
        World worldTwo =  new  WorldTwo();
        Greenfoot.setWorld(worldTwo);
    }
}
        
    
