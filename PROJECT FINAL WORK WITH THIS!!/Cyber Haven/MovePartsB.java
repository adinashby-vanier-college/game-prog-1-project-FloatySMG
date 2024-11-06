import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A moving platform that automatically moves left and right within a defined range.
 * 
 * @author Your Name
 * @version 1.0
 */
public class MovePartsB extends MapParts 
{
    private int speed = 2;              // Speed of movement (adjustable)
    private int leftBound;              // Left boundary of the platform
    private int rightBound;             // Right boundary of the platform
    private boolean movingRight = true; // Direction flag to track movement

    // Constructor to set up movement but not calculate bounds yet
    public MovePartsB() {
        // Constructor does not set bounds yet, we will do it in act()
    }

    // Act method to control the movement of the platform
    public void act()
    {
        // Calculate the left and right bounds based on current position (only once when first added)
        if (leftBound == 0 && rightBound == 0) {
            // Automatically set leftBound and rightBound based on the platform's initial position
            leftBound = getX() - 100;   // Move 100 pixels to the left from initial position
            rightBound = getX() + 100;  // Move 100 pixels to the right from initial position
        }

        movePlatform();
        movePlayerWithPlatform();
    }

    // Method to move the platform horizontally back and forth
    public void movePlatform() {
        if (movingRight) {
            // Move the platform to the right
            setLocation(getX() + speed, getY());

            // If the platform hits the right boundary, reverse direction
            if (getX() >= rightBound) {
                movingRight = false;  // Change direction to left
            }
        } 
        else {
            // Move the platform to the left
            setLocation(getX() - speed, getY());

            // If the platform hits the left boundary, reverse direction
            if (getX() <= leftBound) {
                movingRight = true;  // Change direction to right
            }
        }
    }

    // Method to move the player with the platform if the player is standing on it
    public void movePlayerWithPlatform() {
        // Check if the player is standing on the platform
        CyrusPlayer player = (CyrusPlayer) getOneIntersectingObject(CyrusPlayer.class);
        
        if (player != null) {
            // Move the player horizontally with the platform
            player.setLocation(player.getX() + (movingRight ? speed : -speed), player.getY());
        }
    }
}
