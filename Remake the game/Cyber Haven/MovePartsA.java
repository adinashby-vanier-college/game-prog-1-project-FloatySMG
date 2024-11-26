import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovePartsA extends MovingPlatforms {
    private boolean movingRight = true; // Track horizontal movement direction
    private int initialX; // Initial X position
    private int initialY; // Initial Y position

    public MovePartsA(int distance) {
        super(distance); // Initialize with distance
    }

    @Override
    public void act() {
        if (initialX == 0 && initialY == 0) {
            initialX = getX(); // Store initial position when platform is first added
            initialY = getY();
        }
        movePlatform(); // Move platform horizontally
        checkForCharacters(); // Check if any characters are standing on the platform
    }

    @Override
    protected void movePlatform() {
        // Move right
        if (movingRight) {
            setLocation(getX() + moveSpeed, getY());
            if (getX() >= initialX + distance) {
                movingRight = false; // Change direction
            }
        }
        // Move left
        else {
            setLocation(getX() - moveSpeed, getY());
            if (getX() <= initialX - distance) {
                movingRight = true; // Change direction
            }
        }
    }

    private void checkForCharacters() {
        // Check if any characters are standing on the platform
        for (Actor actor : getIntersectingObjects(Characters.class)) {
            actor.setLocation(actor.getX() + moveSpeed * (movingRight ? 1 : -1), actor.getY());
        }
    }
}
