import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A robot boss that takes damage from cannonballs.
 */
public class RobotBoss extends Actor
{
    private int health;  // Counter for the number of hits the RobotBoss has taken

    public RobotBoss()
    {
        health = 30;  // Set initial health to 30 hits
    }

    public void act()
    {
        // Check for collisions with cannonballs and decrease health
        CannonBall cannonBall = (CannonBall) getOneIntersectingObject(CannonBall.class);
        if (cannonBall != null)
        {
            takeDamage();  // Reduce health when hit by a cannonball
            getWorld().removeObject(cannonBall);  // Remove the cannonball after hit
        }

        // Check if the RobotBoss has died
        if (health <= 0)
        {
            die();  // Call the method to destroy the RobotBoss
        }
    }

    // Method to reduce health when hit by a cannonball
    private void takeDamage()
    {
        health--;  // Decrease health by 1
    }

    // Method to handle the death of the RobotBoss
    private void die()
    {
        getWorld().removeObject(this);  // Remove the RobotBoss from the world
        // You can add additional code here to play a death animation or sound if desired
    }
}
