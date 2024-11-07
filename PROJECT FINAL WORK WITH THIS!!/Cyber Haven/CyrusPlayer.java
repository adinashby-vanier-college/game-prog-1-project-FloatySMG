import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CyrusPlayer extends Actor {

    private int speed = 4;          
    private int jumpStrength = -15; 
    private int gravity = 1;        
    private int vSpeed = 0;         
    private boolean isJumping = false; 
    private GreenfootImage standingImage; // For standing
    private GreenfootImage walkA;         // For walking (first frame)
    private GreenfootImage walkB;         // For walking (second frame)
    private int frameCounter = 0;         // To count frames
    private final int SWITCH_INTERVAL = 12; // Number of frames to switch images

    // Constructor
    public CyrusPlayer() {
        standingImage = new GreenfootImage("CyrusStand.png"); // Standing image
        walkA = new GreenfootImage("CyrusWalkA.png");         // First walking image
        walkB = new GreenfootImage("CyrusWalkB.png");         // Second walking image
        scaleImages(); // Scale images to 25% of their original size
        setImage(standingImage); // Set initial image to standing
    }

    private void scaleImages() {
        standingImage.scale((int)(standingImage.getWidth() * 0.25), (int)(standingImage.getHeight() * 0.25));
        walkA.scale((int)(walkA.getWidth() * 0.25), (int)(walkA.getHeight() * 0.25));
        walkB.scale((int)(walkB.getWidth() * 0.25), (int)(walkB.getHeight() * 0.25));
    }

    public void act() {
        move();
        jump();         
        applyGravity();
        checkPlatformCollision();  // Now checks both Platforms and MapParts
        checkLevelTransition();
    }

    private void move() {
        boolean moving = false; // Track if moving
        
        if ((Greenfoot.isKeyDown("left")||(Greenfoot.isKeyDown("A")))){
            setLocation(getX() - speed, getY());
            moving = true; // Set moving to true when moving left
        } 
        if ((Greenfoot.isKeyDown("right")||(Greenfoot.isKeyDown("D")))) {
            setLocation(getX() + speed, getY());
            moving = true; // Set moving to true when moving right
        }

        if (moving) {
            frameCounter++; // Increment frame counter

            if (frameCounter >= SWITCH_INTERVAL) {
                // Switch images every 12 frames
                if (getImage() == walkA) {
                    setImage(walkB); // Switch to walkB
                } else {
                    setImage(walkA); // Switch to walkA
                }
                frameCounter = 0; // Reset the counter
            }
        } else {
            setImage(standingImage); // Set back to standing image when not moving
            frameCounter = 0; // Reset the counter when standing
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
        // Check if player is touching either a Platform or MapPart
        Actor platform = getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Actor.class);
        return platform instanceof Platforms || platform instanceof MapParts;  // Check for both Platforms and MapParts
    }

    public void jump() {
        if ((Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("Up")) && !isJumping && isOnPlatform()) {
            vSpeed = jumpStrength;  
            isJumping = true;
            setLocation(getX(), getY() + vSpeed);
        }
    }

    private void checkPlatformCollision() {
        // Check if the player is intersecting a platform or a map part
        Actor platform = getOneIntersectingObject(Actor.class);

        if (platform != null) {
            if (platform instanceof Platforms || platform instanceof MapParts) {
                if (platform instanceof Platforms) {
                    // Handle Platform-specific collision
                    handlePlatformCollision((Platforms) platform);
                } else if (platform instanceof MapParts) {
                    // Handle MapPart-specific collision
                    handleMapPartCollision((MapParts) platform);
                }
            }
        }
    }

    private void handlePlatformCollision(Platforms platform) {
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

    private void handleMapPartCollision(MapParts mapPart) {
        if (mapPart.isTouchingTop(this) && vSpeed >= 0) {
            setLocation(getX(), mapPart.getY() - (mapPart.getImage().getHeight() / 2 + getImage().getHeight() / 2));
            vSpeed = 0;
            isJumping = false;
        } else if (mapPart.isTouchingSide(this)) {
            if (getX() < mapPart.getX()) {
                setLocation(mapPart.getX() - mapPart.getImage().getWidth() / 2 - getImage().getWidth() / 2, getY());
            } else {
                setLocation(mapPart.getX() + mapPart.getImage().getWidth() / 2 + getImage().getWidth() / 2, getY());
            }
            vSpeed = 0;
        } else if (mapPart.isTouchingBottom(this)) {
            vSpeed = -vSpeed / 2;
        }
    }

    private void checkLevelTransition() {
        // Check if CyrusPlayer has reached the right side of the screen
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
                return; // No next stage if already at TutorialStageE
            }

            // Switch to the next world section
            Greenfoot.setWorld(nextWorld);
        }
    }
    public void bounce() {
        vSpeed = -21;  // Apply a strong upward force (bounce)
        setLocation(getX(), getY() + vSpeed);  // Move the player upward immediately
    }
     public int getVSpeed() {
        return vSpeed;
    }
    public void bounceMedium() {
        vSpeed = -17;  // Smaller upward force (medium bounce)
        setLocation(getX(), getY() + vSpeed);
}
}
