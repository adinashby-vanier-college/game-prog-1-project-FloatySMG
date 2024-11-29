import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Characters extends Actor {
    protected double verticalSpeed = 0; // Gravity-affected speed
    protected boolean onGround = false; // Ground detection
    protected final double GRAVITY = 0.98; // Gravity strength
    protected final int STEP_SIZE = 5; // Step size for collision checks

    public void act() {
        applyGravity();
        checkGroundAndWalls();
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
        onGround = false;
    
        // Check for platform collision directly below (ground check)
        Actor platformBelow = getOneObjectAtOffset(0, getImage().getHeight() / 2, MapParts.class);
    
        if (platformBelow != null) {
            int platformTop = platformBelow.getY() - platformBelow.getImage().getHeight() / 2;
            int characterBottom = getY() + getImage().getHeight() / 2;
    
            // Only treat as ground if character's bottom is slightly above the platform's top
            if (characterBottom <= platformTop + 5) { // Adjust margin as needed
                setLocation(getX(), platformTop - getImage().getHeight() / 2);
                onGround = true;
                verticalSpeed = 0; // Stop falling
                return true; // Collision detected
            }
        }
        return false; // No collision detected
    }

    protected void checkGroundAndWalls() {
        // Side collision detection (left and right movement)
        Actor platformLeft = getOneObjectAtOffset(-getImage().getWidth() / 2, 0, MapParts.class);
        Actor platformRight = getOneObjectAtOffset(getImage().getWidth() / 2, 0, MapParts.class);
        
        // Prevent falling off platforms (checking ahead of the character)
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            // Check if there is a platform ahead (right side)
            Actor platformAhead = getOneObjectAtOffset(getImage().getWidth() / 2, -getImage().getHeight() / 2, MapParts.class);
            if (platformAhead == null) {  // No platform ahead, prevent movement
                // Stop moving right if no platform is detected ahead
                setLocation(getX(), getY());
            } else if (platformRight != null) {
                // If there's a platform to the right, allow movement
                int platformLeftEdge = platformRight.getX() - platformRight.getImage().getWidth() / 2;
                int characterRightEdge = getX() + getImage().getWidth() / 2;
                if (characterRightEdge >= platformLeftEdge) {
                    setLocation(platformLeftEdge - getImage().getWidth() / 2, getY());
                }
            }
        }
    
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) {
            // Check if there is a platform ahead (left side)
            Actor platformAhead = getOneObjectAtOffset(-getImage().getWidth() / 2, -getImage().getHeight() / 2, MapParts.class);
            if (platformAhead == null) {  // No platform ahead, prevent movement
                // Stop moving left if no platform is detected ahead
                setLocation(getX(), getY());
            } else if (platformLeft != null) {
                // If there's a platform to the left, allow movement
                int platformRightEdge = platformLeft.getX() + platformLeft.getImage().getWidth() / 2;
                int characterLeftEdge = getX() - getImage().getWidth() / 2;
                if (characterLeftEdge <= platformRightEdge) {
                    setLocation(platformRightEdge + getImage().getWidth() / 2, getY());
                }
            }
        }
    }

    // Updated to allow vertical movement with gravity
    public void setVerticalSpeed(double speed) {
        this.verticalSpeed = speed;
    }
}
