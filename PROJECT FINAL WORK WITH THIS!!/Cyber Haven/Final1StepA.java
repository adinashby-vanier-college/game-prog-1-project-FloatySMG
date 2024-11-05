import greenfoot.*;

public class Final1StepA extends Platforms {

    public Final1StepA() {
        GreenfootImage image = new GreenfootImage("Final1StepA.png"); // Load the image
        int originalWidth = image.getWidth();  // Get the original width
        int originalHeight = image.getHeight();  // Get the original height
        image.scale((int)(originalWidth * 0.6), (int)(originalHeight * 0.6)); // Scale to 60%
        setImage(image); // Set the resized image
    }
}
