import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RobotBoss extends Actor
{
    private int health;
    private int originalX;
    private boolean movingRight;
    private int cannonBallHits;
    private boolean summonedRobots;
    private boolean movePartsBSpawned;
    private long blinkStartTime; // Track when the blinking should start
    private boolean isBlinking; // To toggle blinking visibility

    public RobotBoss()
    {
        health = 30;
        movingRight = true;
        cannonBallHits = 0;
        summonedRobots = false;
        movePartsBSpawned = false;
        isBlinking = false; // Initially not blinking
    }

    public void addedToWorld(World world)
    {
        originalX = getX();
    }

    public void act()
    {
        moveHorizontally();

        // Check for collisions with cannonballs and decrease health
        CannonBall cannonBall = (CannonBall) getOneIntersectingObject(CannonBall.class);
        if (cannonBall != null)
        {
            takeDamage();
            getWorld().removeObject(cannonBall);
        }

        // Check if the RobotBoss has died
        if (health <= 0)
        {
            die();
        }

        // Summon robots if the boss gets hit 3 times
        if (cannonBallHits >= 3 && !summonedRobots)
        {
            summonRobots();
            cannonBallHits = 0;
            summonedRobots = true;
        }

        // Spawn MovePartsB at 25 health
        if (health == 25 && !movePartsBSpawned)
        {
            spawnMovePartsB();
            movePartsBSpawned = true;
        }

        // Make all Final2StepA blink when health reaches 20 and continue until 8 seconds
        if (health == 20 && !isBlinking)
        {
            startBlinking();
        }

        if (isBlinking)
        {
            updateBlinking();
        }
    }

    private void takeDamage()
    {
        health--;
        cannonBallHits++;
    }

    private void die()
    {
        getWorld().removeObject(this);
    }

    private void moveHorizontally()
    {
        if (movingRight)
        {
            setLocation(getX() + 1, getY());
            if (getX() - originalX >= 110)
            {
                movingRight = false;
            }
        }
        else
        {
            setLocation(getX() - 1, getY());
            if (getX() <= originalX)
            {
                movingRight = true;
            }
        }
    }

    private void summonRobots()
    {
        World world = getWorld();
        RobotLv1 robot1 = new RobotLv1();
        RobotLv1 robot2 = new RobotLv1();

        world.addObject(robot1, 251, 15);
        world.addObject(robot2, 315, 15);
    }

    private void spawnMovePartsB()
    {
        World world = getWorld();
        MovePartsB movePartsB = new MovePartsB();
        world.addObject(movePartsB, 504, 387);
    }

    // Start the blinking effect
    private void startBlinking()
    {
        blinkStartTime = System.currentTimeMillis();
        isBlinking = true;
    }

    // Update the blinking effect
    private void updateBlinking()
    {
        // Get all the Final2StepA objects in the world
        World world = getWorld();
        java.util.List<Final2StepA> final2StepAList = world.getObjects(Final2StepA.class);

        // Toggle visibility for blinking effect
        long elapsedTime = System.currentTimeMillis() - blinkStartTime;

        // Blink every 250ms
        if (elapsedTime % 500 < 250)
        {
            for (Final2StepA final2StepA : final2StepAList)
            {
                GreenfootImage image = final2StepA.getImage();
                
                // If the image is null, create a default image
                if (image == null)
                {
                    image = new GreenfootImage(50, 50); // You can adjust the size
                    image.setColor(Color.WHITE); // Set the default color to white
                    image.fill(); // Fill with color
                    final2StepA.setImage(image);
                }
                
                // Toggle visibility based on the transparency
                if (image.getTransparency() > 0)
                {
                    image.setTransparency(0);  // Hide it
                }
                else
                {
                    image.setTransparency(255);  // Show it
                }
            }
        }

        // After 5 seconds, stop blinking and remove all Final2StepA objects
        if (elapsedTime >= 5000)
        {
            isBlinking = false;
            removeFinal2StepAObjects(world);
        }
    }

    // Remove all Final2StepA objects from the world
    private void removeFinal2StepAObjects(World world)
    {
        java.util.List<Final2StepA> final2StepAList = world.getObjects(Final2StepA.class);
        for (Final2StepA final2StepA : final2StepAList)
        {
            world.removeObject(final2StepA);
        }
    }
}
