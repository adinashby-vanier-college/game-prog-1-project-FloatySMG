import greenfoot.*;  // (World, Actor, GreenfootImage, and MouseInfo)

public class Characters extends Actor {
    protected double verticalSpeed = 0; // Gravity-affected speed
    protected boolean onGround = false; // Ground detection
    protected final double GRAVITY = 0.98; // Gravity strength
    protected final int STEP_SIZE = 5; // Step size for collision checks

    public void act() {
        applyGravity();
        checkGroundAndWalls();
        checkMovingPlatform();
    }

    protected void applyGravity() {
        verticalSpeed += GRAVITY; // Apply gravity
        // Move step by step to avoid skipping collisions
        int steps = (int) Math.ceil(Math.abs(verticalSpeed) / STEP_SIZE);
        for (int i = 0; i < steps; i++) {
            int moveY = (int) Math.signum(verticalSpeed) * Math.min(STEP_SIZE, Math.abs((int) verticalSpeed));
            setLocation(getX(), getY() + moveY);
            if (checkGroundCollision()) {
                break; // Stop falling when ground is detected
            }
        }
    }

    protected boolean checkGroundCollision() {
        // Reset onGround initially
        onGround = false;

        // Check for platform collision directly below (ground check)
        Actor platformBelow = getOneObjectAtOffset(0, getImage().getHeight() / 2, Platforms.class);
        if (platformBelow != null && verticalSpeed >= 0) { // Only stand if falling downward
            int platformTop = platformBelow.getY() - platformBelow.getImage().getHeight() / 2;
            int characterBottom = getY() + getImage().getHeight() / 2;

            // Only treat as ground if character's bottom is slightly above the platform's top
            if (characterBottom <= platformTop + 5) { // Adjust margin as needed
                // Adjust position to the top of the platform
                setLocation(getX(), platformTop - getImage().getHeight() / 2);
                onGround = true;
                verticalSpeed = 0;
                return true; // Collision detected
            }
        }
        return false; // No collision detected
    }

    protected void checkGroundAndWalls() {
        // Side collision detection
        Actor platformLeft = getOneObjectAtOffset(-getImage().getWidth() / 2, 0, Platforms.class);
        Actor platformRight = getOneObjectAtOffset(getImage().getWidth() / 2, 0, Platforms.class);

        if (platformLeft != null) {
            // Prevent moving into the platform from the left
            int platformRightEdge = platformLeft.getX() + platformLeft.getImage().getWidth() / 2;
            int characterLeftEdge = getX() - getImage().getWidth() / 2;

            if (characterLeftEdge <= platformRightEdge) {
                setLocation(platformRightEdge + getImage().getWidth() / 2, getY());
            }
        } else if (platformRight != null) {
            // Prevent moving into the platform from the right
            int platformLeftEdge = platformRight.getX() - platformRight.getImage().getWidth() / 2;
            int characterRightEdge = getX() + getImage().getWidth() / 2;

            if (characterRightEdge >= platformLeftEdge) {
                setLocation(platformLeftEdge - getImage().getWidth() / 2, getY());
            }
        }
    }

    // Updated to allow platform horizontal movement
    public void setVerticalSpeed(double speed) {
        this.verticalSpeed = speed;
    }

    protected void checkMovingPlatform() {
        Actor movingPlatform = getOneObjectAtOffset(0, getImage().getHeight() / 2, MovingPlatforms.class);
        if (movingPlatform != null && verticalSpeed >= 0) { // Only stand if falling downward
            MovingPlatforms platform = (MovingPlatforms) movingPlatform;
            int platformTop = platform.getY() - platform.getImage().getHeight() / 2;
            int characterBottom = getY() + getImage().getHeight() / 2;
            if (characterBottom <= platformTop + 5) { // Adjust margin as needed
                setLocation(getX(), platformTop - getImage().getHeight() / 2);
                onGround = true;
                verticalSpeed = 0;

                // Move the character with the platform horizontally
                setLocation(getX() + platform.getXSpeed(), getY());
            }
        }
    }
}
