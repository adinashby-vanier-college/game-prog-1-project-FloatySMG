import greenfoot.*; 

public class TutorialStageD extends TutorialStageBG {

    public TutorialStageD() {
        super();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,902,381);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,892,292);
        cyrusPlayer.setLocation(896,294);
        removeObject(bounceMedium);
        TutorialStepE tutorialStepE = new TutorialStepE();
        addObject(tutorialStepE,225,379);
        removeObject(tutorialStepE);
        TutorialStepA tutorialStepA = new TutorialStepA();
        addObject(tutorialStepA,956,494);
        tutorialStepA.setLocation(60,498);
        tutorialStepA.setLocation(64,496);
        cyrusPlayer.setLocation(41,371);
        cyrusPlayer.setLocation(19,371);
        cyrusPlayer.setLocation(17,366);
        cyrusPlayer.setLocation(31,370);
        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB,222,398);
        movePartsB.setLocation(231,409);
        MovePartsB movePartsB2 = new MovePartsB();
        addObject(movePartsB2,402,308);
        movePartsB2.setLocation(476,339);
        MovePartsB movePartsB3 = new MovePartsB();
        addObject(movePartsB3,659,438);
        movePartsB3.setLocation(667,454);
        MovePartsB movePartsB4 = new MovePartsB();
        addObject(movePartsB4,846,365);
        movePartsB4.setLocation(867,351);
        movePartsB4.setLocation(896,349);
        movePartsB2.setLocation(521,349);
        movePartsB2.setLocation(492,347);
        movePartsB3.setLocation(686,434);
        movePartsB3.setLocation(698,448);
        movePartsB4.setLocation(872,356);
        movePartsB4.setLocation(911,340);
        movePartsB4.setLocation(909,363);
        TutorialStepG tutorialStepG = new TutorialStepG();
        addObject(tutorialStepG,1077,457);
        tutorialStepG.setLocation(1086,475);
        TutorialStepG tutorialStepG2 = new TutorialStepG();
        addObject(tutorialStepG2,1319,462);
        tutorialStepG2.setLocation(1222,460);
        tutorialStepG2.setLocation(1232,476);
        tutorialStepG2.setLocation(1229,475);
        tutorialStepG.setLocation(1086,435);
        tutorialStepG.setLocation(1119,509);
        tutorialStepG.setLocation(1094,498);
        tutorialStepG.setLocation(1101,508);
        TutorialStepG tutorialStepG3 = new TutorialStepG();
        addObject(tutorialStepG3,1416,468);
        tutorialStepG3.setLocation(1357,451);
        tutorialStepG3.setLocation(1372,476);
        tutorialStepG3.setLocation(1392,431);
        tutorialStepG3.setLocation(1371,475);
        TutorialStepG tutorialStepG4 = new TutorialStepG();
        addObject(tutorialStepG4,1520,463);
        tutorialStepG4.setLocation(1528,475);
        tutorialStepG3.setLocation(1452,440);
        tutorialStepG3.setLocation(1381,475);
        tutorialStepG3.setLocation(1380,466);
        tutorialStepG3.setLocation(1388,474);
        tutorialStepG2.setLocation(1275,428);
        tutorialStepG2.setLocation(1249,475);
        tutorialStepG2.setLocation(1258,469);
        tutorialStepG2.setLocation(1251,475);
        tutorialStepG.setLocation(1146,460);
        tutorialStepG.setLocation(1115,511);
        removeObject(tutorialStepG);
        removeObject(movePartsB);
        removeObject(movePartsB2);
        removeObject(movePartsB3);
        removeObject(movePartsB4);
        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA,276,404);
        movePartsA.setLocation(329,411);
        MovePartsA movePartsA2 = new MovePartsA();
        addObject(movePartsA2,536,325);
        MovePartsA movePartsA3 = new MovePartsA();
        addObject(movePartsA3,696,461);
        movePartsA3.setLocation(684,461);
        MovePartsB movePartsB5 = new MovePartsB();
        addObject(movePartsB5,1058,465);
        movePartsB5.setLocation(1034,463);
        movePartsB5.setLocation(1111,465);
        movePartsB5.setLocation(1116,482);
        movePartsB5.setLocation(1086,478);
        MovePartsA movePartsA4 = new MovePartsA();
        addObject(movePartsA4,939,484);
        movePartsA4.setLocation(942,477);
        movePartsA4.setLocation(926,480);
        removeObject(movePartsA4);
        MovePartsB movePartsB6 = new MovePartsB();
        addObject(movePartsB6,931,487);
        movePartsB6.setLocation(938,480);
        movePartsB6.setLocation(920,423);
        movePartsB6.setLocation(939,420);
        movePartsB5.setLocation(1049,415);
        movePartsB5.setLocation(1084,422);
        CoinCollect coinCollect = new CoinCollect();
        addObject(coinCollect,328,365);
        coinCollect.setLocation(326,363);
        CoinCollect coinCollect2 = new CoinCollect();
        addObject(coinCollect2,528,270);
        coinCollect2.setLocation(535,276);
        coinCollect2.setLocation(536,279);
        CoinCollect coinCollect3 = new CoinCollect();
        addObject(coinCollect3,700,414);
        coinCollect3.setLocation(687,418);
        CoinCollect coinCollect4 = new CoinCollect();
        addObject(coinCollect4,1252,291);
        coinCollect4.setLocation(1255,288);
        CoinCollect coinCollect5 = new CoinCollect();
        addObject(coinCollect5,1316,292);
        coinCollect5.setLocation(1321,287);
        CoinCollect coinCollect6 = new CoinCollect();
        addObject(coinCollect6,1389,288);
        coinCollect6.setLocation(1388,288);
        CoinCollect coinCollect7 = new CoinCollect();
        addObject(coinCollect7,1450,295);
        coinCollect7.setLocation(1450,287);
        coinCollect7.setLocation(1458,292);
        coinCollect7.setLocation(1454,289);
        CoinCollect coinCollect8 = new CoinCollect();
        addObject(coinCollect8,1509,291);
        coinCollect8.setLocation(1520,291);
        coinCollect8.setLocation(1516,287);
    }
}
