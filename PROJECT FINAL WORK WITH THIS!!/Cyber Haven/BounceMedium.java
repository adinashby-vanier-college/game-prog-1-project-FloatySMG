import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BounceMedium extends MapParts {
    public BounceMedium() {
        setImage("BounceMedium.png");  // Make sure the image is in your images folder
    }

    public void act() {
        // No specific action needed here, just stand as a platform.
    }

    // This method will apply the bounce effect when a player steps on it
    public void applyBounceEffect(CyrusPlayer player) {
        player.applyBounce(10);  // Apply a bounce force of 10 (you can adjust this value)
    }
}
