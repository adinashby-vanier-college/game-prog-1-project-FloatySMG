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
    }
}