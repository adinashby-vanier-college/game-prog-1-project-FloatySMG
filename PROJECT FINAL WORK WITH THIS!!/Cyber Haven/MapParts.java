import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MapParts extends Actor {
    public MapParts() {
        // This constructor is left empty, so subclasses can handle image loading
    }
    
    // Checks if an actor is standing on top of the MapPart
    public boolean isTouchingTop(Actor actor) {
        int actorBottom = actor.getY() + actor.getImage().getHeight() / 2;
        int mapTop = getY() - getImage().getHeight() / 2;

        // Check if actor's bottom is close to the top of MapPart (with tolerance)
        return actorBottom >= mapTop && actorBottom <= mapTop + 10;  // 10 pixel tolerance
    }
    
    // Checks if an actor is colliding on the sides of the MapPart
    public boolean isTouchingSide(Actor actor) {
        return Math.abs(actor.getX() - getX()) <= (getImage().getWidth() / 2 + actor.getImage().getWidth() / 2) &&
               Math.abs(actor.getY() - getY()) < getImage().getHeight() / 2;
    }
    
    // Checks if an actor is hitting the bottom of the MapPart
    public boolean isTouchingBottom(Actor actor) {
        int actorTop = actor.getY() - actor.getImage().getHeight() / 2;
        int mapBottom = getY() + getImage().getHeight() / 2;

        // Check if actor's top is close to the bottom of MapPart (with tolerance)
        return actorTop <= mapBottom && actorTop >= mapBottom - 10;  // 10 pixel tolerance
    }
    
    // Checks if the actor is approaching the platform vertically (for landing)
    public boolean isApproaching(Actor actor) {
        // Check if actor is moving downward towards the platform (based on vertical speed)
        return actor.getY() + actor.getImage().getHeight() / 2 < getY() - getImage().getHeight() / 2
            && actor.getY() + actor.getImage().getHeight() / 2 > getY() - getImage().getHeight() / 2 - 10;  // Tolerance for vertical movement
    }
}
