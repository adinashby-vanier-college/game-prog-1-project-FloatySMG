import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelThreeStepE here.
 * 
 * @author 
 * @version 
 */
public class LevelThreeStepE extends LevelThree {
    public LevelThreeStepE() {
        scaleImage(); // Scale the image when the object is created
    }

    /**
     * Act - do whatever the LevelThreeStepE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
    }

    private void scaleImage() {
        GreenfootImage img = getImage(); // Get the current image
        int newWidth = (int) (img.getWidth() * 1.12); // Scale width by 1.5
        int newHeight = (int) (img.getHeight() * 1.12); // Scale height by 1.5
        img.scale(newWidth, newHeight); // Apply the scaling
    }
}
