import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovePartsA extends MapParts {
    private int speed = 2;              // Speed of movement (adjustable)
    private int leftBound;              // Left boundary of the platform
    private int rightBound;             // Right boundary of the platform
    private boolean movingRight = true; // Direction flag to track movement

    public MovePartsA() {
        // Constructor does not set bounds yet, we will do it in act()
    }

    public void act() {
        if (leftBound == 0 && rightBound == 0) {
            leftBound = getX() - 100;   // Move 100 pixels to the left from initial position
            rightBound = getX() + 100;  // Move 100 pixels to the right from initial position
        }
        movePlatform();
        movePlayerWithPlatform();
    }

    public void movePlatform() {
        if (movingRight) {
            setLocation(getX() + speed, getY());
            if (getX() >= rightBound) {
                movingRight = false;  // Change direction to left
            }
        } else {
            setLocation(getX() - speed, getY());
            if (getX() <= leftBound) {
                movingRight = true;  // Change direction to right
            }
        }
    }

    public void movePlayerWithPlatform() {
        CyrusPlayer player = (CyrusPlayer) getOneObjectAtOffset(0, -getImage().getHeight() / 2 - 1, CyrusPlayer.class);
        if (player != null) {
            player.setLocation(player.getX() + (movingRight ? speed : -speed), player.getY());
            player.resetJump();  // Allow jumping on the moving platform
        }
    }
}
