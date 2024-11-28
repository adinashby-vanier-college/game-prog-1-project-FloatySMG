import greenfoot.*;  

public class TutorialButton extends MenuButtons
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private GreenfootImage tutorialImage;
    private GreenfootImage tutorialHoverImage;

    /**
     * Constructor - Initialize the button images and sets the default image. 
     */
    public TutorialButton()
    {
        tutorialImage = new GreenfootImage("TutorialButton.png");
        tutorialHoverImage = new GreenfootImage("TutorialHoverButton.png");
        setImage(tutorialImage);
    }

    /**
     * Act - Check for mouse interactions with the button. Changes the button image on hover and handles click events.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage(tutorialHoverImage);
        }
        else if (Greenfoot.mouseMoved(null)) {
            setImage(tutorialImage);
        }
        if (Greenfoot.mouseClicked(this)) {
            transitionToMovieBPlayWorld();
            Greenfoot.playSound("tutorialClick.wav");
        }
    }

    /**
     * Transition to MovieBPlayWorld when the button is clicked.
     */
    public void transitionToMovieBPlayWorld()
    {
        World movieBPlayWorld =  new  MovieBPlayWorld();
        Greenfoot.setWorld(movieBPlayWorld);
    }
}
