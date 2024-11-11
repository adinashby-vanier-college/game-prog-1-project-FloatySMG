import greenfoot.*;

public class TutorialStepJ extends Platforms {

    public TutorialStepJ() {
        GreenfootImage image = new GreenfootImage("TutorialStepJ.png"); // Load the image
        image.scale((int)(image.getWidth() * 1.25), (int)(image.getHeight() * 1.25)); // Scale the image by 1.25x
        setImage(image); // Set the scaled image as the actor's image
    }
}
