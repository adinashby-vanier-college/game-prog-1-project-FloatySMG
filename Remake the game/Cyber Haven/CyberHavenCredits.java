import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CyberHavenCredits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CyberHavenCredits extends CreditsText
{
    private int actCount = 0; // To keep track of the number of acts passed

    public CyberHavenCredits() {
        getImage().setTransparency(0); // Initially, the image is fully transparent
    }

    /**
     * Act - do whatever the CyberHavenCredits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        actCount++;
        
        if (actCount > 90 && actCount <= 120) { // 1.5 seconds delay then start fade-in
            int transparency = (int) ((actCount - 90) / 30.0 * 255);
            getImage().setTransparency(transparency);
        } else if (actCount > 120) { // Ensure the image is fully opaque after fade-in
            getImage().setTransparency(255);
        }
    }
}
