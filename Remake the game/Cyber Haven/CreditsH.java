import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsH extends CreditsText
{
    private int actCount = 0; // To keep track of the number of acts passed

    public CreditsH() {
        getImage().setTransparency(0); // Initially, the image is fully transparent
    }

    /**
     * Act - do whatever the CreditsH wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        actCount++;
        
        if (actCount > 840 && actCount <= 870) { // 14 seconds delay then start fade-in
            int transparency = (int) ((actCount - 840) / 30.0 * 255);
            getImage().setTransparency(transparency);
        } else if (actCount > 870) { // Ensure the image is fully opaque after fade-in
            getImage().setTransparency(255);
        }
    }
}
