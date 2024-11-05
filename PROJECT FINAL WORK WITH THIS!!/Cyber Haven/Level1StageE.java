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
    }
}