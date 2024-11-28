// MovePartsA.java (horizontal moving platform)
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovePartsA extends MovingPlatforms {
    private int leftBound;              // Left boundary of the platform
    private int rightBound;             // Right boundary of the platform
    private boolean movingRight = true; // Direction flag to track movement

    @Override
    public void act() {
        // Set initial boundaries when first act cycle runs
        if (leftBound == 0 && rightBound == 0) {
            leftBound = getX() - 100;   // Move 100 pixels to the left from initial position
            rightBound = getX() + 100;  // Move 100 pixels to the right from initial position
        }

        // Move platform horizontally
        movePlatform();

        // Move characters with the platform
        movePlayerWithPlatform();
    }

    public void movePlatform() {
        if (movingRight) {
            setLocation(getX() + speed, getY()); // Move right
            if (getX() >= rightBound) {
                movingRight = false;  // Change direction to left when reaching right boundary
            }
        } else {
            setLocation(getX() - speed, getY()); // Move left
            if (getX() <= leftBound) {
                movingRight = true;  // Change direction to right when reaching left boundary
            }
        }
    }

    private void movePlayerWithPlatform() {
        // Detect if a character is standing on the platform
        Characters player = (Characters) getOneObjectAtOffset(0, -getImage().getHeight() / 2 - 1, Characters.class);
        if (player != null) {
            // Move the character along with the platform
            player.setLocation(player.getX() + (movingRight ? speed : -speed), player.getY());
        }
    }
}
