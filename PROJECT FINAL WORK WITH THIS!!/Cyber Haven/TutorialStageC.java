import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TutorialStageC extends TutorialStageBG {
    private int score;  // Add a score variable to keep track of the score
    private CoinCounter coinCounter;  // Coin counter object

    public TutorialStageC() {
        super();
        score = 0;  // Initialize the score
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Setup tutorial objects (your existing setup)

        TutorialStepH tutorialStepH = new TutorialStepH();
        addObject(tutorialStepH,527,431);
        tutorialStepH.setLocation(165,451);
        removeObject(tutorialStepH);
        TutorialStepE tutorialStepE = new TutorialStepE();
        addObject(tutorialStepE,121,479);
        tutorialStepE.setLocation(69,490);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,87,331);
        cyrusPlayer.setLocation(24,360);
        TutorialStepG tutorialStepG = new TutorialStepG();
        addObject(tutorialStepG,405,361);
        tutorialStepG.setLocation(282,445);
        tutorialStepG.setLocation(260,397);
        tutorialStepG.setLocation(253,493);
        TutorialStepB tutorialStepB = new TutorialStepB();
        addObject(tutorialStepB,282,125);
        tutorialStepB.setLocation(257,152);
        removeObject(tutorialStepG);
        TutorialStepB tutorialStepB2 = new TutorialStepB();
        addObject(tutorialStepB2,281,501);
        tutorialStepB2.setLocation(229,484);
        tutorialStepB2.setLocation(241,480);
        tutorialStepB2.setLocation(253,404);
        tutorialStepB2.setLocation(246,500);
        tutorialStepB.setLocation(251,232);
        tutorialStepB.setLocation(240,102);
        TutorialChain tutorialChain = new TutorialChain();
        addObject(tutorialChain,255,324);
        tutorialChain.setLocation(297,306);
        tutorialStepE.setLocation(32,420);
        tutorialChain.setLocation(318,280);
        tutorialChain.setLocation(255,318);
        removeObject(tutorialChain);
        removeObject(tutorialStepB);
        removeObject(tutorialStepB2);
        TutorialChain tutorialChain2 = new TutorialChain();
        addObject(tutorialChain2,653,254);
        tutorialChain2.setLocation(612,266);
        tutorialChain2.setLocation(235,385);
        tutorialStepE.setLocation(112,525);
        tutorialStepE.setLocation(36,467);
        tutorialStepE.setLocation(67,489);
        TutorialStepI tutorialStepI = new TutorialStepI();
        addObject(tutorialStepI,406,458);
        tutorialStepI.setLocation(304,492);
        TutorialStepG tutorialStepG2 = new TutorialStepG();
        addObject(tutorialStepG2,983,326);
        removeObject(tutorialStepG2);
        TutorialStepJ tutorialStepJ = new TutorialStepJ();
        addObject(tutorialStepJ,332,182);
        tutorialStepJ.setLocation(314,142);
        tutorialStepJ.setLocation(309,144);
        tutorialChain2.setLocation(338,314);
        tutorialChain2.setLocation(271,354);
        tutorialStepJ.setLocation(317,261);
        tutorialStepJ.setLocation(304,146);
        tutorialChain2.setLocation(318,320);
        tutorialChain2.setLocation(334,343);
        tutorialChain2.setLocation(316,339);
        tutorialChain2.setLocation(330,340);
        tutorialChain2.setLocation(321,340);
        tutorialChain2.setLocation(325,340);
        tutorialChain2.setLocation(329,340);
        tutorialChain2.setLocation(319,340);
        tutorialChain2.setLocation(327,340);
        tutorialChain2.setLocation(324,338);
        tutorialChain2.setLocation(292,335);
        tutorialChain2.setLocation(283,334);
        tutorialChain2.setLocation(307,333);
        tutorialChain2.setLocation(296,340);
        tutorialChain2.setLocation(303,342);
        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB,232,455);
        movePartsB.setLocation(223,401);
        tutorialStepI.setLocation(413,469);
        tutorialStepI.setLocation(417,500);
        tutorialStepJ.setLocation(439,237);
        tutorialStepJ.setLocation(412,170);
        tutorialStepJ.setLocation(410,149);
        tutorialStepI.setLocation(417,446);
        tutorialStepI.setLocation(410,500);
        tutorialChain2.setLocation(433,362);
        tutorialChain2.setLocation(427,341);
        tutorialChain2.setLocation(443,353);
        tutorialChain2.setLocation(427,346);
        tutorialChain2.setLocation(427,351);
        tutorialChain2.setLocation(429,347);
        tutorialChain2.setLocation(422,349);
        tutorialChain2.setLocation(419,349);
        tutorialChain2.setLocation(416,347);
        tutorialChain2.setLocation(423,349);
        tutorialChain2.setLocation(415,348);
        movePartsB.setLocation(238,420);
        movePartsB.setLocation(288,417);
        movePartsB.setLocation(252,409);
        movePartsB.setLocation(250,406);
        removeObject(tutorialChain2);
        tutorialStepJ.setLocation(366,237);
        removeObject(tutorialStepJ);
        tutorialStepI.setLocation(401,427);
        tutorialStepI.setLocation(440,506);
        tutorialStepI.setLocation(429,508);
        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA,642,447);
        movePartsA.setLocation(642,428);
        movePartsA.setLocation(633,419);
        MovePartsB movePartsB2 = new MovePartsB();
        addObject(movePartsB2,939,430);
        movePartsB2.setLocation(984,416);
        movePartsA.setLocation(687,431);
        movePartsA.setLocation(689,417);
        movePartsB2.setLocation(932,414);
        MovePartsA movePartsA2 = new MovePartsA();
        addObject(movePartsA2,1163,391);
        movePartsA2.setLocation(1176,417);
        TutorialStepG tutorialStepG3 = new TutorialStepG();
        addObject(tutorialStepG3,1493,483);
        tutorialStepG3.setLocation(1551,511);
        tutorialStepG3.setLocation(1539,559);
        TutorialStepG tutorialStepG4 = new TutorialStepG();
        addObject(tutorialStepG4,1375,496);
        tutorialStepG4.setLocation(1402,545);
        removeObject(tutorialStepG4);
        tutorialStepG3.setLocation(1498,521);
        tutorialStepG3.setLocation(1531,569);
        TutorialStepB tutorialStepB3 = new TutorialStepB();
        addObject(tutorialStepB3,1379,574);
        tutorialStepB3.setLocation(1435,567);
        tutorialStepB3.setLocation(1413,508);
        tutorialStepB3.setLocation(1419,567);
        tutorialStepB3.setLocation(1422,547);
        tutorialStepB3.setLocation(1414,560);
        movePartsB2.setLocation(962,345);
        movePartsB2.setLocation(930,352);
        movePartsB2.setLocation(940,343);
        TutorialStepK tutorialStepK = new TutorialStepK();
        addObject(tutorialStepK,1082,137);
        tutorialStepK.setLocation(1077,162);
        TutorialStepK tutorialStepK2 = new TutorialStepK();
        addObject(tutorialStepK2,1203,146);
        tutorialStepK2.setLocation(1203,170);
        tutorialStepK2.setLocation(1204,162);
        CoinCollect coinCollect = new CoinCollect();
        addObject(coinCollect,1047,121);
        coinCollect.setLocation(1053,111);
        coinCollect.setLocation(1047,113);
        CoinCollect coinCollect2 = new CoinCollect();
        addObject(coinCollect2,1086,105);
        coinCollect2.setLocation(1078,113);
        CoinCollect coinCollect3 = new CoinCollect();
        addObject(coinCollect3,1112,112);
        CoinCollect coinCollect4 = new CoinCollect();
        addObject(coinCollect4,1146,111);
        CoinCollect coinCollect5 = new CoinCollect();
        addObject(coinCollect5,1178,113);
        CoinCollect coinCollect6 = new CoinCollect();
        addObject(coinCollect6,1216,115);
        coinCollect6.setLocation(1211,112);
        CoinCollect coinCollect7 = new CoinCollect();
        addObject(coinCollect7,1235,110);
        coinCollect7.setLocation(1248,113);
        CoinCollect coinCollect8 = new CoinCollect();
        addObject(coinCollect8,410,387);
        coinCollect8.setLocation(400,387);
        CoinCollect coinCollect9 = new CoinCollect();
        addObject(coinCollect9,470,394);
        coinCollect9.setLocation(455,386);
        movePartsB2.setLocation(931,366);
        movePartsB2.setLocation(939,366);
        tutorialStepK.setLocation(1080,198);
        tutorialStepK2.setLocation(1174,170);
        tutorialStepK.setLocation(1122,188);
        tutorialStepK.setLocation(1190,198);
        tutorialStepK.setLocation(1105,198);
        tutorialStepK.setLocation(1090,187);
        tutorialStepK2.setLocation(1185,193);
        tutorialStepK2.setLocation(1221,186);
        tutorialStepK2.setLocation(1208,186);
    }

    // Method to add points to the score
    public void addScore(int points)
    {
        score += points;  // Increase the score by the given points
    //    System.out.println("Score: " + score);  // Optional: print the score to the console for testing
    }

    // Getter method to access the CoinCounter
    public CoinCounter getCoinCounter() {
        return coinCounter;
    }
}
