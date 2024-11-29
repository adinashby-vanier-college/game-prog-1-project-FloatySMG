import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldThreeStageF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldThreeStageF extends WorldThree
{

    /**
     * Constructor for objects of class WorldThreeStageF.
     * 
     */
    public WorldThreeStageF()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelThreeStepE levelThreeStepE = new LevelThreeStepE();
        addObject(levelThreeStepE,1496,478);
        SpaceStation spaceStation = new SpaceStation();
        addObject(spaceStation,1510,208);
        spaceStation.setLocation(1511,214);
        removeObject(levelThreeStepE);
        addObject(levelThreeStepE,1503,482);
        removeObject(spaceStation);
        addObject(spaceStation,1508,215);
        BonusCloudRed bonusCloudRed = new BonusCloudRed();
        addObject(bonusCloudRed,1435,65);
        BonusCloudRed bonusCloudRed2 = new BonusCloudRed();
        addObject(bonusCloudRed2,1555,65);
        removeObject(bonusCloudRed);
        removeObject(bonusCloudRed2);
        SpaceStation spaceStation2 = new SpaceStation();
        addObject(spaceStation2,1508,52);
        LevelTwoStepE levelTwoStepE = new LevelTwoStepE();
        addObject(levelTwoStepE,1220,489);
        removeObject(levelThreeStepE);
        LevelThreeStepE levelThreeStepE2 = new LevelThreeStepE();
        addObject(levelThreeStepE2,1493,474);
        BonusCloud bonusCloud = new BonusCloud();
        addObject(bonusCloud,59,114);
        BonusCloudRed bonusCloudRed3 = new BonusCloudRed();
        addObject(bonusCloudRed3,183,114);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,38,59);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,664,581);
        deathZone.setLocation(359,562);
        LevelThreeStepD levelThreeStepD = new LevelThreeStepD();
        addObject(levelThreeStepD,359,562);
        LevelThreeStepA levelThreeStepA = new LevelThreeStepA();
        addObject(levelThreeStepA,579,524);
        removeObject(levelThreeStepA);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,522,485);
        BounceHigh bounceHigh2 = new BounceHigh();
        addObject(bounceHigh2,673,354);
        BounceHigh bounceHigh3 = new BounceHigh();
        addObject(bounceHigh3,825,240);
        BounceHigh bounceHigh4 = new BounceHigh();
        addObject(bounceHigh4,998,238);
    }
}
