import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A superclass for characters with shared behavior such as falling and ground detection.
 */
public class Characters extends Actor {
    protected double verticalSpeed = 0; // Gravity-affected speed
    protected boolean onGround = false; // Ground detection
    /**
     * Common behavior for all characters.
     */
    public void act() {
        applyGravity();
        checkGround();
    }

    /**
     * Applies gravity to the character, causing it to fall.
     */
    protected void applyGravity() {
        verticalSpeed += 0.98; // Gravity strength
        setLocation(getX(), getY() + (int) verticalSpeed);
    }

    /**
     * Checks if the character is on the ground and adjusts accordingly.
     */
    protected void checkGround() {
        if (getY() >= 600 - getImage().getHeight() / 2) { // Adjust ground level as needed
            onGround = true;
            verticalSpeed = 0;
            setLocation(getX(), 600 - getImage().getHeight() / 2);
        } else {
            onGround = false;
        }
    }

    public void setVerticalSpeed(double speed) {
        this.verticalSpeed = speed;
    }


}
