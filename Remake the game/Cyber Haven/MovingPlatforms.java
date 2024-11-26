import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovingPlatforms extends MapParts {
    protected int startX, startY; // Starting position of the platform
    protected int distance; // Maximum distance to move
    protected int moveSpeed = 2; // Movement speed (customizable)
    protected boolean movingRight = true; // For horizontal movement
    protected boolean movingUp = true; // For vertical movement

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
        // To be overridden in subclasses
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
