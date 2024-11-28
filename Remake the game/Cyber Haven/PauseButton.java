import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class PauseButton extends MenuButtons
{
    private GreenfootImage pauseImage;
    private GreenfootImage pauseHoverImage;
    
    /**
     * Constructor - Initialize the button images and sets the default image. 
     */
    public PauseButton()
    {
        pauseImage =  new  GreenfootImage("PauseButton.png"); 
        pauseHoverImage =  new  GreenfootImage("PauseHoverButton.png");
        setImage(pauseImage);
    }

    /**
     * Act - Check for mouse interactions with the button. Changes the button image on hover and handles click events.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage(pauseHoverImage);
        }
        else if (Greenfoot.mouseMoved(null)) {
            setImage(pauseImage);
        }
        if (Greenfoot.mouseClicked(this)) {
            transitionToMenu();
            //Greenfoot.playSound("startClick.wav");
        }
    }
 
    /**
     * Transition to Menu when the button is clicked.
     */
    public void transitionToMenu()
    {
        World menu =  new  Menu();
        Greenfoot.setWorld(menu);
    } 
}

