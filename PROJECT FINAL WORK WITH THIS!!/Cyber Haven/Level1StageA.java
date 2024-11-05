import greenfoot.*; 

public class Level1StageA extends Level1StageBG{

    public Level1StageA() {
        super();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Level1StepA level1StepA = new Level1StepA();
        addObject(level1StepA,375,388);
        level1StepA.setLocation(122,447);
        level1StepA.setLocation(118,476);
        level1StepA.setLocation(109,478);
        Level1StepA level1StepA2 = new Level1StepA();
        addObject(level1StepA2,791,355);
        level1StepA2.setLocation(279,524);
        level1StepA2.setLocation(271,473);
        level1StepA2.setLocation(255,568);
        level1StepA2.setLocation(257,521);
        level1StepA2.setLocation(262,539);
        level1StepA2.setLocation(261,523);
        level1StepA2.setLocation(260,505);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,138,252);
        cyrusPlayer.setLocation(84,327);
        Level1StepB level1StepB = new Level1StepB();
        addObject(level1StepB,750,270);
        level1StepB.setLocation(678,426);
        level1StepB.setLocation(690,401);
        level1StepB.setLocation(689,397);
        level1StepB.setLocation(687,406);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,441,410);
        bounceMedium.setLocation(492,390);
        bounceMedium.setLocation(469,402);
        bounceMedium.setLocation(426,389);
        bounceMedium.setLocation(432,397);
        level1StepB.setLocation(592,390);
        level1StepB.setLocation(600,408);
        level1StepB.setLocation(608,413);
        Level1StepC level1StepC = new Level1StepC();
        addObject(level1StepC,1216,379);
        level1StepC.setLocation(1103,442);
        level1StepC.setLocation(1190,438);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,777,529);
        bounceHigh.setLocation(802,516);
        BounceHigh bounceHigh2 = new BounceHigh();
        addObject(bounceHigh2,1007,516);
        bounceHigh2.setLocation(1039,526);
        bounceHigh2.setLocation(1012,516);
    }
}