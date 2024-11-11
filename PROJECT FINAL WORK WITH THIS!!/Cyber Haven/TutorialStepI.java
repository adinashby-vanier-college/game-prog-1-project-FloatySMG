import greenfoot.*;

public class TutorialStepI extends Platforms {

    public TutorialStepI() {
        GreenfootImage image = new GreenfootImage("TutorialStepI.png"); // Load the image
        image.scale((int)(image.getWidth() * 1.25), (int)(image.getHeight() * 1.25)); // Scale the image by 1.25x
        setImage(image); // Set the scaled image as the actor's image
    }
}
