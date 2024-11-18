import greenfoot.*; 

public class FinalStage2D extends FinalStageBBG{

    public FinalStage2D() {
        super();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        RobotLv1 robotLv1 = new RobotLv1();
        addObject(robotLv1,1100,222);
        TutorialStepK tutorialStepK = new TutorialStepK();
        addObject(tutorialStepK,621,466);
        RobotLv2 robotLv2 = new RobotLv2();
        addObject(robotLv2,1294,221);
        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB,1283,349);
        MovePartsB movePartsB2 = new MovePartsB();
        addObject(movePartsB2,1081,355);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,617,330);
    }
}