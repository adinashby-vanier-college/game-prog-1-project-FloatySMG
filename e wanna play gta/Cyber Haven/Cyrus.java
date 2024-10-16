import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Cyrus extends Actor
{
    private GreenfootImage idleSprite = new GreenfootImage("CyrusStand.png");
    private GreenfootImage[] runningSprites;
    private int imgIndex;
    private int speed;
    private int sprintMod = 2;
    private int vSpeed;

    /**
     * 
     */
    public Cyrus()
    {
        setImage(idleSprite);
        imgIndex = 0;
        speed = 2;
        vSpeed = 0;
    }

    /**
     * Act - do whatever the Cyrus wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        vSpeed--;
        setLocation(getX(), getY() - vSpeed);
        jump();
        run();
    }

    /**
     * 
     */
    public void run()
    {
        TutorialWorld level = getWorldOfType(TutorialWorld.class);
        if (Greenfoot.isKeyDown("D") | Greenfoot.isKeyDown("Right")) {
            move(speed);
            if (Greenfoot.isKeyDown("shift")) {
                move(speed * sprintMod);
            }
            if (this.getX() >= level.getWidth() - 10) {
                level.setBGOffset(50);
                setLocation(0, 0);
            }
        }
        if (Greenfoot.isKeyDown("A") | Greenfoot.isKeyDown("Left")) {
            move( - speed);
            if (Greenfoot.isKeyDown("shift")) {
                move( - speed * sprintMod);
            }
        }
    }

    public void jump() {
        if (Greenfoot.isKeyDown("W") | Greenfoot.isKeyDown("Up")) {
            vSpeed = 10;
        }
    }
}
