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
    private CoinCounter counter;
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
        if (!isOnPlatform()) {
            vSpeed += gravity;
            setLocation(getX(), getY() + vSpeed);
        } else {
            vSpeed = 0;
            isJumping = false;
        }
    }

    private boolean isOnPlatform() {
        Actor platform = getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Actor.class);
        if (platform instanceof MapParts) {
            MapParts mapPart = (MapParts) platform;
            
            // Check the active state of TimerBlockA and TimerBlockB
            if (mapPart instanceof TimerBlockA) {
                return ((TimerBlockA) mapPart).getIsActive();
            } else if (mapPart instanceof TimerBlockB) {
                return ((TimerBlockB) mapPart).getIsActive();
            } else {
                return true; // If it's a normal MapPart or Platform, it's a valid platform
            }
        }
        return platform instanceof Platforms;  // For normal platforms
    }

    public void jump() {
        if ((Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("Up")) && !isJumping && isOnPlatform()) {
            vSpeed = jumpStrength;
            isJumping = true;
            setLocation(getX(), getY() + vSpeed);
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
