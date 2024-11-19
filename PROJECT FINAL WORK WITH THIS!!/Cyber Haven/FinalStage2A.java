import greenfoot.*; 

public class FinalStage2A extends FinalStageBBG{

    public FinalStage2A() {
        super();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Final2StepA final2StepA = new Final2StepA();
        addObject(final2StepA,358,365);
        final2StepA.setLocation(118,479);
        Final2StepA final2StepA2 = new Final2StepA();
        addObject(final2StepA2,272,479);
        final2StepA.setLocation(174,457);
        final2StepA.setLocation(140,450);
        final2StepA.setLocation(148,517);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,167,387);
        cyrusPlayer.setLocation(142,453);
        cyrusPlayer.setLocation(155,459);
        SceneMessageWelcomeD sceneMessageWelcomeD = new SceneMessageWelcomeD();
        addObject(sceneMessageWelcomeD,443,102);
    }
}