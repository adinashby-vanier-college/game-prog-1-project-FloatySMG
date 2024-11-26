import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Characters extends Actor {
    protected double verticalSpeed = 0; // Gravity-affected speed
    protected boolean onGround = false; // Ground detection

    public void act() {
        applyGravity();
        checkGround();
    }

    protected void applyGravity() {
        verticalSpeed += 0.98; // Gravity strength
        setLocation(getX(), getY() + (int) verticalSpeed);
    }

    protected void checkGround() {
        onGround = false;
        if (isTouching(MovingPlatforms.class)) {
            MovingPlatforms platform = (MovingPlatforms) getOneIntersectingObject(MovingPlatforms.class);
            if (platform != null && getY() < platform.getY() - platform.getImage().getHeight() / 2) {
                onGround = true;
                verticalSpeed = 0;
                setLocation(getX(), platform.getY() - platform.getImage().getHeight() / 2 - getImage().getHeight() / 2);
            }
        }

        if (!onGround && getY() >= 600 - getImage().getHeight() / 2) { // Adjust ground level as needed
            onGround = true;
            verticalSpeed = 0;
            setLocation(getX(), 600 - getImage().getHeight() / 2);
        }
    }

    public void setVerticalSpeed(double speed) {
        this.verticalSpeed = speed;
    }
}
