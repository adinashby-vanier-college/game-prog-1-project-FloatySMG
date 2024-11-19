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
    private void prepare() {
        Final1StepA final1StepA = new Final1StepA();
        addObject(final1StepA, 122, 398);
        final1StepA.setLocation(78, 399);
        final1StepA.setLocation(75, 403);

        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer, 32, 149);
        cyrusPlayer.setLocation(32, 152);

        Final1StepC final1StepC = new Final1StepC();
        addObject(final1StepC, 589, 389);
        final1StepC.setLocation(589, 380);
        final1StepC.setLocation(643, 394);

        TimerBlockA timerBlockA1 = new TimerBlockA();
        addObject(timerBlockA1, 218, 238);
        TimerBlockB timerBlockB1 = new TimerBlockB();
        addObject(timerBlockB1, 217, 366);
        timerBlockA1.setBlockB(timerBlockB1);
        timerBlockB1.setBlockA(timerBlockA1);

        TimerBlockA timerBlockA2 = new TimerBlockA();
        addObject(timerBlockA2, 344, 494);
        TimerBlockB timerBlockB2 = new TimerBlockB();
        addObject(timerBlockB2, 345, 366);
        timerBlockA2.setBlockB(timerBlockB2);
        timerBlockB2.setBlockA(timerBlockA2);

        TimerBlockA timerBlockA3 = new TimerBlockA();
        addObject(timerBlockA3, 470, 364);
        TimerBlockB timerBlockB3 = new TimerBlockB();
        addObject(timerBlockB3, 469, 364);
        timerBlockA3.setBlockB(timerBlockB3);
        timerBlockB3.setBlockA(timerBlockA3);

        TimerBlockA timerBlockA4 = new TimerBlockA();
        addObject(timerBlockA4, 589, 328);
        TimerBlockB timerBlockB4 = new TimerBlockB();
        addObject(timerBlockB4, 643, 394);
        timerBlockA4.setBlockB(timerBlockB4);
        timerBlockB4.setBlockA(timerBlockA4);

        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh, 478, 532);
        removeObject(timerBlockA4);
        removeObject(timerBlockB4);
        removeObject(timerBlockB3);
        removeObject(timerBlockA3);
        removeObject(bounceHigh);
        addObject(bounceHigh,479,349);
    }
}
