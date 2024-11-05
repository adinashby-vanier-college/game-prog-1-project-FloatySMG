import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MapParts extends Actor {
    public MapParts() {
        // Do not load a default image here unless it's needed for all subclasses
        // The subclasses should handle image loading themselves
    }
    
    // Checks if an actor is standing on top of the platform
    public boolean isTouchingTop(Actor actor) {
        return actor.getY() <= getY() - (getImage().getHeight() / 2 + actor.getImage().getHeight() / 2) &&
               actor.getY() >= getY() - (getImage().getHeight() / 2 + actor.getImage().getHeight());
    }
    
    // Checks if an actor is colliding on the sides of the platform
    public boolean isTouchingSide(Actor actor) {
        return Math.abs(actor.getX() - getX()) <= (getImage().getWidth() / 2 + actor.getImage().getWidth() / 2) &&
               Math.abs(actor.getY() - getY()) < getImage().getHeight() / 2;
    }
    
    // Checks if an actor is hitting the bottom of the platform
    public boolean isTouchingBottom(Actor actor) {
        return actor.getY() >= getY() + (getImage().getHeight() / 2 + actor.getImage().getHeight() / 2) &&
               actor.getY() <= getY() + (getImage().getHeight() / 2 + actor.getImage().getHeight());
    }
}
