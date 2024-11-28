import greenfoot.*;  

public class TutorialButton extends MenuButtons
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private GreenfootImage tutorialImage;
    private GreenfootImage tutorialHoverImage;

    /**
     * 
     */
    public TutorialButton()
    {
        // Initialize the button images and sets the default image.
        tutorialImage = new GreenfootImage("TutorialButton.png");
        tutorialHoverImage = new GreenfootImage("TutorialHoverButton.png");
        setImage(tutorialImage);
    }

    public void act()
    {
        // Check for mouse interactions with the button. Changes the button image on hover and handles click events.
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

    public void transitionToMovieBPlayWorld()
    {
        // Transition to MovieBPlayWorld when the button is clicked.
        World movieBPlayWorld =  new  MovieBPlayWorld();
        Greenfoot.setWorld(movieBPlayWorld);
    }
}
