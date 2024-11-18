import greenfoot.*;
import java.util.List;

public class RobotBoss extends Actor {
    private int health;
    private int originalX;
    private boolean movingRight;
    private boolean movePartsBSpawned;
    private boolean movePartsB2Spawned; // Flag for second platform spawn
    private boolean isBlinking;
    private long blinkStartTime;
    private long lastShootTime; // To track the time of the last shot
    private int hitCount; // To track how many hits the RobotBoss has taken
    private boolean robotsSummoned; // Flag to ensure robots are only summoned once

    public RobotBoss() {
        health = 30;
        movingRight = true;
        movePartsBSpawned = false;
        movePartsB2Spawned = false; // Initialize second platform spawn flag
        isBlinking = false;
        lastShootTime = 0;
        hitCount = 0; // Initialize hit count
        robotsSummoned = false; // Initialize robotsSummoned flag
    }

    public void addedToWorld(World world) {
        originalX = getX();
    }

    public void act() {
        moveHorizontally();

        CannonBall cannonBall = (CannonBall) getOneIntersectingObject(CannonBall.class);
        if (cannonBall != null) {
            takeDamage();
            getWorld().removeObject(cannonBall);
        }

        if (health <= 0) {
            die();
        }

        if (health == 25 && !movePartsBSpawned) {
            spawnMovePartsB();
            movePartsBSpawned = true;
        }

        if (health == 20 && !isBlinking) {
            startBlinking();
        }

        if (isBlinking) {
            updateBlinking();
        }

        // Only start shooting when health is 18 or less, and only shoot once every 3 seconds
        if (health <= 18) {
            shoot();
        }

        // Spawn robots only after the first 3 hits
        if (health == 27 && !robotsSummoned) {
            summonRobots();
            robotsSummoned = true; // Set the flag to true so robots are only summoned once
        }

        // At health 15 or less, shoot 1.5 times faster and spawn another MovePartsB
        if (health <= 15) {
            shootFaster();
            spawnAnotherMovePartsB(); // Ensure it only spawns once
        }
    }

    private void takeDamage() {
        health--;
        hitCount++; // Increment hit count when damage is taken
    }

    private void die() {
        getWorld().removeObject(this);
    }

    private void moveHorizontally() {
        if (movingRight) {
            setLocation(getX() + 1, getY());
            if (getX() - originalX >= 110) {
                movingRight = false;
            }
        } else {
            setLocation(getX() - 1, getY());
            if (getX() <= originalX) {
                movingRight = true;
            }
        }
    }

    private void spawnMovePartsB() {
        World world = getWorld();
        MovePartsB movePartsB = new MovePartsB();
        world.addObject(movePartsB, 504, 387);
    }

    private void spawnAnotherMovePartsB() {
        // Only spawn the second MovePartsB if it hasn't been spawned yet
        if (!movePartsB2Spawned) {
            World world = getWorld();
            MovePartsB movePartsB = new MovePartsB();
            world.addObject(movePartsB, 697, 313); // Spawn another MovePartsB at the new location
            movePartsB2Spawned = true; // Mark as spawned to prevent duplication
        }
    }

    private void startBlinking() {
        blinkStartTime = System.currentTimeMillis();
        isBlinking = true;
    }

    private void updateBlinking() {
        World world = getWorld();
        List<Final2StepA> final2StepAList = world.getObjects(Final2StepA.class);
        long elapsedTime = System.currentTimeMillis() - blinkStartTime;

        if (elapsedTime % 500 < 250) {
            for (Final2StepA final2StepA : final2StepAList) {
                GreenfootImage image = final2StepA.getImage();
                if (image.getTransparency() > 0) {
                    image.setTransparency(0);
                } else {
                    image.setTransparency(255);
                }
            }
        }

        if (elapsedTime >= 5000) {
            isBlinking = false;
            for (Final2StepA final2StepA : final2StepAList) {
                world.removeObject(final2StepA);
            }
        }
    }

    private void shoot() {
        long currentTime = System.currentTimeMillis();
        
        // Shoot every 3 seconds
        if (currentTime - lastShootTime >= 3000) {
            List<CyrusPlayer> players = getWorld().getObjects(CyrusPlayer.class);
            if (!players.isEmpty()) {
                CyrusPlayer player = players.get(0);
                BossFightBlast blast = new BossFightBlast();
                getWorld().addObject(blast, getX(), getY());
                blast.fireAtPlayer(player);
            }

            lastShootTime = currentTime; // Update last shoot time
        }
    }

    private void shootFaster() {
        long currentTime = System.currentTimeMillis();
        
        // Shoot 1.5 times faster, so every 2 seconds
        if (currentTime - lastShootTime >= 2000) {
            List<CyrusPlayer> players = getWorld().getObjects(CyrusPlayer.class);
            if (!players.isEmpty()) {
                CyrusPlayer player = players.get(0);
                BossFightBlast blast = new BossFightBlast();
                getWorld().addObject(blast, getX(), getY());
                blast.fireAtPlayer(player);
            }

            lastShootTime = currentTime; // Update last shoot time
        }
    }

    // Method to summon robots after the first 3 hits
    private void summonRobots() {
        World world = getWorld();
        RobotLv1 robotEnemy1 = new RobotLv1();
        RobotLv1 robotEnemy2 = new RobotLv1();
        world.addObject(robotEnemy1, 265, 25); // Spawn at (265, 25)
        world.addObject(robotEnemy2, 229, 25); // Spawn at (229, 25)
    }
}
