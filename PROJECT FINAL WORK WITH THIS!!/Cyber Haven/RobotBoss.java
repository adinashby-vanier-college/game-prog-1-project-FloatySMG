import greenfoot.*;
import java.util.List;

public class RobotBoss extends Actor {
    private int health;
    private int originalX;
    private boolean movingRight;
    private boolean movePartsBSpawned;
    private boolean movePartsB2Spawned; 
    private boolean isBlinking;
    private long blinkStartTime;
    private long lastShootTime; 
    private boolean robotsSummoned; 
    private boolean finalStageTriggered; 
    private boolean finalRemovalTriggered; // New flag for health 6 behavior

    public RobotBoss() {
        health = 30;
        movingRight = true;
        movePartsBSpawned = false;
        movePartsB2Spawned = false; 
        isBlinking = false;
        lastShootTime = 0;
        robotsSummoned = false; 
        finalStageTriggered = false; 
        finalRemovalTriggered = false; // Initialize the new flag
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

        if (health <= 18) {
            shoot();
        }

        if (health == 27 && !robotsSummoned) {
            summonRobots();
            robotsSummoned = true;
        }

        if (health <= 15) {
            shootFaster();
            spawnAnotherMovePartsB(); 
        }

        if (health == 10 && !finalStageTriggered) {
            spawnFinalStageElements();
            finalStageTriggered = true; 
        }

        if (health == 6 && !finalRemovalTriggered) {
            startMovePartsBRemoval(); 
            shootEvenFaster(); 
            finalRemovalTriggered = true; 
        }
    }

    private void takeDamage() {
        health--;
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
        if (!movePartsB2Spawned) {
            World world = getWorld();
            MovePartsB movePartsB = new MovePartsB();
            world.addObject(movePartsB, 697, 313);
            movePartsB2Spawned = true;
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
        if (currentTime - lastShootTime >= 3000) {
            fireBlast();
            lastShootTime = currentTime;
        }
    }

    private void shootFaster() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastShootTime >= 2000) {
            fireBlast();
            lastShootTime = currentTime;
        }
    }

    private void shootEvenFaster() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastShootTime >= 50) {
            fireBlast();
            lastShootTime = currentTime;
        }
    }

    private void fireBlast() {
        List<CyrusPlayer> players = getWorld().getObjects(CyrusPlayer.class);
        if (!players.isEmpty()) {
            CyrusPlayer player = players.get(0);
            BossFightBlast blast = new BossFightBlast();
            getWorld().addObject(blast, getX(), getY());
            blast.fireAtPlayer(player);
        }
    }

    private void summonRobots() {
        World world = getWorld();
        RobotLv1 robotEnemy1 = new RobotLv1();
        RobotLv1 robotEnemy2 = new RobotLv1();
        world.addObject(robotEnemy1, 265, 25);
        world.addObject(robotEnemy2, 229, 25);
    }

    private void spawnFinalStageElements() {
        World world = getWorld();
        Final2StepB platform1 = new Final2StepB();
        Final2StepB platform2 = new Final2StepB();
        Final2StepB platform3 = new Final2StepB();

        world.addObject(platform1, 1181, 379);
        world.addObject(platform2, 1010, 379);
        world.addObject(platform3, 846, 379);

        RobotLv2 robot1 = new RobotLv2();
        world.addObject(robot1, 1266, 31);
    }

    private void startMovePartsBRemoval() {
        World world = getWorld();
        List<MovePartsB> movePartsBList = world.getObjects(MovePartsB.class);

        new Thread(() -> {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 3000) {
                for (MovePartsB part : movePartsBList) {
                    GreenfootImage image = part.getImage();
                    image.setTransparency(image.getTransparency() > 0 ? 0 : 255);
                }
                Greenfoot.delay(15);
            }

            for (MovePartsB part : movePartsBList) {
                world.removeObject(part);
            }
        }).start();
    }
}
