import lang.stride.*;
import greenfoot.*;


public class ExitButton extends MenuButtons
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private GreenfootImage exitImage;
    private GreenfootImage exitHoverImage;


    /**
     * Constructor - Initialize the button images and sets the default image. 
     */
    public ExitButton()
    {
        exitImage =  new  GreenfootImage("ExitButton.png"); 
        exitHoverImage =  new  GreenfootImage("ExitHoverButton.png");
        setImage(exitImage);
    }

    /**
     * Act - Check for mouse interactions with the button. Changes the button image on hover and handles click events.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage(exitHoverImage);
        }
        else if (Greenfoot.mouseMoved(null)) {
            setImage(exitImage);
        }
        if (Greenfoot.mouseClicked(this)) {
            transitionToStartMenu();
            //Greenfoot.playSound("startClick.wav");
        }
  
    }
   
    /**
     * Transition to StartMenu when the button is clicked.
     */
    public void transitionToStartMenu()
    {
        World startMenu =  new  StartMenu();
        Greenfoot.setWorld(startMenu);
    }
}
