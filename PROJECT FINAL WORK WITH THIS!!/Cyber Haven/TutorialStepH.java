import greenfoot.*;

public class TutorialStepH extends Platforms {

    public TutorialStepH() {
        GreenfootImage image = new GreenfootImage("TutorialStepH.png"); // Load the image
        image.scale((int)(image.getWidth() * 1.25), (int)(image.getHeight() * 1.25)); // Scale the image by 1.5x
        setImage(image); // Set the scaled image as the actor's image
    }
}
