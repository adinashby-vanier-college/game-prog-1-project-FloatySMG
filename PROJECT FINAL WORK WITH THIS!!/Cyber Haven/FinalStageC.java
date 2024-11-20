import greenfoot.*; 

public class FinalStageC extends FinalStageABG{

    public FinalStageC() {
        super();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Final1StepE final1StepE = new Final1StepE();
        addObject(final1StepE,809,324);
        final1StepE.setLocation(26,398);
        final1StepE.setLocation(218,355);
        final1StepE.setLocation(114,372);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,81,39);
        cyrusPlayer.setLocation(37,80);
        final1StepE.setLocation(71,141);
        final1StepE.setLocation(130,406);
        cyrusPlayer.setLocation(48,115);
        cyrusPlayer.setLocation(27,105);
        TimerBlockA timerBlockA = new TimerBlockA();
        addObject(timerBlockA,308,190);
        TimerBlockB timerBlockB = new TimerBlockB();
        addObject(timerBlockB,435,187);
        timerBlockB.setLocation(436,190);
        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB,370,489);
        Final1StepD final1StepD = new Final1StepD();
        addObject(final1StepD,1136,273);
        final1StepD.setRotation(180);
        final1StepD.setLocation(648,111);
        final1StepD.setLocation(638,69);
        final1StepD.setLocation(641,74);
        final1StepD.setLocation(642,74);
        final1StepD.setLocation(621,112);
        final1StepD.setLocation(638,66);
        movePartsB.setLocation(459,481);
        movePartsB.setLocation(437,483);
        movePartsB.setLocation(436,497);
        movePartsB.setLocation(441,458);
        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA,701,333);
        TimerBlockA timerBlockA2 = new TimerBlockA();
        addObject(timerBlockA2,936,380);
        TimerBlockB timerBlockB2 = new TimerBlockB();
        addObject(timerBlockB2,1158,288);
        Final1StepA final1StepA = new Final1StepA();
        addObject(final1StepA,1358,355);
        final1StepA.setLocation(1372,387);
        Final1StepA final1StepA2 = new Final1StepA();
        addObject(final1StepA2,1513,379);
        final1StepA2.setLocation(1559,352);
        final1StepA2.setLocation(1523,388);
    }
}