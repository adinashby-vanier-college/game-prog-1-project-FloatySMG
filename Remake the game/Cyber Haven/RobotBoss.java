import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RobotBoss extends Robots {
    private boolean hasSpawnedMovePartsB = false; // Track if MovePartsB has been spawned
    private int cannonBallCooldown = 0; // Used to prevent shooting too many cannonballs at once

    public RobotBoss() {
        hitPoints = 35; // Set the initial health of the RobotBoss
    }

    public void act() {
        super.act(); // Inherit behavior from Robots (and Characters)
        checkHealthActions();
    }

    private void checkHealthActions() {
        // When health is between 30 and 27, shoot cannonballs
        if (hitPoints <= 30 && hitPoints > 27 && cannonBallCooldown <= 0) {
            shootBossCannonBall();
            cannonBallCooldown = 60; // Increase the cooldown to shoot every 2 seconds (adjust as needed)
        } else if (hitPoints <= 27 && !hasSpawnedMovePartsB) {
            spawnMovePartsB();
        }

        // Decrease cooldown each act cycle
        if (cannonBallCooldown > 0) {
            cannonBallCooldown--;
        }
    }

    private void shootBossCannonBall() {
        // Shoot a BossCannonBall towards the player
        BossCannonBall cannonBall = new BossCannonBall();
        getWorld().addObject(cannonBall, getX(), getY()); // Add BossCannonBall at RobotBoss's location

        // Calculate velocity towards CyrusPlayer
        CyrusPlayer player = (CyrusPlayer) getWorld().getObjects(CyrusPlayer.class).get(0);
        Vector2D velocity = new Vector2D(player.getX() - getX(), player.getY() - getY());
        velocity.normalize(); // Normalize the vector to unit length

        // Adjust the speed of the cannonball (multiply the velocity by a moderate factor)
        velocity = Vector2D.multiply(velocity, 150); // Adjust the speed of the cannonball (moderate speed)

        // Apply the calculated velocity to the cannonball
        cannonBall.setVelocity(velocity);

        // Space out the cannonballs a bit to prevent overlap
        // Offset the initial velocity by a small amount each time
        velocity.setX(velocity.getX() + 5); // Slight horizontal offset for next shot
    }

    private void spawnMovePartsB() {
        // Spawn MovePartsB at the specified coordinates
        MovePartsB movePartsB = new MovePartsB();
        getWorld().addObject(movePartsB, 510, 395);
        hasSpawnedMovePartsB = true; // Ensure it spawns only once
    }
}
