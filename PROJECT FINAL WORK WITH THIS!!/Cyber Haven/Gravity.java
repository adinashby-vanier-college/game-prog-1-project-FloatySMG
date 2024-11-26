import greenfoot.*;

public class Gravity {
    private int vSpeed = 0;
    private final int gravity = 1; // Gravitational acceleration

    public void applyGravity(Actor actor) {
        vSpeed += gravity;
        actor.setLocation(actor.getX(), actor.getY() + vSpeed);
    }

    public void reset() {
        vSpeed = 0;
    }

    public void setVSpeed(int speed) {
        vSpeed = speed;
    }

    public int getVSpeed() {
        return vSpeed;
    }

    public void stopFalling(Actor actor) {
        reset();
        actor.setLocation(actor.getX(), actor.getY() - 1); // Adjust position slightly to stay on platforms
    }
}
