import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A generic superclass for all robot characters.
 */
public class Robots extends Characters {
    public void act() {
        super.act(); // Apply gravity and check ground
        checkCyrusCollision(); // Check if touched CyrusPlayer
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
