import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class DeathZone extends Actor {
    public DeathZone() {
        // Set the size to 1800x100 and make it invisible
        GreenfootImage img = new GreenfootImage(1800, 100);
        img.setTransparency(0); // Invisible
        setImage(img);
    }

    public void act() {
        checkForDeath();
    }

    private void checkForDeath() {
        // Check if CyrusPlayer or any character is touching the DeathZone
        if (isTouching(CyrusPlayer.class)) {
            resetLevel();
        } else if (isTouching(Characters.class)) {
            removeTouching(Characters.class);
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
