import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldFourStageB here.
 */
public class WorldFourStageB extends WorldFour {
    private BounceMedium bounceMedium; // The BounceMedium object
    private BounceHigh bounceHigh; // The BounceHigh object

    public WorldFourStageB() {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     */
    private void prepare() {
        LevelFourStepC levelFourStepC = new LevelFourStepC();
        addObject(levelFourStepC, 50, 441);
        LevelFourStepC levelFourStepC2 = new LevelFourStepC();
        addObject(levelFourStepC2, 152, 441);

        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer, 22, 381);

        Cannon cannon = new Cannon();
        addObject(cannon, 79, 382);

        // Create the BounceMedium and BounceHigh objects
        bounceMedium = new BounceMedium();
        bounceHigh = new BounceHigh();

        // Initially, add the BounceMedium object to the world (start with this one visible)
        addObject(bounceMedium, 287, 428);

        // Add the CannonSwitch and link it to the BounceMedium and BounceHigh
        CannonSwitch cannonSwitch = new CannonSwitch(bounceMedium, bounceHigh);
        addObject(cannonSwitch, 200, 140); // Position the switch

        LevelFourStepA levelFourStepA = new LevelFourStepA();
        addObject(levelFourStepA, 449, 308);
        removeObject(levelFourStepA);
        addObject(levelFourStepA, 407, 110);

        LevelFourStepA levelFourStepA2 = new LevelFourStepA();
        addObject(levelFourStepA2, 542, 110);
        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA,863,204);
        MovePartsA movePartsA2 = new MovePartsA();
        addObject(movePartsA2,1213,200);
        LevelFourStepB levelFourStepB = new LevelFourStepB();
        addObject(levelFourStepB,1519,220);
    }
}
