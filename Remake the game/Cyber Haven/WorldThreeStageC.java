import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldThreeStageC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldThreeStageC extends WorldThree
{

    /**
     * Constructor for objects of class WorldThreeStageC.
     * 
     */
    public WorldThreeStageC()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelThreeStepB levelThreeStepB = new LevelThreeStepB();
        addObject(levelThreeStepB,239,494);
        LevelThreeStepA levelThreeStepA = new LevelThreeStepA();
        addObject(levelThreeStepA,61,412);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,37,196);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,771,582);
        levelThreeStepB.setLocation(294,423);
        LevelThreeStepD levelThreeStepD = new LevelThreeStepD();
        addObject(levelThreeStepD,475,527);
        LevelThreeStepD levelThreeStepD2 = new LevelThreeStepD();
        addObject(levelThreeStepD2,611,527);
        RobotLv2 robotLv2 = new RobotLv2();
        addObject(robotLv2,158,348);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,922,446);
        BounceHigh bounceHigh2 = new BounceHigh();
        addObject(bounceHigh2,1025,446);
        LevelOneStepC levelOneStepC = new LevelOneStepC();
        addObject(levelOneStepC,1256,248);
        removeObject(levelOneStepC);
        LevelThreeStepC levelThreeStepC = new LevelThreeStepC();
        addObject(levelThreeStepC,1236,423);
        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA,1407,209);
        removeObject(movePartsA);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,1366,264);
        BounceMedium bounceMedium2 = new BounceMedium();
        addObject(bounceMedium2,1467,263);
        BounceMedium bounceMedium3 = new BounceMedium();
        addObject(bounceMedium3,1571,263);
        removeObject(levelThreeStepB);
        removeObject(levelThreeStepA);
        LevelThreeStepB levelThreeStepB2 = new LevelThreeStepB();
        addObject(levelThreeStepB2,240,495);
        LevelThreeStepA levelThreeStepA2 = new LevelThreeStepA();
        addObject(levelThreeStepA2,65,411);
        robotLv2.setLocation(354,360);
        removeObject(robotLv2);
        RobotLv2 robotLv22 = new RobotLv2();
        addObject(robotLv22,1570,195);
        removeObject(robotLv22);
        RobotLv1 robotLv1 = new RobotLv1();
        addObject(robotLv1,1558,194);
    }
}
