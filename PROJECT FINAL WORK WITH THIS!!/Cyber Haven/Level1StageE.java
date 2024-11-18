import greenfoot.*; 

public class Level1StageE extends Level1StageBG{

    public Level1StageE() {
        super();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Level1StepB level1StepB = new Level1StepB();
        addObject(level1StepB,546,457);
        level1StepB.setLocation(338,449);
        Level1StepB level1StepB2 = new Level1StepB();
        addObject(level1StepB2,621,372);
        level1StepB2.setLocation(496,452);
        level1StepB2.setLocation(491,453);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,398,184);
        cyrusPlayer.setLocation(399,272);
        level1StepB.setLocation(396,234);
        level1StepB.setLocation(339,415);
        level1StepB2.setLocation(464,425);
        level1StepB.setLocation(367,470);
        cyrusPlayer.setLocation(414,301);
        level1StepB2.setLocation(469,429);
        level1StepB.setLocation(311,445);
        level1StepB2.setLocation(427,83);
        removeObject(cyrusPlayer);
        removeObject(level1StepB2);
        removeObject(level1StepB);
        TutorialStepA tutorialStepA = new TutorialStepA();
        addObject(tutorialStepA,712,448);
        tutorialStepA.setLocation(715,455);
        CyrusPlayer cyrusPlayer2 = new CyrusPlayer();
        addObject(cyrusPlayer2,689,322);
        removeObject(tutorialStepA);
        cyrusPlayer2.setLocation(160,283);
        Level1StepB level1StepB3 = new Level1StepB();
        addObject(level1StepB3,69,408);
        cyrusPlayer2.setLocation(59,195);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,255,525);
        bounceHigh.setLocation(311,458);
        bounceHigh.setLocation(272,497);
        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA,598,214);
        movePartsA.setLocation(541,261);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,855,264);
        Level1StepB level1StepB4 = new Level1StepB();
        addObject(level1StepB4,852,581);
        removeObject(level1StepB4);
        Level1StepC level1StepC = new Level1StepC();

        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB,855,456);
        Level1StepD level1StepD = new Level1StepD();
        addObject(level1StepD,1002,94);
        Level1StepD level1StepD2 = new Level1StepD();
        addObject(level1StepD2,1004,540);
        level1StepD2.setLocation(1014,524);
        level1StepD2.setLocation(1003,547);
        BounceHigh bounceHigh2 = new BounceHigh();
        addObject(bounceHigh2,1177,477);
        Level1StepB level1StepB5 = new Level1StepB();
        addObject(level1StepB5,1316,435);
        Level1StepB level1StepB6 = new Level1StepB();
        addObject(level1StepB6,1468,432);
        level1StepB6.setLocation(1435,379);
        level1StepB5.setLocation(1408,389);
        level1StepB6.setLocation(1467,433);
        level1StepB5.setLocation(1259,316);
        level1StepB5.setLocation(1316,324);
        removeObject(level1StepB5);
        Level1StepB level1StepB7 = new Level1StepB();
        addObject(level1StepB7,1311,431);
        bounceMedium.setLocation(764,279);
        bounceMedium.setLocation(766,267);
        movePartsB.setLocation(733,454);
        movePartsB.setLocation(774,452);
        Level1StepB level1StepB8 = new Level1StepB();
        addObject(level1StepB8,1598,431);
        level1StepB8.setLocation(1559,374);
        level1StepB7.setLocation(1358,280);
        level1StepB7.setLocation(1337,435);
        removeObject(level1StepB8);
        addObject(level1StepB8,1576,429);
        TutorialStepK tutorialStepK = new TutorialStepK();
        addObject(tutorialStepK,1126,148);
        RobotLv1 robotLv1 = new RobotLv1();
        addObject(robotLv1,1121,83);
        robotLv1.setLocation(1131,83);
        removeObject(robotLv1);
        TutorialChain tutorialChain = new TutorialChain();
        addObject(tutorialChain,1149,53);
        tutorialChain.setLocation(1098,46);
        tutorialChain.setLocation(1126,54);
        tutorialStepK.setLocation(1153,130);
        tutorialStepK.setLocation(1124,136);
        bounceHigh2.setLocation(1169,439);
        bounceHigh2.setLocation(1167,439);
        BounceMedium bounceMedium2 = new BounceMedium();
        addObject(bounceMedium2,1328,160);
    }
}