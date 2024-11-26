import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TestNPC extends Characters {
    private double verticalSpeed = 0;
    private double jumpStrength = -12; // Adjusted jump strength to be reasonable
    private boolean onGround = false;
    private int jumpCount = 0;
    private final int maxJumps = 2; // Allow double jump
    private boolean jumpKeyPressed = false; // Track if the jump key is held down

    public void act() {
        checkKeys();
        applyGravity();
        checkGround();
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

    private void applyGravity() {
        verticalSpeed += 0.98; // Gravity strength
        setLocation(getX(), getY() + (int) verticalSpeed);
    }

    private void checkGround() {
        // Check if the player is on the ground
        if (getY() >= 600 - getImage().getHeight() / 2) { // Adjust ground level
            onGround = true;
            verticalSpeed = 0;
            setLocation(getX(), 600 - getImage().getHeight() / 2);
            jumpCount = 0; // Reset jump count when on the ground
        } else {
            onGround = false;
        }
    }
}
