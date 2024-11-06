import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GravityBlock is a platform that descends when the player stands on it
 * and ascends when the player leaves it.
 */
public class GravityBlock extends MapParts
{
    private int originalY;  // The platform's original Y position
    private int descentSpeed = 2;  // Speed at which the platform descends
    private int ascentSpeed = 2;   // Speed at which the platform ascends
    private boolean isPlayerOnPlatform = false;  // To track if the player is on the platform
    private int worldHeight;  // Height of the world to track the floor

    // States for controlling the movement
    private boolean isDescending = false;  // Flag to track if platform is descending
    private boolean isAscending = false;   // Flag to track if platform is ascending

    /**
     * Act - do whatever the GravityBlock wants to do.
     * The platform descends when the player is standing on it, and ascends when the player leaves.
     */
    public void act()
    {
        // Set world height only once when the platform enters the world
        if (worldHeight == 0) {
            worldHeight = getWorld().getHeight();  // Get the world height
        }

        // Initialize the original Y position when the platform is first placed
        if (originalY == 0) {
            originalY = getY();  // Store the original Y position of the platform
        }

        // Check if the player is on the platform
        Actor character = getOneIntersectingObject(CyrusPlayer.class);
        if (character != null && !isPlayerOnPlatform) {
            isPlayerOnPlatform = true;
            isDescending = true;  // Start descending when the player steps on the platform
        } else if (character == null && isPlayerOnPlatform) {
            isPlayerOnPlatform = false;
            isAscending = true;   // Start ascending when the player leaves the platform
        }

        // Perform descending or ascending based on the flags
        if (isDescending) {
            descend();
        }
        if (isAscending) {
            ascend();
        }
    }

    /**
     * Descend the platform slowly when the player is standing on it.
     * The platform will descend until it reaches the bottom of the world.
     */
    private void descend() {
        // Check if the platform has reached the bottom of the world
        if (getY() < worldHeight - getImage().getHeight() / 2) {
            // Keep moving the platform down until it reaches the bottom
            setLocation(getX(), getY() + descentSpeed);  // Move the platform down
        } else {
            // Stop descending when it reaches the bottom of the world
            setLocation(getX(), worldHeight - getImage().getHeight() / 2);  // Adjust for image height
            isDescending = false;  // Stop descending once it reaches the bottom
        }
    }

    /**
     * Ascend the platform slowly when the player is no longer standing on it.
     * The platform will ascend back to its original Y position.
     */
    private void ascend() {
        // Ascend the platform back to its original position
        if (getY() > originalY) {
            // Keep moving the platform up until it reaches its original Y position
            setLocation(getX(), getY() - ascentSpeed);  // Move the platform up
        } else {
            // Stop ascending once it reaches the original position
            setLocation(getX(), originalY);
            isAscending = false;  // Stop ascending
        }
    }
}
