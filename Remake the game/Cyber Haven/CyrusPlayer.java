import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CyrusPlayer extends Characters {
    private double jumpStrength = -12; // Adjusted jump strength to be reasonable
    private int jumpCount = 0;
    private final int maxJumps = 200; // Allow double jump
    private boolean jumpKeyPressed = false; // Track if the jump key is held down
    private int health = 100; // Player's health (adjust as needed)

    public void act() {
        super.act(); // Use common behavior from Characters
        checkKeys();
        checkLevelTransition(); // Check if the player has reached the right side of the screen
        checkRobotCollision(); // Check if touched by a robot
    }

    private void checkKeys() {
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) {
            moveLeft();
        }
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            moveRight();
        }
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")) {
            if (!jumpKeyPressed) { // Only trigger jump on initial press
                jump();
                jumpKeyPressed = true;
            }
        } else {
            jumpKeyPressed = false; // Reset when the key is released
        }
    }

    private void moveLeft() {
        setLocation(getX() - 5, getY()); // Adjust speed as needed
    }

    private void moveRight() {
        setLocation(getX() + 5, getY()); // Adjust speed as needed
    }

    private void jump() {
        if (jumpCount < maxJumps) {
            verticalSpeed = jumpStrength;
            jumpCount++;
            onGround = false;
        }
    }

    @Override
    protected void checkGroundAndWalls() {
        super.checkGroundAndWalls(); // Retain ground-check behavior
        if (onGround) {
            jumpCount = 0; // Reset jump count when on the ground
        }
    }

    // Method to handle level transitions
    private void checkLevelTransition() {
        World currentWorld = getWorld();
        int worldWidth = currentWorld.getWidth();
        int playerX = getX();
        
        // Check if the player has reached the right side of the screen
        if (playerX >= worldWidth - 1) {
            if (currentWorld instanceof WorldOneStageA) {
                Greenfoot.setWorld(new WorldOneStageB());
            } else if (currentWorld instanceof WorldOneStageB) {
                Greenfoot.setWorld(new WorldOneStageC());
            } else if (currentWorld instanceof WorldOneStageC) {
                Greenfoot.setWorld(new WorldOneStageD());
            } else if (currentWorld instanceof WorldOneStageD) {
                Greenfoot.setWorld(new StartMenu());
            } else if (currentWorld instanceof WorldTwoStageA) {
                Greenfoot.setWorld(new WorldTwoStageB());
            } else if (currentWorld instanceof WorldTwoStageB) {
                Greenfoot.setWorld(new WorldTwoStageC());
            } else if (currentWorld instanceof WorldTwoStageC) {
                Greenfoot.setWorld(new WorldTwoStageD());
            } else if (currentWorld instanceof WorldTwoStageD) {
                Greenfoot.setWorld(new WorldTwoStageE());
            } else if (currentWorld instanceof WorldTwoStageE) {
                Greenfoot.setWorld(new WorldTwoStageF());
            } else if (currentWorld instanceof WorldTwoStageF) {
                Greenfoot.setWorld(new WorldThreeStageA());
            } else if (currentWorld instanceof WorldThreeStageA) {
                Greenfoot.setWorld(new WorldThreeStageB());
            } else if (currentWorld instanceof WorldThreeStageB) {
                Greenfoot.setWorld(new WorldThreeStageC());
            } else if (currentWorld instanceof WorldThreeStageC) {
                Greenfoot.setWorld(new WorldThreeStageD());
            } else if (currentWorld instanceof WorldThreeStageD) {
                Greenfoot.setWorld(new WorldThreeStageE());
            } else if (currentWorld instanceof WorldThreeStageE) {
                Greenfoot.setWorld(new WorldThreeStageF());
            } else if (currentWorld instanceof WorldThreeStageF) {
                Greenfoot.setWorld(new MarsFinalWorld());
            }
        }
    }

    private void checkRobotCollision() {
        if (isTouching(Robots.class)) {
            resetLevel();
        }
    }

    private void resetLevel() {
        // Get the current world and reset it
        World currentWorld = getWorld();
        try {
            World newWorld = currentWorld.getClass().getConstructor().newInstance();
            Greenfoot.setWorld(newWorld); // Restart the current level
        } catch (Exception e) {
            System.out.println("Error resetting level: " + e.getMessage());
        }
    }

    // Method to reduce health when the player takes damage
    public void takeDamage(int damageAmount) {
        health -= damageAmount;
        if (health <= 0) {
            die();
        }
    }

    // Method to handle player death
    private void die() {
        // You can add death animation or reset level logic here
        resetLevel(); // Example: Reset the level if the player dies
    }
}
