import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsG extends CreditsText
{
    private int actCount = 0; // To keep track of the number of acts passed

    public CreditsG() {
        getImage().setTransparency(0); // Initially, the image is fully transparent
    }

    /**
     * Act - do whatever the CreditsG wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        actCount++;
        
        if (actCount > 750 && actCount <= 780) { // 12.5 seconds delay then start fade-in
            int transparency = (int) ((actCount - 750) / 30.0 * 255);
            getImage().setTransparency(transparency);
        } else if (actCount > 780) { // Ensure the image is fully opaque after fade-in
            getImage().setTransparency(255);
        }
    }
}
