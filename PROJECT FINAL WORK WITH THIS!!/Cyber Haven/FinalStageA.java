import greenfoot.*; 

public class FinalStageA extends FinalStageABG{

    public FinalStageA() {
        super();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Final1StepA final1StepA = new Final1StepA();
        addObject(final1StepA,126,426);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,108,189);
        cyrusPlayer.setLocation(134,179);
        cyrusPlayer.setLocation(136,177);
        cyrusPlayer.setLocation(138,174);
    }
}