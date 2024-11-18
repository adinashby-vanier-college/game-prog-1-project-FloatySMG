import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RobotLv2 extends Actor {

    private int vSpeed = 0;        // Vertical speed for gravity
    private int gravity = 1;       // Gravity force

    private int speed = 2;         // Horizontal speed to move toward Cyrus
    private int maxCannonBallHits = 3;  // Number of hits before disappearing
    private int cannonBallHits = 0;  // Counter for cannonball hits
    
    public void act() {
        move();                // Move towards Cyrus
        applyGravity();        // Apply gravity
        checkPlatformCollision();
        checkCannonBallHits(); // Check if hit by cannonball
    }
    
    private void move() {
        // Simple AI to move towards Cyrus (horizontal movement)
        Actor cyrus = getWorld().getObjects(CyrusPlayer.class).get(0);  // Get the Cyrus player
        if (cyrus != null) {
            if (getX() < cyrus.getX()) {
                setLocation(getX() + speed, getY());
            } else if (getX() > cyrus.getX()) {
                setLocation(getX() - speed, getY());
            }
        }

        // Jumping behavior: if close to Cyrus, robot should jump to reach him
        if (Greenfoot.getRandomNumber(100) < 5 && isOnPlatform()) {  // Random jump chance
            jump();
        }
    }

    private void applyGravity() {
        if (!isOnPlatform()) {
            vSpeed += gravity;  // Apply gravity if not on a platform
            setLocation(getX(), getY() + vSpeed);  // Move vertically according to gravity
        } else {
            vSpeed = 0;  // Reset vertical speed when on a platform
        }
    }

    private boolean isOnPlatform() {
        Actor platform = getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Actor.class);
        return platform instanceof Platforms || platform instanceof MapParts;  // Check if standing on a platform or map part
    }

    private void jump() {
        vSpeed = -15;  // Set a jump force
        setLocation(getX(), getY() + vSpeed);  // Apply the jump force
    }

    private void checkPlatformCollision() {
        Actor platform = getOneIntersectingObject(Actor.class);

        if (platform != null) {
            if (platform instanceof Platforms || platform instanceof MapParts) {
                if (platform instanceof Platforms) {
                    handlePlatformCollision((Platforms) platform);
                } else if (platform instanceof MapParts) {
                    handleMapPartCollision((MapParts) platform);
                }
            }
        }
    }

    private void handlePlatformCollision(Platforms platform) {
        if (platform.isTouchingTop(this) && vSpeed >= 0) {
            setLocation(getX(), platform.getY() - (platform.getImage().getHeight() / 2 + getImage().getHeight() / 2));
            vSpeed = 0;
        } else if (platform.isTouchingSide(this)) {
            if (getX() < platform.getX()) {
                setLocation(platform.getX() - platform.getImage().getWidth() / 2 - getImage().getWidth() / 2, getY());
            } else {
                setLocation(platform.getX() + platform.getImage().getWidth() / 2 + getImage().getWidth() / 2, getY());
            }
            vSpeed = 0;
        } else if (platform.isTouchingBottom(this)) {
            vSpeed = -vSpeed / 2;
        }
    }

    private void handleMapPartCollision(MapParts mapPart) {
        if (mapPart.isTouchingTop(this) && vSpeed >= 0) {
            setLocation(getX(), mapPart.getY() - (mapPart.getImage().getHeight() / 2 + getImage().getHeight() / 2));
            vSpeed = 0;
        } else if (mapPart.isTouchingSide(this)) {
            if (getX() < mapPart.getX()) {
                setLocation(mapPart.getX() - mapPart.getImage().getWidth() / 2 - getImage().getWidth() / 2, getY());
            } else {
                setLocation(mapPart.getX() + mapPart.getImage().getWidth() / 2 + getImage().getWidth() / 2, getY());
            }
            vSpeed = 0;
        } else if (mapPart.isTouchingBottom(this)) {
            vSpeed = -vSpeed / 2;
        }
    }

    private void checkCannonBallHits() {
        CannonBall cannonBall = (CannonBall) getOneIntersectingObject(CannonBall.class);
        if (cannonBall != null) {
            cannonBallHits++;
            getWorld().removeObject(cannonBall);  // Remove the cannonball
        }
        
        if (cannonBallHits >= maxCannonBallHits) {
            vanish();  // If hit 3 times, vanish
        }
    }

    private void vanish() {
        getWorld().removeObject(this);  // Remove RobotLv2 from the world
    }
}
