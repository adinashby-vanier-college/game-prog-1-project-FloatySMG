import greenfoot.*;

public class RobotLv2 extends Actor {

    public void act() {
        move();
        checkPlatformCollision();
    }
    
    private void move() {
        // Add movement code here for RobotLv2
    }

    private void checkPlatformCollision() {
        Platforms platform = (Platforms) getOneIntersectingObject(Platforms.class);

        if (platform != null) {
            if (platform.isTouchingTop(this)) {
                setLocation(getX(), platform.getY() - (platform.getImage().getHeight() / 2 + getImage().getHeight() / 2));
            } else if (platform.isTouchingSide(this)) {
                // Stop horizontal movement if hitting a side
            } else if (platform.isTouchingBottom(this)) {
                // Handle hitting the bottom of the platform
            }
        }
    }
}
