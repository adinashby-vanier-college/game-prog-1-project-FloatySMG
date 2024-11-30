import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RobotLv1 extends Robots {
    private final int speed = 1; // Average speed for level 1 robot
    private final int ATTACK_RANGE = 600; // Distance within which the robot will attack

    public RobotLv1() {
        hitPoints = 1; // Level 1 robot dies in 1 hit
    }

    public void act() {
        super.act(); // Inherit behavior from Robots (and Characters)
        followPlayer();
        stopAtPlatformEdge();
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
                return; // Stop movement if at the edge
            }
        }
    }
}
