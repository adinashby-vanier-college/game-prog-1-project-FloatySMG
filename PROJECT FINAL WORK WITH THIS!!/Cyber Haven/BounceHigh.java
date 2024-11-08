import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * BounceHigh is a platform that makes the character jump extremely high when they touch it.
 */
public class BounceHigh extends MapParts
{
    private static final int BOUNCE_STRENGTH = -15;  // Medium bounce strength

    /**
     * Act - do whatever the BounceMedium wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor character = getOneIntersectingObject(CyrusPlayer.class);
        
        if (character != null)
        {
            CyrusPlayer player = (CyrusPlayer) character;
            if (player.getY() + player.getImage().getHeight() / 2 >= getY() - getImage().getHeight() / 2 && player.getVSpeed() >= 0)
            {
                player.bounceHigh();
            }
        }
    }
}

