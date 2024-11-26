import greenfoot.Actor;

public class Gravity
{
    private static final double GRAVITY = 0.98; // Gravity strength

    public static double applyGravity(Actor actor, double verticalSpeed)
    {
        // Update vertical speed due to gravity
        verticalSpeed += GRAVITY;

        // Set the new location of the actor
        actor.setLocation(actor.getX(), (int)(actor.getY() + verticalSpeed));

        // Check for ground collision to stop falling (if ground level is 600 for your game resolution)
        if (actor.getY() > 600 - actor.getImage().getHeight() / 2) {
            actor.setLocation(actor.getX(), 600 - actor.getImage().getHeight() / 2);
            verticalSpeed = 0; // Reset the speed after hitting the ground
        }
        
        return verticalSpeed; // Return the updated vertical speed
    }
}
