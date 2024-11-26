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
    private int hoverCounter = 0; 
    private final int HOVER_DURATION = 21; 
    TutorialStageBG thisGame;
    private boolean isBouncing;
    private int bounceTimer = 0;
    private boolean isHovering = false;

    public CyrusPlayer() {
        standingImage = new GreenfootImage("CyrusStand.png");
        walkA = new GreenfootImage("CyrusWalkA.png");
        walkB = new GreenfootImage("CyrusWalkB.png");
        scaleImages();
        setImage(standingImage);
    }

    public void act() {
        updateBounceTimer();
        move();
        jump();
        applyGravity();
        checkPlatformCollision();
        checkLevelTransition();
        checkFallOffWorld();
        collectCoin();
    }

    private void scaleImages() {
        scaleImage(standingImage);
        scaleImage(walkA);
        scaleImage(walkB);
    }

    private void scaleImage(GreenfootImage image) {
        image.scale((int)(image.getWidth() * 0.25), (int)(image.getHeight() * 0.25));
    }

    private void updateBounceTimer() {
        if (isBouncing) {
            bounceTimer++;
        }
        if (bounceTimer >= 320) {
            bounceTimer = 0;
            isBouncing = false;
        }
    }

    private void move() {
        boolean moving = false;

        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A")) {
            setLocation(getX() - speed, getY());
            moving = true;
        } else if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D")) {
            setLocation(getX() + speed, getY());
            moving = true;
        }

        if (moving) {
            updateWalkAnimation();
        } else {
            setImage(standingImage);
            frameCounter = 0;
        }
    }

    private void updateWalkAnimation() {
        frameCounter++;
        if (frameCounter >= SWITCH_INTERVAL) {
            setImage(getImage() == walkA ? walkB : walkA);
            frameCounter = 0;
        }
    }

    private void applyGravity() {
        if (!isHovering && !isOnPlatform()) {
            vSpeed += gravity;
        }
        setLocation(getX(), getY() + vSpeed);
    }

    private boolean isOnPlatform() {
        Actor platform = getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Actor.class);
        if (platform instanceof MapParts) {
            return ((MapParts) platform).isTouchingTop(this);
        }
        return false;
    }

    public void jump() {
        if ((Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("Up")) && !isJumping && isOnPlatform()) {
            vSpeed = jumpStrength;
            isJumping = true;
            hoverCounter = 0;
            setLocation(getX(), getY() + vSpeed);
        }

        if (isJumping && (Greenfoot.isKeyDown("W") || Greenfoot.isKeyDown("Up")) && vSpeed >= 0 && hoverCounter < HOVER_DURATION) {
            vSpeed = 0;
            isHovering = true;
            hoverCounter++;
        } else if (hoverCounter >= HOVER_DURATION || (!Greenfoot.isKeyDown("W") && !Greenfoot.isKeyDown("Up"))) {
            isHovering = false;
            vSpeed += gravity;
        }

        if (isOnPlatform() && !isBouncing) {
            resetJump();
        }
    }

    public void resetJump() {
        vSpeed = 0;
        isJumping = false;
        hoverCounter = 0;
        isHovering = false;
        isBouncing = false;
    }

    private void checkPlatformCollision() {
        Actor platform = getOneIntersectingObject(Actor.class);
        if (platform != null) {
            if (platform instanceof Platforms) {
                handlePlatformCollision((Platforms) platform);
            } else if (platform instanceof MapParts) {
                handleMapPartCollision((MapParts) platform);
            }
        }
    }

    private void handlePlatformCollision(Platforms platform) {
        if (platform.isTouchingTop(this) && vSpeed >= 0) {
            setLocation(getX(), platform.getY() - (platform.getImage().getHeight() / 2 + getImage().getHeight() / 2));
            resetJump();
        } else if (platform.isTouchingSide(this)) {
            adjustHorizontalPosition(platform);
        } else if (platform.isTouchingBottom(this)) {
            vSpeed = -vSpeed / 2;
        }
    }

    private void handleMapPartCollision(MapParts mapPart) {
        if (mapPart.isTouchingTop(this) && vSpeed >= 0) {
            setLocation(getX(), mapPart.getY() - (mapPart.getImage().getHeight() / 2 + getImage().getHeight() / 2));
            resetJump();
        } else if (mapPart.isTouchingSide(this)) {
            adjustHorizontalPosition(mapPart);
        } else if (mapPart.isTouchingBottom(this)) {
            vSpeed = -vSpeed / 2;
        }
    }

    private void adjustHorizontalPosition(Actor platform) {
        if (getX() < platform.getX()) {
            setLocation(platform.getX() - platform.getImage().getWidth() / 2 - getImage().getWidth() / 2, getY());
        } else {
            setLocation(platform.getX() + platform.getImage().getWidth() / 2 + getImage().getWidth() / 2, getY());
        }
        vSpeed = 0;
    }

    private void checkLevelTransition() {
        if (getX() >= getWorld().getWidth() - 5) {
            World currentWorld = getWorld();
            World nextWorld = getNextWorld(currentWorld);
            if (nextWorld != null) {
                Greenfoot.setWorld(nextWorld);
            }
        }
    }

    private World getNextWorld(World currentWorld) {
        if (currentWorld instanceof TutorialStageA) return new TutorialStageB();
        if (currentWorld instanceof TutorialStageB) return new TutorialStageC();
        if (currentWorld instanceof TutorialStageC) return new TutorialStageD();
        if (currentWorld instanceof TutorialStageD) return new Level1StageA();
        if (currentWorld instanceof Level1StageA) return new Level1StageB();
        if (currentWorld instanceof Level1StageB) return new Level1StageC();
        if (currentWorld instanceof Level1StageC) return new Level1StageD();
        if (currentWorld instanceof Level1StageD) return new Level1StageE();
        if (currentWorld instanceof Level1StageE) return new FinalStageA();
        if (currentWorld instanceof FinalStageA) return new FinalStageB();
        if (currentWorld instanceof FinalStageB) return new FinalStageC();
        if (currentWorld instanceof FinalStageC) return new FinalStageD();
        if (currentWorld instanceof FinalStageD) return new FinalStageE();
        return null;
    }

    private void checkFallOffWorld() {
        if (getY() >= getWorld().getHeight() + 5) {
            Greenfoot.setWorld(new TutorialStageA());
        }
    }

    public void bounce(int strength) {
        vSpeed = -strength;
        isBouncing = true;
        isJumping = true;
        isHovering = false;
        hoverCounter = 0;
    }

    public int getVSpeed() {
        return vSpeed;
    }

    public void die() {
        getWorld().removeObject(this);
    }

    public void bounceMedium() {
        vSpeed = -17;
        isBouncing = true;
        isJumping = true;
        isHovering = false;
        hoverCounter = 0;
    }

    public void bounceHigh() {
        vSpeed = -22;
        isBouncing = true;
        isJumping = true;
        isHovering = false;
        hoverCounter = 0;
    }

    public void collectCoin() {
        Actor coin = getOneIntersectingObject(CoinCollect.class);
        if (coin != null) {
            getWorld().removeObject(coin);
        }
    }
}
