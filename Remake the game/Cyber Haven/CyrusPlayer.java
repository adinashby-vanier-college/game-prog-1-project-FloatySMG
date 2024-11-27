import greenfoot.*;  // (World, Actor, GreenfootImage, and MouseInfo)

public class CyrusPlayer extends Characters {
    private double jumpStrength = -12; // Adjusted jump strength to be reasonable
    private int jumpCount = 0;
    private final int maxJumps = 2; // Allow double jump
    private boolean jumpKeyPressed = false; // Track if the jump key is held down

    public void act() {
        super.act(); // Use common behavior from Characters (gravity and fall check)
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
        if (jumpCount < maxJumps || onGround) {
            verticalSpeed = jumpStrength;
            jumpCount++;
            onGround = false;
        }
    }

    @Override
    protected void checkGroundAndWalls() {
        super.checkGroundAndWalls(); // Retain ground-check behavior from Characters
        if (onGround) {
            jumpCount = 0; // Reset jump count when on the ground
        }
    }

    @Override
    protected boolean checkGroundCollision() {
        onGround = false;
        Actor platformBelow = getOneObjectAtOffset(0, getImage().getHeight() / 2, Platforms.class);
        if (platformBelow != null && verticalSpeed >= 0) {
            int platformTop = platformBelow.getY() - platformBelow.getImage().getHeight() / 2;
            int characterBottom = getY() + getImage().getHeight() / 2;
            if (characterBottom <= platformTop + 5) {
                setLocation(getX(), platformTop - getImage().getHeight() / 2);
                onGround = true;
                verticalSpeed = 0;
                jumpCount = 0;
                return true;
            }
        }
        return false;
    }

    @Override
    protected void checkMovingPlatform() {
        Actor movingPlatform = getOneObjectAtOffset(0, getImage().getHeight() / 2, MovingPlatforms.class);
        if (movingPlatform != null && verticalSpeed >= 0) {
            MovingPlatforms platform = (MovingPlatforms) movingPlatform;
            int platformTop = platform.getY() - platform.getImage().getHeight() / 2;
            int characterBottom = getY() + getImage().getHeight() / 2;
            if (characterBottom <= platformTop + 5) {
                setLocation(getX(), platformTop - getImage().getHeight() / 2);
                onGround = true;
                verticalSpeed = 0;
                jumpCount = 0;

                // Move the character with the platform horizontally
                setLocation(getX() + platform.getXSpeed(), getY());
            }
        }
    }
}
