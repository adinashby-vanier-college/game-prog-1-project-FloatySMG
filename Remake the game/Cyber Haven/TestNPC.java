import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TestNPC extends Characters
{
    private double verticalSpeed = 0;
    private double jumpStrength = -15; // Adjust jump strength as needed
    private boolean onGround = false;

    /**
     * Act - do whatever the TestNPC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeys();
        checkFall();
    }

    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) {
            moveLeft();
        }
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            moveRight();
        }
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")) {
            jump();
        }
    }

    private void moveLeft()
    {
        setLocation(getX() - 5, getY()); // Adjust speed as needed
    }

    private void moveRight()
    {
        setLocation(getX() + 5, getY()); // Adjust speed as needed
    }

    private void jump()
    {
        if (onGround) {
            verticalSpeed = jumpStrength;
            onGround = false;
        }
    }

    private void checkFall()
    {
        verticalSpeed = Gravity.applyGravity(this, verticalSpeed);
        
        // Check if on the ground
        if (getY() >= 600 - getImage().getHeight() / 2) { // Adjust ground level as needed
            onGround = true;
            verticalSpeed = 0;
        } else {
            onGround = false;
        }
    }
}
