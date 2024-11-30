import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CannonBall extends Actor {
    private Vector2D velocity;
    private Vector2D acceleration;

    private static final double GRAVITY = 4.9 * 200; // Reduced gravity effect
    private static final double MAX_SPEED = 1700.0; // Increased maximum speed
    private long timeSinceLastMovement;

    public CannonBall() {
        velocity = new Vector2D(0.0, 0.0);
        acceleration = new Vector2D(0.0, GRAVITY);
        timeSinceLastMovement = System.currentTimeMillis();
    }

    public void act() {
        updatePosition();  // Update the position of the cannonball
        checkForCollisions();
        checkForRemoval();
    }

    public void setVelocity(Vector2D newValue) {
        velocity = newValue;
    }

    private void updatePosition() {
        long currentTime = System.currentTimeMillis();
        double deltaTime = (currentTime - timeSinceLastMovement) / 1000.0;

        if (velocity.getMagnitude() > MAX_SPEED) {
            velocity.normalize();
            velocity = Vector2D.multiply(velocity, MAX_SPEED);
        }

        velocity = Vector2D.add(velocity, Vector2D.multiply(acceleration, deltaTime));

        double newX = getX() + velocity.getX() * deltaTime;
        double newY = getY() + velocity.getY() * deltaTime;

        setLocation((int) newX, (int) newY);

        timeSinceLastMovement = currentTime;
    }

    private void checkForCollisions() {
        Robots robot = (Robots) getOneIntersectingObject(Robots.class);
        if (robot != null) {
            robot.takeDamage(1); // Apply 1 damage to the robot
            getWorld().removeObject(this); // Remove the cannonball
        }
    }

    private void checkForRemoval() {
        if (System.currentTimeMillis() - timeSinceLastMovement >= 3000) {
            getWorld().removeObject(this);
        }
    }
}
