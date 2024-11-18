import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Platforms extends Actor {
    
    public Platforms() {
        // Setting a default platform image (you can change the size as needed)
        GreenfootImage image = new GreenfootImage(100, 10); 
        image.setColor(Color.GRAY);
        image.fillRect(0, 0, image.getWidth(), image.getHeight());
        setImage(image);
    }
    
    // Checks if an actor is standing on top of the platform
    public boolean isTouchingTop(Actor actor) {
        // Actor's bottom edge is close to platform's top edge
        int actorBottom = actor.getY() + actor.getImage().getHeight() / 2;
        int platformTop = getY() - getImage().getHeight() / 2;
        return actorBottom >= platformTop && actorBottom <= platformTop + 5;  // 5 pixel tolerance
    }
    
    // Checks if an actor is colliding on the sides of the platform
    public boolean isTouchingSide(Actor actor) {
        return Math.abs(actor.getX() - getX()) <= (getImage().getWidth() / 2 + actor.getImage().getWidth() / 2) &&
               Math.abs(actor.getY() - getY()) < getImage().getHeight() / 2;
    }
    
    // Checks if an actor is hitting the bottom of the platform
    public boolean isTouchingBottom(Actor actor) {
        int actorTop = actor.getY() - actor.getImage().getHeight() / 2;
        int platformBottom = getY() + getImage().getHeight() / 2;
        return actorTop <= platformBottom && actorTop >= platformBottom - 5;  // 5 pixel tolerance
    }
}
