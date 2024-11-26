import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BounceHigh extends MapParts {
    private static final int BOUNCE_STRENGTH = 22;  // Adjusted bounce strength

    public void act() {
        Actor character = getOneIntersectingObject(CyrusPlayer.class);
        
        if (character != null) {
            CyrusPlayer player = (CyrusPlayer) character;
            if (player.getY() + player.getImage().getHeight() / 2 >= getY() - getImage().getHeight() / 2 && player.getVSpeed() >= 0) {
                player.bounce(BOUNCE_STRENGTH);
                player.setLocation(player.getX(), getY() - getImage().getHeight() / 2 - player.getImage().getHeight() / 2);
            }
        }
    }
}
