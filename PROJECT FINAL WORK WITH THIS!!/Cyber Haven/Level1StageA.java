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
        bounceMedium.setLocation(432,383);
        bounceHigh.setLocation(804,500);
        bounceHigh2.setLocation(1016,480);
        bounceHigh2.setLocation(1016,476);
        bounceHigh.setLocation(798,485);
        bounceHigh.setLocation(800,476);
        BounceMedium bounceMedium2 = new BounceMedium();
        addObject(bounceMedium2,1312,285);
        bounceMedium2.setLocation(1356,313);
        bounceMedium2.setLocation(1342,351);
        Level1StepC level1StepC2 = new Level1StepC();
        addObject(level1StepC2,1496,444);
        level1StepC2.setLocation(1521,522);
        bounceMedium2.setLocation(1383,430);
        bounceMedium2.setLocation(1366,484);
        removeObject(bounceMedium2);
        level1StepC2.setLocation(1448,491);
        level1StepC2.setLocation(1534,516);
        BounceMedium bounceMedium3 = new BounceMedium();
        addObject(bounceMedium3,1355,401);
        bounceMedium3.setLocation(1363,519);
        bounceMedium3.setLocation(1363,524);
        SceneMessageWelcomeB sceneMessageWelcomeB = new SceneMessageWelcomeB();
        addObject(sceneMessageWelcomeB,524,117);
        sceneMessageWelcomeB.setLocation(457,96);
        sceneMessageWelcomeB.setLocation(298,126);
        sceneMessageWelcomeB.setLocation(399,136);
        CoinCollect coinCollect = new CoinCollect();
        addObject(coinCollect,785,352);
        coinCollect.setLocation(800,385);
        CoinCollect coinCollect2 = new CoinCollect();
        addObject(coinCollect2,807,310);
        coinCollect2.setLocation(802,322);
        coinCollect2.setLocation(799,325);
        CoinCollect coinCollect3 = new CoinCollect();
        addObject(coinCollect3,797,252);
        coinCollect3.setLocation(801,257);
        coinCollect3.setLocation(798,263);
        CoinCollect coinCollect4 = new CoinCollect();
        addObject(coinCollect4,1009,396);
        coinCollect4.setLocation(1010,399);
        coinCollect4.setLocation(1016,403);
        coinCollect4.setLocation(1017,381);
        coinCollect4.setLocation(1018,384);
        coinCollect4.setLocation(1013,385);
        CoinCollect coinCollect5 = new CoinCollect();
        addObject(coinCollect5,1011,315);
        coinCollect5.setLocation(1014,327);
        coinCollect5.setLocation(1009,319);
        CoinCollect coinCollect6 = new CoinCollect();
        addObject(coinCollect6,1008,249);
        coinCollect6.setLocation(1010,253);
        coinCollect4.setLocation(1014,396);
        coinCollect4.setLocation(1017,389);
        coinCollect4.setLocation(1016,391);
        coinCollect5.setLocation(1014,325);
        coinCollect6.setLocation(1011,254);
        CoinCollect coinCollect7 = new CoinCollect();
        addObject(coinCollect7,253,357);
        coinCollect7.setLocation(237,358);
        CoinCollect coinCollect8 = new CoinCollect();
        addObject(coinCollect8,270,359);
        coinCollect8.setLocation(273,355);
        coinCollect8.setLocation(276,361);
        coinCollect8.setLocation(276,357);
        coinCollect8.setLocation(276,358);
    }
}