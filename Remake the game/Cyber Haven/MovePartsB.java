import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovePartsB extends MovingPlatforms {
    private boolean movingUp = true; // Track vertical movement direction
    private int initialX; // Initial X position
    private int initialY; // Initial Y position

    public MovePartsB(int distance) {
        super(distance); // Initialize with distance
    }

    @Override
    public void act() {
        if (initialX == 0 && initialY == 0) {
            initialX = getX(); // Store initial position when platform is first added
            initialY = getY();
        }
        movePlatform(); // Move platform vertically
        checkForCharacters(); // Check if any characters are standing on the platform
    }

    @Override
    protected void movePlatform() {
        // Move up
        if (movingUp) {
            setLocation(getX(), getY() - moveSpeed);
            if (getY() <= initialY - distance) {
                movingUp = false; // Change direction
            }
        }
        // Move down
        else {
            setLocation(getX(), getY() + moveSpeed);
            if (getY() >= initialY + distance) {
                movingUp = true; // Change direction
            }
        }
    }

    private void checkForCharacters() {
        // Check if any characters are standing on the platform
        for (Actor actor : getIntersectingObjects(Characters.class)) {
            actor.setLocation(actor.getX(), actor.getY() + moveSpeed * (movingUp ? -1 : 1));
        }
    }
}
