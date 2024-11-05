import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MapParts extends Actor {
    public MapParts() {
        // This constructor is left empty, so subclasses can handle image loading
    }
    
    // Checks if an actor is standing on top of the MapPart
    public boolean isTouchingTop(Actor actor) {
        return actor.getY() <= getY() - (getImage().getHeight() / 2 + actor.getImage().getHeight() / 2) &&
               actor.getY() >= getY() - (getImage().getHeight() / 2 + actor.getImage().getHeight());
    }
    
    // Checks if an actor is colliding on the sides of the MapPart
    public boolean isTouchingSide(Actor actor) {
        return Math.abs(actor.getX() - getX()) <= (getImage().getWidth() / 2 + actor.getImage().getWidth() / 2) &&
               Math.abs(actor.getY() - getY()) < getImage().getHeight() / 2;
    }
    
    // Checks if an actor is hitting the bottom of the MapPart
    public boolean isTouchingBottom(Actor actor) {
        return actor.getY() >= getY() + (getImage().getHeight() / 2 + actor.getImage().getHeight() / 2) &&
               actor.getY() <= getY() + (getImage().getHeight() / 2 + actor.getImage().getHeight());
    }
}
