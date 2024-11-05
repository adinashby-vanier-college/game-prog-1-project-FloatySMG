import greenfoot.*; 

public class TutorialStageD extends TutorialStageBG {

    public TutorialStageD() {
        super();
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,902,381);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,892,292);
        cyrusPlayer.setLocation(896,294);
    }
}
