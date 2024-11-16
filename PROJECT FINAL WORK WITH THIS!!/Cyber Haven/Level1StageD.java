import greenfoot.*; 

public class Level1StageD extends Level1StageBG{

    public Level1StageD() {
        super();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Level1StepA level1StepA = new Level1StepA();
        addObject(level1StepA,69,476);
        level1StepA.setLocation(74,477);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,42,323);
        cyrusPlayer.setLocation(42,324);
        Level1StepD level1StepD = new Level1StepD();
        addObject(level1StepD,525,447);
        level1StepD.setLocation(523,434);
        level1StepD.setLocation(523,436);
        level1StepD.setLocation(523,442);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,258,491);
        bounceHigh.setLocation(314,506);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,633,510);
        bounceMedium.setLocation(643,510);
        Level1StepD level1StepD2 = new Level1StepD();
        addObject(level1StepD2,529,29);
        level1StepD2.setLocation(530,64);
        level1StepD2.setLocation(550,98);
        level1StepD2.setLocation(522,34);
        bounceMedium.setLocation(730,480);
        removeObject(bounceMedium);
        BounceHigh bounceHigh2 = new BounceHigh();
        addObject(bounceHigh2,692,494);
        TutorialStepK tutorialStepK = new TutorialStepK();
        addObject(tutorialStepK,661,159);
        tutorialStepK.setLocation(649,167);
        bounceHigh2.setLocation(791,496);
        addObject(bounceMedium,667,496);
        bounceMedium.setLocation(666,496);
    }
}