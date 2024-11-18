import greenfoot.*;

public class BossFightBlast extends Actor {
    private Vector2D velocity;

    public BossFightBlast() {
        velocity = new Vector2D(0, 0); // Default velocity is stationary
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }

    public void act() {
        move();
    }

    private void move() {
        setLocation(getX() + (int) velocity.getX(), getY() + (int) velocity.getY());
    }

    public void fireAtPlayer(CyrusPlayer player) {
        if (player != null) {
            Vector2D direction = new Vector2D(player.getX() - getX(), player.getY() - getY());
            if (direction.getX() != 0 || direction.getY() != 0) {
                direction.normalize();
                direction = Vector2D.multiply(direction, 10); // Adjust speed
                setVelocity(direction);
            }
        }
    }
}
