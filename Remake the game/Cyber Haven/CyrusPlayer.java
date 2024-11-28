import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CyrusPlayer extends Characters {
    private double jumpStrength = -12; // Adjusted jump strength to be reasonable
    private int jumpCount = 0;
    private final int maxJumps = 200; // Allow double jump
    private boolean jumpKeyPressed = false; // Track if the jump key is held down

    public void act() {
        super.act(); // Use common behavior from Characters
        checkKeys();
    }

    private void checkKeys() {
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) {
            moveLeft();
        }
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            moveRight();
        }
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")) {
            if (!jumpKeyPressed) { // Only trigger jump on initial press
                jump();
                jumpKeyPressed = true;
            }
        } else {
            jumpKeyPressed = false; // Reset when the key is released
        }
    }

    private void moveLeft() {
        setLocation(getX() - 5, getY()); // Adjust speed as needed
    }

    private void moveRight() {
        setLocation(getX() + 5, getY()); // Adjust speed as needed
    }

    private void jump() {
        if (jumpCount < maxJumps) {
            verticalSpeed = jumpStrength;
            jumpCount++;
            onGround = false;
        }
    }

    @Override
    protected void checkGroundAndWalls() {
        super.checkGroundAndWalls(); // Retain ground-check behavior
        if (onGround) {
            jumpCount = 0; // Reset jump count when on the ground
        }
    }
}
