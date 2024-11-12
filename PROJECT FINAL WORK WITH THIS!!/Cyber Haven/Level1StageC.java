import greenfoot.*; 

public class Level1StageC extends Level1StageBG{

    public Level1StageC() {
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
        addObject(level1StepA,70,482);
        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB,235,420);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,45,335);
        TutorialStepK tutorialStepK = new TutorialStepK();
        addObject(tutorialStepK,369,172);
        removeObject(tutorialStepK);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,546,454);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,759,304);
        Level1StepB level1StepB = new Level1StepB();
        addObject(level1StepB,1008,430);
        movePartsB.setLocation(253,341);
        movePartsB.setLocation(292,343);
        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA,1180,318);
        Level1StepC level1StepC = new Level1StepC();
        addObject(level1StepC,1529,452);
        movePartsA.setLocation(1255,312);
        movePartsA.setLocation(1240,314);
        movePartsA.setLocation(1252,328);
        bounceHigh.setLocation(542,460);
        bounceMedium.setLocation(717,318);
        bounceMedium.setLocation(642,341);
        BounceMedium bounceMedium2 = new BounceMedium();
        addObject(bounceMedium2,832,324);
        bounceMedium2.setLocation(830,326);
        addObject(bounceMedium,686,328);
        bounceMedium.setLocation(708,322);
        removeObject(bounceMedium);
        BounceMedium bounceMedium3 = new BounceMedium();
        addObject(bounceMedium3,679,327);
    }
}