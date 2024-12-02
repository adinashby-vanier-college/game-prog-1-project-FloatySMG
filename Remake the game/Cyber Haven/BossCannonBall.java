import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BossCannonBall extends Actor {
    private Vector2D velocity; // velocity to control movement, you know, for those smooth cannonball actions
    private double verticalSpeed = 0; // gravity speed for when the cannonball’s falling like it’s vibing out of control

    public BossCannonBall() {
        velocity = new Vector2D(0, 0); // no speed at the start, gotta get that velocity later
    }

    public void act() {
        move(); // do the thing, move the cannonball
        applyGravity(); // add that sweet gravity effect, gotta make it feel real
        checkForCollisions(); // is it hitting anything? let’s find out
        checkForRemoval(); // gotta ditch it if it’s gone too far or hits someone
    }

    // set the cannonball's speed and direction. basically, this is its vibe.
    public void setVelocity(Vector2D newVelocity) {
        this.velocity = newVelocity; // update that direction and speed
    }

    private void move() {
        // move the cannonball using velocity. it's just doing its thing.
        setLocation(getX() + (int) velocity.getX(), getY() + (int) velocity.getY());
    }

    // gravity time! makes the cannonball fall if it’s too high, like it’s out of place.
    private void applyGravity() {
        verticalSpeed = Gravity.applyGravity(this, verticalSpeed);
    }

    private void checkForCollisions() {
        if (getWorld() == null) {
            return; // prevent further execution if the actor has been removed
        }

        CyrusPlayer player = (CyrusPlayer) getOneIntersectingObject(CyrusPlayer.class);
        if (player != null) {
            player.takeDamage(10); // adjust the damage value as needed
            getWorld().removeObject(this); // remove the cannonball after collision
        }
    }

    private void checkForRemoval() {
        if (getWorld() == null) {
            return; // prevent further execution if the actor has been removed
        }

        if (isAtEdge()) {
            getWorld().removeObject(this); // remove the cannonball if it reaches the edge
        }
    }
}
