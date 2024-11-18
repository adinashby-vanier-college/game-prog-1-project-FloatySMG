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
    private void prepare() {
        Final1StepA final1StepA = new Final1StepA();
        addObject(final1StepA, 80, 385);
        final1StepA.setLocation(83, 380);

        Final1StepA final1StepA2 = new Final1StepA();
        addObject(final1StepA2, 220, 464);
        final1StepA2.setLocation(252, 399);
        final1StepA2.setLocation(222, 448);
        final1StepA2.setLocation(230, 439);

        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer, 41, 114);
        cyrusPlayer.setLocation(42, 139);

        final1StepA.setLocation(102, 304);
        final1StepA.setLocation(83, 402);
        final1StepA.setLocation(76, 400);
        final1StepA2.setLocation(200, 395);
        final1StepA2.setLocation(227, 447);
        cyrusPlayer.setLocation(49, 149);

        Final1StepB final1StepB = new Final1StepB();
        addObject(final1StepB, 718, 429);
        Final1StepB final1StepB2 = new Final1StepB();
        addObject(final1StepB2, 876, 430);
        final1StepB2.setLocation(897, 416);
        final1StepB2.setLocation(874, 429);

        RobotLv1 robotLv1 = new RobotLv1();
        addObject(robotLv1, 880, 216);

        TimerBlockA timerBlockA1 = new TimerBlockA();
        addObject(timerBlockA1, 370, 277);
        TimerBlockB timerBlockB1 = new TimerBlockB();
        addObject(timerBlockB1, 502, 276);
        timerBlockA1.setBlockB(timerBlockB1);
        timerBlockB1.setBlockA(timerBlockA1);

        TimerBlockA timerBlockA2 = new TimerBlockA();
        addObject(timerBlockA2, 1017, 313);
        TimerBlockB timerBlockB2 = new TimerBlockB();
        addObject(timerBlockB2, 1144, 312);
        timerBlockA2.setBlockB(timerBlockB2);
        timerBlockB2.setBlockA(timerBlockA2);

        TimerBlockA timerBlockA3 = new TimerBlockA();
        addObject(timerBlockA3, 1272, 312);
        TimerBlockB timerBlockB3 = new TimerBlockB();
        addObject(timerBlockB3, 1401, 311);
        timerBlockA3.setBlockB(timerBlockB3);
        timerBlockB3.setBlockA(timerBlockA3);

        Final1StepA final1StepA3 = new Final1StepA();
        addObject(final1StepA3, 1470, 327);
        final1StepA3.setLocation(1549, 482);
        final1StepA3.setLocation(1526, 436);
        final1StepA3.setLocation(1530, 397);
        final1StepA3.setLocation(1540, 479);
        removeObject(robotLv1);
    }
}
