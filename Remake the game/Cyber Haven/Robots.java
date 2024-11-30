import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A generic superclass for all robot characters.
 */
public class Robots extends Characters {
    protected int hitPoints;

    public void act() {
        super.act(); // Apply gravity and check ground
        checkCyrusCollision(); // Check if touched CyrusPlayer
    }
    
    public void takeDamage(int damage) {
        hitPoints -= damage;
        if (hitPoints <= 0) {
            die();
        }
    }
    
    protected void die() {
        getWorld().removeObject(this); // Remove the robot from the world
    }

    private void checkCyrusCollision() {
        if (isTouching(CyrusPlayer.class)) {
            resetLevel();
        }
    }
    
    private void resetLevel() {
        // Get the current world and reset it
        World currentWorld = getWorld();
        try {
            World newWorld = currentWorld.getClass().getConstructor().newInstance();
            Greenfoot.setWorld(newWorld); // Restart the current level
        } catch (Exception e) {
            System.out.println("Error resetting level: " + e.getMessage());
        }
    }
}
