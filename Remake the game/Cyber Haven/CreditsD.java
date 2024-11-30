import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsD extends CreditsText
{
    private int actCount = 0; // To keep track of the number of acts passed

    public CreditsD() {
        getImage().setTransparency(0); // Initially, the image is fully transparent
    }

    /**
     * Act - do whatever the CreditsD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        actCount++;
        
        if (actCount > 450 && actCount <= 480) { // 7.5 seconds delay then start fade-in
            int transparency = (int) ((actCount - 450) / 30.0 * 255);
            getImage().setTransparency(transparency);
        } else if (actCount > 480) { // Ensure the image is fully opaque after fade-in
            getImage().setTransparency(255);
        }
    }
}
