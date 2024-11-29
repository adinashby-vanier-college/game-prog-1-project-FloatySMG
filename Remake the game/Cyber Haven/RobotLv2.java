import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RobotLv2 extends Robots {
    private final int speed = 3; // Faster speed for level 2 robot
    private final int ATTACK_RANGE = 800; // Distance within which the robot will attack

    public void act() {
        super.act(); // Inherit behavior from Robots (and Characters)
        followPlayer();
        stopAtPlatformEdge();
        checkCyrusCollision(); // Check if touched CyrusPlayer
    }

    private void followPlayer() {
        CyrusPlayer player = (CyrusPlayer) getWorld().getObjects(CyrusPlayer.class).get(0);
        if (player != null) {
            int distance = (int) Math.hypot(getX() - player.getX(), getY() - player.getY());
            if (distance < ATTACK_RANGE) {
                if (getX() < player.getX()) {
                    setLocation(getX() + speed, getY());
                } else if (getX() > player.getX()) {
                    setLocation(getX() - speed, getY());
                }
            }
        }
    }

    private void stopAtPlatformEdge() {
        Platform platformBelow = (Platform) getOneObjectAtOffset(0, getImage().getHeight() / 2, Platform.class);
        if (platformBelow != null) {
            int platformLeft = platformBelow.getX() - platformBelow.getImage().getWidth() / 2;
            int platformRight = platformBelow.getX() + platformBelow.getImage().getWidth() / 2;

            if (getX() - getImage().getWidth() / 2 <= platformLeft ||
                getX() + getImage().getWidth() / 2 >= platformRight) {
                // Stop movement if at the edge
                return;
            }
        }
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
