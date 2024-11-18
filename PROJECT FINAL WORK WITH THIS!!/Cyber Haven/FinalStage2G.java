import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A specialized version of FinalStageBBG with time-step management.
 */
public class FinalStage2G extends FinalStageBBG
{
    private long lastFrameTimeMS;
    private double timeStepDuration;

    public FinalStage2G()
    {
        super();
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; // Default timestep
        prepare();
    }

    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }

    /**
     * Returns the time-step duration in seconds.
     */
    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Final2StepA final2StepA = new Final2StepA();
        addObject(final2StepA,74,517);
        final2StepA.setLocation(64,513);
        Final2StepA final2StepA2 = new Final2StepA();
        addObject(final2StepA2,200,512);
        final2StepA2.setLocation(206,498);
        final2StepA2.setLocation(199,513);
        Final2StepA final2StepA3 = new Final2StepA();
        addObject(final2StepA3,1530,349);
        Final2StepA final2StepA4 = new Final2StepA();
        addObject(final2StepA4,1393,347);
        final2StepA4.setLocation(1394,349);
        RobotBoss robotBoss = new RobotBoss();
        addObject(robotBoss,1395,185);
        robotBoss.setLocation(1393,190);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,54,442);
        cyrusPlayer.setLocation(40,457);
        Cannon cannon = new Cannon();
        addObject(cannon,214,442);
        cannon.setLocation(224,424);
        cannon.setLocation(195,443);
        cannon.setLocation(197,444);
        cannon.setLocation(204,427);
    }
}
