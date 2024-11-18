import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.geom.Point2D; // Import Point2D from java.awt.geom

public class CannonBall extends Actor
{
    private Point2D position;
    private Vector2D velocity;
    private Vector2D acceleration;

    private static final double GRAVITY = 9.8 * 200; // 200 pixels is 1 meter
    private double previousY;
    private long timeSinceLastMovement;

    public CannonBall()
    {
        // Initialize position with a default value, such as (0, 0)
        position = new Point2D.Double(0, 0); // Use java.awt.geom.Point2D
        velocity = new Vector2D(0.0, 0.0);
        acceleration = new Vector2D(0.0, GRAVITY);
        previousY = 0;
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
        if (position.getX() == 0 && position.getY() == 0)
        {
            // Only update position after the actor has been placed in the world
            position.setLocation(getX(), getY());
        }

        FinalStage2G world = (FinalStage2G) getWorld();
        double dt = world.getTimeStepDuration();

        // Update velocity (velocity = velocity + acceleration * dt)
        Vector2D velocityVariation = Vector2D.multiply(acceleration, dt);
        velocity = Vector2D.add(velocity, velocityVariation);

        // Update position (position = position + velocity * dt)
        Vector2D positionVariation = Vector2D.multiply(velocity, dt);

        // Add the positionVariation to the current position manually
        position.setLocation(position.getX() + positionVariation.getX(), position.getY() + positionVariation.getY());

        // Update actor's position in the world
        setLocation((int) position.getX(), (int) position.getY());

        // Track time and Y-axis movement
        if (getY() == previousY) {
            timeSinceLastMovement += dt * 1000; // Time in milliseconds
        } else {
            timeSinceLastMovement = 0; // Reset timer if position changes
        }
        previousY = getY();
    }

    // Check if the CannonBall should be removed after 3 seconds of no movement
    private void checkForRemoval()
    {
        if (timeSinceLastMovement >= 1500) // 3000 milliseconds = 3 seconds
        {
            getWorld().removeObject(this);
        }
    }
}
