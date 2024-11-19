import greenfoot.*;

public class CyrusPlayer extends Actor {
    private int speed = 4;          
    private int jumpStrength = -15; 
    private int gravity = 1;        
    private int vSpeed = 0;         
    private boolean isJumping = false; 
    private GreenfootImage standingImage; 
    private GreenfootImage walkA;         
    private GreenfootImage walkB;         
    private int frameCounter = 0;         
    private final int SWITCH_INTERVAL = 12; 
    private int hoverCounter = 0; // Counter for hover duration
    private final int HOVER_DURATION = 21; // Number of acts for hovering (0.35 seconds)
    TutorialStageBG thisGame; 

    public void act() {
        move();
        jump();
        applyGravity();
        checkPlatformCollision();
        checkLevelTransition();
        collectCoin();
    }

    // Constructor
    public CyrusPlayer() {
        standingImage = new GreenfootImage("CyrusStand.png");
        walkA = new GreenfootImage("CyrusWalkA.png");
        walkB = new GreenfootImage("CyrusWalkB.png");
        scaleImages();
        setImage(standingImage);
    }

    private void scaleImages() {
        standingImage.scale((int)(standingImage.getWidth() * 0.25), (int)(standingImage.getHeight() * 0.25));
        walkA.scale((int)(walkA.getWidth() * 0.25), (int)(walkA.getHeight() * 0.25));
        walkB.scale((int)(walkB.getWidth() * 0.25), (int)(walkB.getHeight() * 0.25));
    }

    private void move() {
        boolean moving = false;

        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A")) {
            setLocation(getX() - speed, getY());
            moving = true;
        }
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D")) {
            setLocation(getX() + speed, getY());
            moving = true;
        }

        if (moving) {
            frameCounter++;

            if (frameCounter >= SWITCH_INTERVAL) {
                if (getImage() == walkA) {
                    setImage(walkB);
                } else {
                    setImage(walkA);
                }
                frameCounter = 0;
            }
        } else {
            setImage(standingImage);
            frameCounter = 0;
        }
    }

    private void applyGravity() {
        if (!isOnPlatform() && hoverCounter == 0) {
            vSpeed += gravity;
        }

        setLocation(getX(), getY() + vSpeed);
    }

    private boolean isOnPlatform() {
        // Check directly below the player for any Actor
        Actor platform = getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Actor.class);
    
        if (platform instanceof TimerBlockA) {
            return ((TimerBlockA) platform).getIsActive(); // Active state determines solidity
        }
        if (platform instanceof TimerBlockB) {
            return ((TimerBlockB) platform).getIsActive(); // Active state determines solidity
        }
        if (platform instanceof Platforms) {
            return true; // Regular platforms are always solid
        }
    
        return false; // Any other objects are not solid
    } 
        

    public void jump() {
        if ((Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("Up")) && !isJumping && isOnPlatform()) {
            vSpeed = jumpStrength;  // Use the original jump strength for a higher jump
            isJumping = true;
            hoverCounter = 0;  // Reset hover counter at the start of the jump
            setLocation(getX(), getY() + vSpeed);
        }

        // Hover functionality at the peak of the jump
        if (isJumping && (Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("Up")) && vSpeed >= 0 && hoverCounter < HOVER_DURATION) {
            vSpeed = 0;
            hoverCounter++;
        } else if (hoverCounter >= HOVER_DURATION || (!Greenfoot.isKeyDown("W") && !Greenfoot.isKeyDown("Up"))) {
            vSpeed += gravity;  // Apply gravity after hover or if the key is not pressed
        }

        // When the player lands on a platform, stop jumping and reset hover counter
        if (isOnPlatform()) {
            vSpeed = 0;
            isJumping = false;
            hoverCounter = 0;
        }
    }

    private void checkPlatformCollision() {
        Actor platform = getOneIntersectingObject(Actor.class);
        if (platform != null) {
            if (platform instanceof Platforms || platform instanceof MapParts) {
                if (platform instanceof Platforms) {
                    handlePlatformCollision((Platforms) platform);
                } else if (platform instanceof MapParts) {
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
            hoverCounter = 0;
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
            hoverCounter = 0;
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
                nextWorld = new Level1StageA();
            } else if (currentWorld instanceof Level1StageA) {
                nextWorld = new Level1StageB();
            } else if (currentWorld instanceof Level1StageB) {
                nextWorld = new Level1StageC();
            } else if (currentWorld instanceof Level1StageC) {
                nextWorld = new Level1StageD();
            } else if (currentWorld instanceof Level1StageD) {
                nextWorld = new Level1StageE();
            } else if (currentWorld instanceof Level1StageE) {
                nextWorld = new FinalStageA();
            } else if (currentWorld instanceof FinalStageA) {
                nextWorld = new FinalStageB();
            } else if (currentWorld instanceof FinalStageB) {
                nextWorld = new FinalStageC();
            } else if (currentWorld instanceof FinalStageC) {
                nextWorld = new FinalStageD();
            } else if (currentWorld instanceof FinalStageD) {
                nextWorld = new FinalStageE();
            } else {
                return;
            }

            Greenfoot.setWorld(nextWorld);
        }
    }

    public void bounce() {
        vSpeed = -21;
        setLocation(getX(), getY() + vSpeed);
    }

    public int getVSpeed() {
        return vSpeed;
    }

    public void die() {
        getWorld().removeObject(this);
    }

    public void bounceMedium() {
        vSpeed = -17;
        setLocation(getX(), getY() + vSpeed);
    }

    public void bounceHigh() {
        vSpeed = -22;
        setLocation(getX(), getY() + vSpeed);
    }

    public void collectCoin() {
        Actor coinCollect = getOneIntersectingObject(CoinCollect.class);
        if (coinCollect != null) {
            World world = getWorld();
            world.removeObject(coinCollect);
            Greenfoot.playSound("coinrecieved.wav");
        }
    }
}
