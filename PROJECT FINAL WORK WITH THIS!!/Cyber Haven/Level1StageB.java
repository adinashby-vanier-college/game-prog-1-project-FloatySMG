import greenfoot.*; 

public class Level1StageB extends Level1StageBG{

    public Level1StageB() {
        super();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Level1StepB level1StepB = new Level1StepB();
        addObject(level1StepB,74,398);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,42,134);
        cyrusPlayer.setLocation(59,183);
        cyrusPlayer.setLocation(39,187);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,261,492);
        BounceHigh bounceHigh2 = new BounceHigh();
        addObject(bounceHigh2,479,363);
        BounceHigh bounceHigh3 = new BounceHigh();
        addObject(bounceHigh3,680,235);
        Level1StepC level1StepC = new Level1StepC();
        addObject(level1StepC,936,447);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,1177,353);
        bounceMedium.setLocation(1188,333);
        removeObject(bounceMedium);
        addObject(bounceMedium,1203,345);
        Level1StepC level1StepC2 = new Level1StepC();
        addObject(level1StepC2,1527,440);
        Level1StepC level1StepC3 = new Level1StepC();
        addObject(level1StepC3,1373,435);
        level1StepC3.setLocation(1380,362);
        level1StepC3.setLocation(1380,362);
        bounceMedium.setLocation(1158,337);
        level1StepC3.setLocation(1356,402);
        removeObject(level1StepC3);
        Level1StepC level1StepC4 = new Level1StepC();
        addObject(level1StepC4,1376,438);
        bounceHigh3.setLocation(701,319);
        removeObject(level1StepC);
        Level1StepB level1StepB2 = new Level1StepB();
        addObject(level1StepB2,918,404);
        CoinCollect coinCollect = new CoinCollect();
        addObject(coinCollect,255,447);
        coinCollect.setLocation(258,441);
        CoinCollect coinCollect2 = new CoinCollect();
        addObject(coinCollect2,247,397);
        coinCollect2.setLocation(259,404);
        CoinCollect coinCollect3 = new CoinCollect();
        addObject(coinCollect3,476,307);
        CoinCollect coinCollect4 = new CoinCollect();
        addObject(coinCollect4,477,271);
        CoinCollect coinCollect5 = new CoinCollect();
        addObject(coinCollect5,699,273);
        CoinCollect coinCollect6 = new CoinCollect();
        addObject(coinCollect6,699,238);
        CoinCollect coinCollect7 = new CoinCollect();
        addObject(coinCollect7,1374,251);
        CoinCollect coinCollect8 = new CoinCollect();
        addObject(coinCollect8,1416,256);
        coinCollect8.setLocation(1418,246);
        CoinCollect coinCollect9 = new CoinCollect();
        addObject(coinCollect9,1331,250);
    }
}