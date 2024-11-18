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
        updatePhysics();
        checkForRemoval();
    }

    public void setVelocity(Vector2D newValue)
    {
        velocity = newValue;
    }

    public void updatePhysics()
    {
        FinalStage2G world = (FinalStage2G) getWorld();
        double dt = world.getTimeStepDuration();

        // Update velocity (velocity = velocity + acceleration * dt)
        Vector2D velocityVariation = Vector2D.multiply(acceleration, dt);
        velocity = Vector2D.add(velocity, velocityVariation);

        // Update position (position = position + velocity * dt)
        Vector2D positionVariation = Vector2D.multiply(velocity, dt);

        // Update actor's position in the world
        setLocation(getX() + (int) positionVariation.getX(), getY() + (int) positionVariation.getY());

        // Track time and Y-axis movement
        if (getY() == getPreviousY()) {
            timeSinceLastMovement += dt * 1000; // Time in milliseconds
        } else {
            timeSinceLastMovement = 0; // Reset timer if position changes
        }
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
