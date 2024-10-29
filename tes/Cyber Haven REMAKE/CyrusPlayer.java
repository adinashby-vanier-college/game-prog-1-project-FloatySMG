import greenfoot.*;

public class CyrusPlayer extends Actor {

    private int speed = 4;          // Horizontal movement speed
    private int jumpStrength = -15; // Initial upward velocity for jumping
    private int gravity = 1;        // Gravity applied each act cycle
    private int vSpeed = 0;         // Vertical speed, used for both jumping and falling
    private boolean isJumping = false; // Track if Cyrus is mid-jump

    public void act() {
        move();
        jump();         // Call jump to check for input
        applyGravity();
        checkPlatformCollision();
    }

    private void move() {
        // Horizontal movement with left and right arrow keys
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
        }
    }

    private void applyGravity() {
        // Apply gravity if not on a platform or not jumping
        if (!isOnPlatform()) {
            vSpeed += gravity; // Increase downward speed
            setLocation(getX(), getY() + vSpeed);
        } else {
            vSpeed = 0;         // Reset vertical speed when on a platform
            isJumping = false;  // Allow jumping again when grounded
        }
    }

    private boolean isOnPlatform() {
        // Check if there's a platform right below Cyrus (1 pixel below his feet)
        Platforms platform = (Platforms) getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Platforms.class);
        return platform != null;
    }

    public void jump() {
        // Check for jump input and if Cyrus is on the ground
        if ((Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("Up")) && !isJumping && isOnPlatform()) {
            vSpeed = jumpStrength;  // Set vertical speed for jumping
            isJumping = true;       // Set jump state to prevent repeated jumps
            setLocation(getX(), getY() + vSpeed); // Apply initial jump
        }
    }

    private void checkPlatformCollision() {
        Platforms platform = (Platforms) getOneIntersectingObject(Platforms.class);

        if (platform != null) {
            if (platform.isTouchingTop(this) && vSpeed >= 0) {
                // Snap Cyrus to the top of the platform and reset vertical speed
                setLocation(getX(), platform.getY() - (platform.getImage().getHeight() / 2 + getImage().getHeight() / 2));
                vSpeed = 0;
                isJumping = false;
            } else if (platform.isTouchingSide(this)) {
                // Stop horizontal movement if hitting a side of the platform
                if (getX() < platform.getX()) {
                    setLocation(platform.getX() - platform.getImage().getWidth() / 2 - getImage().getWidth() / 2, getY());
                } else {
                    setLocation(platform.getX() + platform.getImage().getWidth() / 2 + getImage().getWidth() / 2, getY());
                }
                vSpeed = 0; // Reset vertical velocity to avoid side clipping
            } else if (platform.isTouchingBottom(this)) {
                // Bounce-off effect if Cyrus hits the platform bottom
                vSpeed = -vSpeed / 2; // Reverse direction and reduce speed for a softer bounce
            }
        }
    }
}
