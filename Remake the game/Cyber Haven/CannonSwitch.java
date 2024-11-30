import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A switch that toggles an object’s visibility when hit by a CannonBall.
 */
public class CannonSwitch extends MapParts {
    private Actor target; // The object to show/hide
    private boolean isTargetVisible; // Tracks if the target is visible or not

    public CannonSwitch(Actor target) {
        this.target = target; // Assign the object to control
        isTargetVisible = false; // Initially hidden
        updateTargetVisibility();
    }

    public void act() {
        checkCannonBallHit();
    }

    private void checkCannonBallHit() {
        if (isTouching(CannonBall.class)) {
            toggleTargetVisibility();
            removeTouching(CannonBall.class); // Remove the CannonBall on hit
        }
    }

    private void toggleTargetVisibility() {
        isTargetVisible = !isTargetVisible; // Toggle the visibility state
        updateTargetVisibility();
    }

    private void updateTargetVisibility() {
        if (isTargetVisible) {
            if (!getWorld().getObjects(target.getClass()).contains(target)) {
                getWorld().addObject(target, getX(), getY() + 50); // Add the target object below the switch
            }
        } else {
            getWorld().removeObject(target); // Remove the target object
        }
    }
}
