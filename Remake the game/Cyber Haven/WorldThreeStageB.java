import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldThreeStageB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldThreeStageB extends WorldThree
{

    /**
     * Constructor for objects of class WorldThreeStageB.
     * 
     */
    public WorldThreeStageB()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelThreeStepA levelThreeStepA = new LevelThreeStepA();
        addObject(levelThreeStepA,59,414);
        LevelThreeStepD levelThreeStepD = new LevelThreeStepD();
        addObject(levelThreeStepD,326,512);
        LevelThreeStepD levelThreeStepD2 = new LevelThreeStepD();
        addObject(levelThreeStepD2,462,512);
        LevelThreeStepD levelThreeStepD3 = new LevelThreeStepD();
        addObject(levelThreeStepD3,595,553);
        LevelThreeStepD levelThreeStepD4 = new LevelThreeStepD();
        addObject(levelThreeStepD4,729,553);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,29,201);
        RobotLv1 robotLv1 = new RobotLv1();
        addObject(robotLv1,727,415);
        RobotLv1 robotLv12 = new RobotLv1();
        addObject(robotLv12,385,370);
        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB,920,439);
        MovePartsB movePartsB2 = new MovePartsB();
        addObject(movePartsB2,1151,328);
        BonusCloudRed bonusCloudRed = new BonusCloudRed();
        addObject(bonusCloudRed,1335,229);
        BonusCloudRed bonusCloudRed2 = new BonusCloudRed();
        addObject(bonusCloudRed2,1459,229);
        BonusCloudRed bonusCloudRed3 = new BonusCloudRed();
        addObject(bonusCloudRed3,1582,228);
        BonusCloudRed bonusCloudRed4 = new BonusCloudRed();
        addObject(bonusCloudRed4,1344,459);
        BonusCloudRed bonusCloudRed5 = new BonusCloudRed();
        addObject(bonusCloudRed5,1471,458);
        removeObject(bonusCloudRed3);
        LevelThreeStepA levelThreeStepA2 = new LevelThreeStepA();
        addObject(levelThreeStepA2,1584,412);
        removeObject(bonusCloudRed2);
        removeObject(bonusCloudRed);
        addObject(bonusCloudRed,1460,249);
        addObject(bonusCloudRed2,1333,248);
        RobotLv1 robotLv13 = new RobotLv1();
        addObject(robotLv13,1497,392);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,929,590);
        removeObject(robotLv1);
    }
}
