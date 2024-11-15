// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class StartButton here.
 * @author (your name) @version (a version number or a date)
 */
public class StartButton extends MenuButtons
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private GreenfootImage startImage;
    private GreenfootImage startHoverImage;

    /**
     * 
     */
    public StartButton()
    {
        startImage =  new GreenfootImage("start.png");
        startHoverImage =  new GreenfootImage("startHover.png");
        setImage(startImage);
    }

    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
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
            transitionToMovieBPlayWorld();
            Greenfoot.playSound("mouseclick.wav");
        }
    }

    /**
     * 
     */
    public void transitionToMovieBPlayWorld()
    {
        World movieBPlayWorld =  new MovieBPlayWorld();
        Greenfoot.setWorld(movieBPlayWorld);
    }
}
