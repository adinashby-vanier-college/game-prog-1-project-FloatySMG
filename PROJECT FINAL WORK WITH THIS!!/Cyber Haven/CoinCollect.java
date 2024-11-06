import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CoinCollect extends Actor {
    private GreenfootImage CoinCollectImage;

    public void act() {
        // Check if the player intersects with the coin (CyrusPlayer)
        Actor player = getOneIntersectingObject(CyrusPlayer.class);
        
        if (player != null) {
            // Get the current world and check if it's an instance of TutorialStageC
            World world = getWorld();
            if (world instanceof TutorialStageC) {
                // Cast to TutorialStageC safely
                TutorialStageC tutorialWorld = (TutorialStageC) world;

                // Increase the score by 10 points when the coin is collected
                tutorialWorld.addScore(10);

                // Increment the coin count in the CoinCounter
                CoinCounter coinCounter = tutorialWorld.getCoinCounter();
                if (coinCounter != null) {
                    coinCounter.incrementCoins();  // Increment coin count
                }

                // Remove the coin from the world after it has been collected
                world.removeObject(this);
            } else {
                // If not in TutorialStageC world, print a warning message (for debugging)
                System.out.println("Warning: CoinCollect is not in TutorialStageC world.");
            }
        }
    }

    public CoinCollect() {
        CoinCollectImage = new GreenfootImage("CoinCollect.png");
        scaleImage();
    }

    private void scaleImage() {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight() / 3;
        int myNewWidth = (int)myImage.getWidth() / 1;
        myImage.scale(myNewHeight, myNewWidth);  
    }
}
