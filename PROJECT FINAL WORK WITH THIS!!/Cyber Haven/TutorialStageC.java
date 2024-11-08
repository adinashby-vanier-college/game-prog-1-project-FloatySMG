import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TutorialStageC extends TutorialStageBG {
    private int score;  // Add a score variable to keep track of the score
    private CoinCounter coinCounter;  // Coin counter object

    public TutorialStageC() {
        super();
        score = 0;  // Initialize the score
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Setup tutorial objects (your existing setup)
        TutorialStepE tutorialStepE = new TutorialStepE();
        addObject(tutorialStepE, 101, 486);

        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA, 374, 401);

        TutorialStepF tutorialStepF = new TutorialStepF();
        addObject(tutorialStepF, 667, 534);

        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium, 909, 491);

        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh, 1073, 487);

        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB, 1233, 414);

        TutorialStepG tutorialStepG = new TutorialStepG();
        addObject(tutorialStepG, 1427, 438);

        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer, 103, 304);
        cyrusPlayer.setLocation(91, 366);

        // Add CoinCollect objects
        CoinCollect coinCollect1 = new CoinCollect();
        addObject(coinCollect1, 372, 341);

        CoinCollect coinCollect2 = new CoinCollect();
        addObject(coinCollect2, 609, 441);

        CoinCollect coinCollect3 = new CoinCollect();
        addObject(coinCollect3, 911, 369);

        CoinCollect coinCollect4 = new CoinCollect();
        addObject(coinCollect4, 1334, 239);

        CoinCollect coinCollect5 = new CoinCollect();
        addObject(coinCollect5, 729, 437);

        // Initialize the CoinCounter and add it to the world
        coinCounter = new CoinCounter();
        addObject(coinCounter, 50, 30);  // Position the coin counter in the top-left corner
    }

    // Method to add points to the score
    public void addScore(int points)
    {
        score += points;  // Increase the score by the given points
    //    System.out.println("Score: " + score);  // Optional: print the score to the console for testing
    }

    // Getter method to access the CoinCounter
    public CoinCounter getCoinCounter() {
        return coinCounter;
    }
}
