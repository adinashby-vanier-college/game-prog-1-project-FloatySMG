import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovingPlatforms extends MapParts {
    protected int startX, startY; // Starting position of the platform
    protected int distance; // Maximum distance to move
    protected int moveSpeed = 2; // Movement speed (customizable)
    protected boolean movingRight = true; // For horizontal movement
    private int currentXSpeed = 0; // To track horizontal movement speed

    public MovingPlatforms(int distance) {
        this.distance = distance;
    }

    public void addedToWorld(World world) {
        startX = getX();
        startY = getY();
    }

    public void act() {
        movePlatform();  // Move the platform based on direction and distance
        checkForCharacters();  // Check if characters are on the platform and move them accordingly
    }

    protected void movePlatform() {
        // Horizontal movement
        if (movingRight) {
            setLocation(getX() + moveSpeed, getY());
            if (getX() >= startX + distance) {
                movingRight = false; // Change direction
            }
        } else {
            setLocation(getX() - moveSpeed, getY());
            if (getX() <= startX) {
                movingRight = true; // Change direction
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

            // Check if the character is standing on top of the platform
            if (isCharacterOnTop(character)) {
                // If the character is on top of the platform, move it with the platform horizontally
                character.setLocation(character.getX() + (movingRight ? moveSpeed : -moveSpeed), character.getY());
                character.setVerticalSpeed(0);  // Prevent falling if the player is on the platform
                if (!character.onGround) {
                    character.onGround = true;  // Mark the player as on the platform
                }
            }
        }
    }
}
