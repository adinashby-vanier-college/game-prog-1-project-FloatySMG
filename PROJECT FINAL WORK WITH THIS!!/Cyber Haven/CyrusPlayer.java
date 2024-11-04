import greenfoot.*;

public class CyrusPlayer extends Actor {

    private int speed = 4;          
    private int jumpStrength = -15; 
    private int gravity = 1;        
    private int vSpeed = 0;         
    private boolean isJumping = false; 

    // Constructor
    public CyrusPlayer() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() * 2, image.getHeight() * 2); // Scale the image to twice its size
        setImage(image);
    }

    public void act() {
        move();
        jump();         
        applyGravity();
        checkPlatformCollision();
        checkLevelTransition();
    }

    private void move() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
        }
    }

    private void applyGravity() {
        if (!isOnPlatform()) {
            vSpeed += gravity;
            setLocation(getX(), getY() + vSpeed);
        } else {
            vSpeed = 0;         
            isJumping = false;
        }
    }

    private boolean isOnPlatform() {
        Platforms platform = (Platforms) getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Platforms.class);
        return platform != null;
    }

    public void jump() {
        if ((Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("Up")) && !isJumping && isOnPlatform()) {
            vSpeed = jumpStrength;  
            isJumping = true;
            setLocation(getX(), getY() + vSpeed);
        }
    }

    private void checkPlatformCollision() {
        Platforms platform = (Platforms) getOneIntersectingObject(Platforms.class);

        if (platform != null) {
            if (platform.isTouchingTop(this) && vSpeed >= 0) {
                setLocation(getX(), platform.getY() - (platform.getImage().getHeight() / 2 + getImage().getHeight() / 2));
                vSpeed = 0;
                isJumping = false;
            } else if (platform.isTouchingSide(this)) {
                if (getX() < platform.getX()) {
                    setLocation(platform.getX() - platform.getImage().getWidth() / 2 - getImage().getWidth() / 2, getY());
                } else {
                    setLocation(platform.getX() + platform.getImage().getWidth() / 2 + getImage().getWidth() / 2, getY());
                }
                vSpeed = 0;
            } else if (platform.isTouchingBottom(this)) {
                vSpeed = -vSpeed / 2;
            }
        }
    }

    private void checkLevelTransition() {
        if (getX() >= getWorld().getWidth() - 5) {
            World currentWorld = getWorld();
            World nextWorld;

            if (currentWorld instanceof TutorialStageA) {
                nextWorld = new TutorialStageB();
            } else if (currentWorld instanceof TutorialStageB) {
                nextWorld = new TutorialStageC();
            } else if (currentWorld instanceof TutorialStageC) {
                nextWorld = new TutorialStageD();
            } else if (currentWorld instanceof TutorialStageD) {
                nextWorld = new TutorialStageE();
            } else {
                return;
            }

            Greenfoot.setWorld(nextWorld);
        }
    }
}
