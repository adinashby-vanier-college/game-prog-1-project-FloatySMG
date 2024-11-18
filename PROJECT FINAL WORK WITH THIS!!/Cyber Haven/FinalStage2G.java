import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A specialized version of FinalStageBBG with time-step management and dynamic music handling.
 */
public class FinalStage2G extends FinalStageBBG {
    private long lastFrameTimeMS;
    private double timeStepDuration;
    private GreenfootSound bossMusic;
    private boolean bossMusicPlaying;
    private RobotBoss robotBoss;

    public FinalStage2G() {
        super();
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; // Default timestep
        bossMusic = new GreenfootSound("CYBER_BOSS_BGM.wav");
        bossMusicPlaying = false;
        prepare();
    }

    public void started() {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act() {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();

        // Check the state of the RobotBoss and handle music accordingly
        handleMusic();
    }

    /**
     * Returns the time-step duration in seconds.
     */
    public double getTimeStepDuration() {
        return timeStepDuration;
    }

    /**
     * Handles music switching based on RobotBoss's state.
     */
    private void handleMusic() {
        // Ensure the RobotBoss is tracked (if not already)
        if (robotBoss == null) {
            robotBoss = (RobotBoss) getObjects(RobotBoss.class).stream()
                    .findFirst()
                    .orElse(null);
        }

        if (robotBoss != null && !bossMusicPlaying) {
            // Stop the original music and start the boss music
            stopSound();
            bossMusic.playLoop();
            bossMusicPlaying = true;
        } else if (robotBoss == null && bossMusicPlaying) {
            // RobotBoss is dead, stop boss music and return to original music
            bossMusic.stop();
            playSound();
            bossMusicPlaying = false;
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        Final2StepA final2StepA = new Final2StepA();
        addObject(final2StepA, 74, 517);
        final2StepA.setLocation(64, 513);
        Final2StepA final2StepA2 = new Final2StepA();
        addObject(final2StepA2, 200, 512);
        final2StepA2.setLocation(206, 498);
        final2StepA2.setLocation(199, 513);
        Final2StepA final2StepA3 = new Final2StepA();
        addObject(final2StepA3, 1530, 349);
        Final2StepA final2StepA4 = new Final2StepA();
        addObject(final2StepA4, 1393, 347);
        final2StepA4.setLocation(1394, 349);
        robotBoss = new RobotBoss();
        addObject(robotBoss, 1395, 185);
        robotBoss.setLocation(1393, 190);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer, 54, 442);
        cyrusPlayer.setLocation(40, 457);
        Cannon cannon = new Cannon();
        addObject(cannon, 214, 442);
        cannon.setLocation(224, 424);
        cannon.setLocation(195, 443);
        cannon.setLocation(197, 444);
        cannon.setLocation(204, 427);
        cannon.setLocation(79, 457);
        Final2StepA final2StepA5 = new Final2StepA();
        addObject(final2StepA5, 335, 513);

        cannon.setLocation(67, 457);
        removeObject(final2StepA4);
        removeObject(final2StepA3);
        Final2StepC final2StepC = new Final2StepC();
        addObject(final2StepC, 1345, 432);
        final2StepC.setLocation(1428, 429);
        removeObject(final2StepC);
        Final2StepB final2StepB = new Final2StepB();
        addObject(final2StepB, 1321, 378);
        Final2StepB final2StepB2 = new Final2StepB();
        addObject(final2StepB2, 1515, 379);
        final2StepB.setLocation(1387, 363);
        final2StepB.setLocation(1339, 353);
        final2StepB.setLocation(1349, 378);
        final2StepB.setLocation(1349, 380);
        final2StepB.setLocation(1349, 379);


    }
}
