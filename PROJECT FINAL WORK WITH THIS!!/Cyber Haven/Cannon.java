import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A cannon that fires cannonballs and spins to face the mouse.
 */
public class Cannon extends Actor
{
    private static final double CANNON_BALL_VELOCITY = 2500.0;  // Speed of the cannonball
    private long lastShotTime;  // Time of the last shot
    private static final long COOLDOWN_TIME = 1000;  // 1000 milliseconds = 1 second cooldown

    public Cannon()
    {
        lastShotTime = System.currentTimeMillis(); // Initialize with current time
        
        // Load and scale the cannon image
        GreenfootImage cannonImage = new GreenfootImage("BossCannon.png");
        cannonImage.scale((int)(cannonImage.getWidth() * 0.5), (int)(cannonImage.getHeight() * 0.5));
        setImage(cannonImage);  // Set the scaled image to the cannon
    }

    public void act()
    {
        followPlayer();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null)
        {
            // Create a vector pointing from the cannon to the mouse position
            Vector2D direction = new Vector2D(mouse.getX() - getX(), mouse.getY() - getY());
            alignWithVector(direction);  // Rotate the cannon to align with the mouse

            // Fire when the mouse is clicked and enough time has passed
            if (Greenfoot.mouseClicked(null) && canShoot())
            {
                fireCannonBall(direction);  // Fire the cannonball
            }
        }
    }

    // Method to rotate the cannon to align with a given vector
    private void alignWithVector(Vector2D vector)
    {
        double angle = Math.toDegrees(Math.atan2(vector.getY(), vector.getX()));
        setRotation((int) angle);  // Rotate the cannon to face the direction
    }

    // Method to check if enough time has passed for shooting
    private boolean canShoot()
    {
        long currentTime = System.currentTimeMillis();
        return (currentTime - lastShotTime) >= COOLDOWN_TIME;  // Only allow shooting if cooldown has passed
    }

    // Method to fire a cannonball
    private void fireCannonBall(Vector2D direction)
    {
        direction.normalize();  // Normalize the direction
        direction = Vector2D.multiply(direction, CANNON_BALL_VELOCITY);  // Scale to the cannonball speed

        // Create and fire the cannonball
        CannonBall cannonBall = new CannonBall();
        cannonBall.setVelocity(direction);
        getWorld().addObject(cannonBall, getX(), getY());

        // Update the last shot time
        lastShotTime = System.currentTimeMillis();
    }

    // Method to make the cannon follow the player
    public void followPlayer()
    {
        CyrusPlayer player = (CyrusPlayer) getWorld().getObjects(CyrusPlayer.class).get(0); // Get the player object
        if (player != null) {
            // Make the cannon follow the player with a slight offset
            setLocation(player.getX() + 30, player.getY());  // Change 30 to adjust the distance
        }
    }
}
