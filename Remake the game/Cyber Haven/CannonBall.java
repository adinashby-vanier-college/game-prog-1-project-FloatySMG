import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CannonBall extends Actor
{
    private Vector2D velocity;
    private Vector2D acceleration;

    private static final double GRAVITY = 4.9 * 200; // Reduced gravity effect
    private static final double MAX_SPEED = 1700.0; // Increased maximum speed
    private long timeSinceLastMovement;

    public CannonBall()
    {
        velocity = new Vector2D(0.0, 0.0);
        acceleration = new Vector2D(0.0, GRAVITY);
        timeSinceLastMovement = System.currentTimeMillis();
    }

    public void act()
    {
        updatePosition();  // Update the position of the cannonball
        checkForRemoval();
    }

    public void setVelocity(Vector2D newValue)
    {
        velocity = newValue;
    }

    private void updatePosition()
    {
        long currentTime = System.currentTimeMillis();
        double deltaTime = (currentTime - timeSinceLastMovement) / 1000.0;

        // Cap the velocity to the maximum speed
        if (velocity.getMagnitude() > MAX_SPEED)
        {
            velocity.normalize();
            velocity = Vector2D.multiply(velocity, MAX_SPEED);
        }

        // Update the velocity based on acceleration
        velocity = Vector2D.add(velocity, Vector2D.multiply(acceleration, deltaTime));

        // Update the position based on the new velocity
        double newX = getX() + velocity.getX() * deltaTime;
        double newY = getY() + velocity.getY() * deltaTime;

        setLocation((int) newX, (int) newY);

        // Reset the timer
        timeSinceLastMovement = currentTime;
    }

    // Check if the CannonBall should be removed after 3 seconds of no movement
    private void checkForRemoval()
    {
        if (System.currentTimeMillis() - timeSinceLastMovement >= 3000) // 3000 milliseconds = 3 seconds
        {
            getWorld().removeObject(this);
        }
    }
}
