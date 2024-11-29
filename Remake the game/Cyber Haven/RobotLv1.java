import greenfoot.Actor;  
import greenfoot.Greenfoot;  
import greenfoot.GreenfootImage;  
import greenfoot.World;  

public class RobotLv1 extends Robots {
    private final int speed = 2; // Average speed for level 1 robot

    public void act() {
        super.act(); // Inherit behavior from Robots (and Characters)
        followPlayer();
        stopAtPlatformEdge();
    }

    private void followPlayer() {
        CyrusPlayer player = (CyrusPlayer) getWorld().getObjects(CyrusPlayer.class).get(0);
        if (player != null) {
            if (getX() < player.getX()) {
                setLocation(getX() + speed, getY());
            } else if (getX() > player.getX()) {
                setLocation(getX() - speed, getY());
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
}
