import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BouncePlatform extends MapParts {
    // Define a protected variable to control bounce strength
    protected double bounceStrength = -15;  // Default bounce strength

    public BouncePlatform() {
        // Constructor can be used for initialization, if needed
    }

    public void act() {
        // Check if a Character (e.g., CyrusPlayer) is touching this platform
        Actor character = getOneIntersectingObject(Characters.class);
        
        if (character != null) {
            Characters player = (Characters) character;
            
            // If the player is standing on top of the platform and moving down
            if (player.getY() + player.getImage().getHeight() / 2 >= getY() - getImage().getHeight() / 2 && player.verticalSpeed >= 0) {
                // Apply the bounce
                player.setVerticalSpeed(bounceStrength);  // Use the correct setter method
                player.setLocation(player.getX(), getY() - getImage().getHeight() / 2 - player.getImage().getHeight() / 2);
            }
        }
    }
}
