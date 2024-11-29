import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldTwoStageF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldTwoStageF extends WorldTwo
{

    /**
     * Constructor for objects of class WorldTwoStageF.
     * 
     */
    public WorldTwoStageF()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelTwoStepD levelTwoStepD = new LevelTwoStepD();
        addObject(levelTwoStepD,60,442);
        LevelOneStepG levelOneStepG = new LevelOneStepG();
        addObject(levelOneStepG,268,304);
        BonusCloudRed bonusCloudRed = new BonusCloudRed();
        addObject(bonusCloudRed,468,312);
        bonusCloudRed.setLocation(468,310);
        bonusCloudRed.setLocation(467,304);
        removeObject(bonusCloudRed);
        addObject(bonusCloudRed,467,303);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,32,253);
        removeObject(bonusCloudRed);
        LevelTwoStepA levelTwoStepA = new LevelTwoStepA();
        addObject(levelTwoStepA,474,409);
        LevelTwoStepE levelTwoStepE = new LevelTwoStepE();
        addObject(levelTwoStepE,1435,502);
        LevelTwoStepE levelTwoStepE2 = new LevelTwoStepE();
        addObject(levelTwoStepE2,1010,481);
        levelTwoStepE2.setRotation(180);
        removeObject(levelTwoStepE2);
        ToTheCity toTheCity = new ToTheCity();
        addObject(toTheCity,1511,340);
        toTheCity.setLocation(1471,311);
        toTheCity.setLocation(1471,308);
        toTheCity.setLocation(1456,310);
        removeObject(toTheCity);
        addObject(toTheCity,1503,337);
        removeObject(cyrusPlayer);
        CyrusPlayer cyrusPlayer2 = new CyrusPlayer();
        addObject(cyrusPlayer2,30,253);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,703,500);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,1080,447);
        BounceMedium bounceMedium2 = new BounceMedium();
        addObject(bounceMedium2,918,451);
        bounceHigh.setLocation(1079,400);
        bounceHigh.setLocation(1107,416);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,898,594);
    }
}
