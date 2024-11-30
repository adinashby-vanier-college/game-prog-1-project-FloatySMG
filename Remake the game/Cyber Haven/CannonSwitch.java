import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A switch that toggles the visibility of BounceMedium and BounceHigh.
 */
public class CannonSwitch extends Actor {
    private BounceMedium bounceMedium; // The BounceMedium object to show/hide
    private BounceHigh bounceHigh; // The BounceHigh object to show/hide
    private boolean isMediumVisible; // Tracks if the BounceMedium is visible

    public CannonSwitch(BounceMedium bounceMedium, BounceHigh bounceHigh) {
        this.bounceMedium = bounceMedium;
        this.bounceHigh = bounceHigh;
        isMediumVisible = false; // Start with BounceMedium hidden
    }

    public void act() {
        checkCannonBallHit();
    }

    private void checkCannonBallHit() {
        if (isTouching(CannonBall.class)) {
            toggleVisibility();
            removeTouching(CannonBall.class); // Remove the CannonBall after a hit
        }
    }

    private void toggleVisibility() {
        World world = getWorld();

        if (isMediumVisible) {
            world.removeObject(bounceMedium); // Hide BounceMedium
            world.addObject(bounceHigh, 287, 428); // Show BounceHigh
        } else {
            world.removeObject(bounceHigh); // Hide BounceHigh
            world.addObject(bounceMedium, 287, 428); // Show BounceMedium
        }

        isMediumVisible = !isMediumVisible; // Toggle the state
    }
}
