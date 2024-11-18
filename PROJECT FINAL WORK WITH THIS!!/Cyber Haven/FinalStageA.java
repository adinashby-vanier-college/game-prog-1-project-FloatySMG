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
        addObject(final1StepA,80,385);
        final1StepA.setLocation(83,380);
        Final1StepA final1StepA2 = new Final1StepA();
        addObject(final1StepA2,220,464);
        final1StepA2.setLocation(252,399);
        final1StepA2.setLocation(222,448);
        final1StepA2.setLocation(230,439);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,41,114);
        cyrusPlayer.setLocation(42,139);
        final1StepA.setLocation(102,304);
        final1StepA.setLocation(83,402);
        final1StepA.setLocation(76,400);
        final1StepA2.setLocation(200,395);
        final1StepA2.setLocation(227,447);
        cyrusPlayer.setLocation(49,149);
        Final1StepB final1StepB = new Final1StepB();
        addObject(final1StepB,718,429);
        Final1StepB final1StepB2 = new Final1StepB();
        addObject(final1StepB2,876,430);
        final1StepB2.setLocation(897,416);
        final1StepB2.setLocation(874,429);
        RobotLv1 robotLv1 = new RobotLv1();
        addObject(robotLv1,880,216);
    }
}