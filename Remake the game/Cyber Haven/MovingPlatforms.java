import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovingPlatforms extends MapParts {
    protected int speed = 2; //default speed

    public void act() {
        
    }

    //update position
    protected void movePlatform(int dx, int dy) {
        setLocation(getX() + dx, getY() + dy);
    }
}
