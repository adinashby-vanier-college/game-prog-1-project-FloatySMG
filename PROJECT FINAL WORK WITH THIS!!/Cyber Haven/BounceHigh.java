import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * BounceHigh is a platform that makes the character jump extremely high when they touch it.
 */
public class BounceHigh extends MapParts
{
    /**
     * Act - do whatever the BounceHigh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Check if the character is touching the platform
        Actor character = getOneIntersectingObject(CyrusPlayer.class);
        
        // If the character is touching the platform
        if (character != null)
        {
            CyrusPlayer player = (CyrusPlayer) character;

            // Check if the player is below the platform (and moving downward or standing still)
            if (player.getY() + player.getImage().getHeight() / 2 >= getY() - getImage().getHeight() / 2 && player.getVSpeed() >= 0)
            {
                // Trigger the bounce by calling the bounce() method
                player.bounce();
            }
        }
    }
}
