import greenfoot.*; 

public class FinalStageB extends FinalStageABG{

    public FinalStageB() {
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
        addObject(final1StepA,122,398);
        final1StepA.setLocation(78,399);
        final1StepA.setLocation(75,403);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,32,149);
        cyrusPlayer.setLocation(32,152);
    }
}