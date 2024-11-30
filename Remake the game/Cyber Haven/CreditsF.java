import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsF extends CreditsText
{
    private int actCount = 0; // To keep track of the number of acts passed

    public CreditsF() {
        getImage().setTransparency(0); // Initially, the image is fully transparent
    }

    /**
     * Act - do whatever the CreditsF wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        actCount++;
        
        if (actCount > 600 && actCount <= 630) { // 10 seconds delay then start fade-in
            int transparency = (int) ((actCount - 600) / 30.0 * 255);
            getImage().setTransparency(transparency);
        } else if (actCount > 630) { // Ensure the image is fully opaque after fade-in
            getImage().setTransparency(255);
        }
    }
}
