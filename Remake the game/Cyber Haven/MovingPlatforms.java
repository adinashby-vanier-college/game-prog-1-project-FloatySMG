import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovingPlatforms extends MapParts
{
    protected int startX, startY;  // Starting position of the platform
    protected int distance;        // Maximum distance to move
    protected int moveSpeed = 2;   // Movement speed (customizable)

    // Constructor to initialize the distance (and starting position if needed)
    public MovingPlatforms(int distance) {
        this.distance = distance;  // Set the maximum movement distance
    }

    // The act method could be empty, since actual behavior is defined in subclasses
    public void act() {
        // Platform-specific behavior will be defined in subclasses
    }

    // Abstract movePlatform() method for movement behavior in subclasses
    protected void movePlatform() {
        // This will be overridden by subclasses
    }
}
