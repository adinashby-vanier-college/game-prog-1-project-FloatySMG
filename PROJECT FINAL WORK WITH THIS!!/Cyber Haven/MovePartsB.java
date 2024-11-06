import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A moving platform that automatically moves up and down within a defined range.
 * 
 * @author Your Name
 * @version 1.0
 */
public class MovePartsB extends MapParts 
{
    private int speed = 2;              // Speed of movement (adjustable)
    private int topBound;               // Top boundary of the platform
    private int bottomBound;            // Bottom boundary of the platform
    private boolean movingUp = true;    // Direction flag to track vertical movement

    // Constructor to set up movement but not calculate bounds yet
    public MovePartsB() {
        // Constructor does not set bounds yet, we will do it in act()
    }

    // Act method to control the movement of the platform
    public void act()
    {
        // Calculate the top and bottom bounds based on current position (only once when first added)
        if (topBound == 0 && bottomBound == 0) {
            // Automatically set topBound and bottomBound based on the platform's initial position
            topBound = getY() - 100;   // Move 100 pixels up from initial position
            bottomBound = getY() + 100;  // Move 100 pixels down from initial position
        }

        movePlatform();
        movePlayerWithPlatform();
    }

    // Method to move the platform vertically up and down
    public void movePlatform() {
        if (movingUp) {
            // Move the platform upwards
            setLocation(getX(), getY() - speed);

            // If the platform hits the top boundary, reverse direction
            if (getY() <= topBound) {
                movingUp = false;  // Change direction to down
            }
        } 
        else {
            // Move the platform downwards
            setLocation(getX(), getY() + speed);

            // If the platform hits the bottom boundary, reverse direction
            if (getY() >= bottomBound) {
                movingUp = true;  // Change direction to up
            }
        }
    }

    // Method to move the player with the platform if the player is standing on it
    public void movePlayerWithPlatform() {
        // Check if the player is standing on the platform
        CyrusPlayer player = (CyrusPlayer) getOneIntersectingObject(CyrusPlayer.class);
        
        if (player != null) {
            // Move the player vertically with the platform
            player.setLocation(player.getX(), player.getY() + (movingUp ? -speed : speed));
        }
    }
}
