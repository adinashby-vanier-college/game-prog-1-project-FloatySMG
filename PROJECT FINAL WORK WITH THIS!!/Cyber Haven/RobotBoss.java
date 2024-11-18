import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A robot boss that takes damage from cannonballs and moves slightly to the right.
 */
public class RobotBoss extends Actor
{
    private int health;  // Counter for the number of hits the RobotBoss has taken
    private int originalX;  // Store the original X position for reset
    private boolean movingRight;  // Flag to indicate the direction of movement
    private int cannonBallHits;  // Counter for the number of cannonball hits
    private boolean summonedRobots;  // Flag to track if robots have been summoned

    public RobotBoss()
    {
        health = 30;  // Set initial health to 30 hits
        movingRight = true;  // Start by moving right
        cannonBallHits = 0;  // Initialize cannonball hits
        summonedRobots = false;  // Initially, robots haven't been summoned
    }

    public void addedToWorld(World world)
    {
        originalX = getX();  // Store the original position when added to the world
    }

    public void act()
    {
        // Move the robot boss slightly to the right and then back
        moveHorizontally();
        
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

        // Summon robots only the first time the RobotBoss gets hit 3 times
        if (cannonBallHits >= 3 && !summonedRobots)
        {
            summonRobots();  // Summon two RobotLv1 robots
            cannonBallHits = 0;  // Reset the cannonball hit counter
            summonedRobots = true;  // Set the flag to true to prevent further robot summons
        }
    }

    // Method to reduce health when hit by a cannonball
    private void takeDamage()
    {
        health--;  // Decrease health by 1
        cannonBallHits++;  // Increment the cannonball hit counter
    }

    // Method to handle the death of the RobotBoss
    private void die()
    {
        getWorld().removeObject(this);  // Remove the RobotBoss from the world
        // You can add additional code here to play a death animation or sound if desired
    }

    // Method to move the robot boss slightly to the right and then back to the original position
    private void moveHorizontally()
    {
        if (movingRight)
        {
            setLocation(getX() + 1, getY());  // Move to the right by 1 pixel
            if (getX() - originalX >= 110)  // If the robot has moved 50 pixels to the right
            {
                movingRight = false;  // Start moving left
            }
        }
        else
        {
            setLocation(getX() - 1, getY());  // Move back to the left by 1 pixel
            if (getX() <= originalX)  // If the robot has returned to the original position
            {
                movingRight = true;  // Start moving right again
            }
        }
    }

    // Method to summon two RobotLv1 robots
    private void summonRobots()
    {
        World world = getWorld();

        // Create and add two level 1 robots at the specified coordinates
        RobotLv1 robot1 = new RobotLv1();
        RobotLv1 robot2 = new RobotLv1();

        world.addObject(robot1, 251, 15);  // Summon first RobotLv1
        world.addObject(robot2, 315, 15);  // Summon second RobotLv1
    }
}
