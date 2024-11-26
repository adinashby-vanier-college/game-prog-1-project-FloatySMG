import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovePartsB extends MapParts {
    private int speed = 2;              // Speed of movement (adjustable)
    private int topBound;               // Top boundary of the platform
    private int bottomBound;            // Bottom boundary of the platform
    private boolean movingUp = true;    // Direction flag to track vertical movement

    public MovePartsB() {
        // Constructor does not set bounds yet, we will do it in act()
    }

    public void act() {
        if (topBound == 0 && bottomBound == 0) {
            topBound = getY() - 100;   // Move 100 pixels up from initial position
            bottomBound = getY() + 100;  // Move 100 pixels down from initial position
        }
        movePlatform();
        movePlayerWithPlatform();
    }

    public void movePlatform() {
        if (movingUp) {
            setLocation(getX(), getY() - speed);
            if (getY() <= topBound) {
                movingUp = false;  // Change direction to down
            }
        } else {
            setLocation(getX(), getY() + speed);
            if (getY() >= bottomBound) {
                movingUp = true;  // Change direction to up
            }
        }
    }

    public void movePlayerWithPlatform() {
        CyrusPlayer player = (CyrusPlayer) getOneObjectAtOffset(0, -getImage().getHeight() / 2 - 1, CyrusPlayer.class);
        if (player != null) {
            player.setLocation(player.getX(), player.getY() + (movingUp ? -speed : speed));
            player.resetJump();  // Allow jumping on the moving platform
        }
    }
}
