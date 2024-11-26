import greenfoot.*;

public class BounceMedium extends MapParts {
    public void act() {
        Actor character = getOneIntersectingObject(CyrusPlayer.class);

        if (character != null) {
            CyrusPlayer player = (CyrusPlayer) character;
            // Ensure bounce only triggers when coming from above
            if (player.getY() + player.getImage().getHeight() / 2 >= getY() - getImage().getHeight() / 2 && player.getVSpeed() >= 0) {
                player.bounceMedium();
                player.setLocation(player.getX(), getY() - getImage().getHeight() / 2 - player.getImage().getHeight() / 2);
            }
        }
    }
}
