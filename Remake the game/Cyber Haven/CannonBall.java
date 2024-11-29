import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CannonBall extends Actor
{
    private Vector2D velocity;
    private Vector2D acceleration;

    private static final double GRAVITY = 9.8 * 200; // 200 pixels is 1 meter
    private long timeSinceLastMovement;

    public CannonBall()
    {
        velocity = new Vector2D(0.0, 0.0);
        acceleration = new Vector2D(0.0, GRAVITY);
        timeSinceLastMovement = 0;
    }

    public void act()
    {
        checkForRemoval();
    }

    public void setVelocity(Vector2D newValue)
    {
        velocity = newValue;
    }


    private double getPreviousY()
    {
        // Store previous Y value (this could be more elegant in your actual implementation)
        return getY();
    }

    // Check if the CannonBall should be removed after 3 seconds of no movement
    private void checkForRemoval()
    {
        if (timeSinceLastMovement >= 3000) // 3000 milliseconds = 3 seconds
        {
            getWorld().removeObject(this);
        }
    }
}
