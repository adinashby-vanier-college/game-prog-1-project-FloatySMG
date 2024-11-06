import greenfoot.*; 

public class TutorialStageB extends TutorialStageBG {

    public TutorialStageB() {
        super();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TutorialStepA tutorialStepA = new TutorialStepA();
        addObject(tutorialStepA,1118,448);
        tutorialStepA.setLocation(118,505);
        tutorialStepA.setLocation(81,525);
        tutorialStepA.setLocation(102,514);
        tutorialStepA.setLocation(62,543);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,55,401);
        cyrusPlayer.setLocation(58,418);
        cyrusPlayer.setLocation(57,430);
        TutorialStepF tutorialStepF = new TutorialStepF();
        addObject(tutorialStepF,312,511);
        tutorialStepF.setLocation(273,514);
        tutorialStepF.setLocation(281,542);
        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB,502,492);
        movePartsB.setLocation(499,492);
        TutorialStepB tutorialStepB = new TutorialStepB();
        addObject(tutorialStepB,1094,447);
        tutorialStepB.setLocation(655,480);
        tutorialStepB.setLocation(696,478);
        movePartsB.setLocation(568,493);
        tutorialStepB.setLocation(694,526);
        movePartsB.setLocation(588,518);
        movePartsB.setLocation(561,529);
        removeObject(tutorialStepB);
        movePartsB.setLocation(524,505);
        removeObject(movePartsB);
        addObject(movePartsB,484,499);
        movePartsB.setLocation(492,475);
        TutorialStepG tutorialStepG = new TutorialStepG();
        addObject(tutorialStepG,1052,375);
        tutorialStepG.setLocation(667,446);
        movePartsB.setLocation(508,432);
    }
}