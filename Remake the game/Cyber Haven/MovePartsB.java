import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovePartsB extends MovingPlatforms {
    private int direction = 1; // 1 = down, -1 = up
    private int topBoundary = 100; // top
    private int bottomBoundary = 500; // bottom

    @Override
    public void act() {
        // move vertical
        if (getY() >= bottomBoundary || getY() <= topBoundary) {
            direction *= -1; // reverse
        }
        // move vertical
        movePlatform(0, speed * direction); // vertical
        checkIfCharacterIsOnTop();
    }

    private void checkIfCharacterIsOnTop() {
        // check is player is on
        for (Object obj : getWorld().getObjects(Characters.class)) {
            Characters character = (Characters) obj;
            if (isCharacterOnTop(character)) {
                // update character location
                character.setLocation(character.getX(), getY());
            }
        }
    }
}
