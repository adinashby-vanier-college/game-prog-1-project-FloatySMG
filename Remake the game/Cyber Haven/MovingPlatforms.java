import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovingPlatforms extends MapParts {
    protected int startX, startY; // Starting position of the platform
    protected int distance; // Maximum distance to move
    protected int moveSpeed = 2; // Movement speed (customizable)
    protected boolean movingRight = true; // For horizontal movement
    protected boolean movingUp = true; // For vertical movement
    private int currentXSpeed = 0; // To track horizontal movement speed

    public MovingPlatforms(int distance) {
        this.distance = distance;
    }

    public void addedToWorld(World world) {
        startX = getX();
        startY = getY();
    }

    public void act() {
        movePlatform();
        checkForCharacters();
    }

    protected void movePlatform() {
        // Horizontal movement
        if (movingRight) {
            setLocation(getX() + moveSpeed, getY());
            if (getX() >= startX + distance) {
                movingRight = false;
            }
        } else {
            setLocation(getX() - moveSpeed, getY());
            if (getX() <= startX) {
                movingRight = true;
            }
        }

        // Set the horizontal speed for the platform
        currentXSpeed = movingRight ? moveSpeed : -moveSpeed;
    }

    // Function to get the platform's horizontal movement speed
    public int getXSpeed() {
        return currentXSpeed;
    }

    private void checkForCharacters() {
        for (Object obj : getObjectsInRange(getImage().getWidth() / 2, Characters.class)) {
            Characters character = (Characters) obj;
            if (character.getY() >= getY() - getImage().getHeight() / 2
                && character.getY() <= getY() + getImage().getHeight() / 2) {
                // If the character is standing on the platform, move it with the platform
                character.setLocation(character.getX() + (movingRight ? moveSpeed : -moveSpeed), character.getY());
            }
        }
    }
}
