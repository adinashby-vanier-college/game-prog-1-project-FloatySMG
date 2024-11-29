import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldTwoStageE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldTwoStageE extends WorldTwo
{

    /**
     * Constructor for objects of class WorldTwoStageE.
     * 
     */
    public WorldTwoStageE()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,33,256);
        LevelTwoStepD levelTwoStepD = new LevelTwoStepD();
        addObject(levelTwoStepD,70,444);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,194,304);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,298,303);
        removeObject(bounceHigh);
        removeObject(bounceMedium);
        BonusCloudRed bonusCloudRed = new BonusCloudRed();
        addObject(bonusCloudRed,526,188);
        LevelOneStepG levelOneStepG = new LevelOneStepG();
        addObject(levelOneStepG,726,189);
        BounceMedium bounceMedium2 = new BounceMedium();
        addObject(bounceMedium2,373,389);
        LevelTwoStepB levelTwoStepB = new LevelTwoStepB();
        addObject(levelTwoStepB,932,234);
        BonusCloudRed bonusCloudRed2 = new BonusCloudRed();
        addObject(bonusCloudRed2,881,384);
        BonusCloudRed bonusCloudRed3 = new BonusCloudRed();
        addObject(bonusCloudRed3,1001,384);
        BounceMedium bounceMedium3 = new BounceMedium();
        addObject(bounceMedium3,1172,232);
        BounceMedium bounceMedium4 = new BounceMedium();
        addObject(bounceMedium4,1274,232);
        LevelTwoStepD levelTwoStepD2 = new LevelTwoStepD();
        addObject(levelTwoStepD2,1537,454);
        levelTwoStepD2.setLocation(1470,454);
        CannonBackgroud cannonBackgroud = new CannonBackgroud();
        addObject(cannonBackgroud,1470,454);
        levelTwoStepD.setLocation(137,502);
        CannonBackgroud cannonBackgroud2 = new CannonBackgroud();
        addObject(cannonBackgroud2,137,502);
        levelTwoStepD.setLocation(62,411);
        removeObject(levelTwoStepD);
        removeObject(levelTwoStepD2);
        LevelTwoStepD levelTwoStepD3 = new LevelTwoStepD();
        addObject(levelTwoStepD3,1548,448);
        LevelTwoStepD levelTwoStepD4 = new LevelTwoStepD();
        addObject(levelTwoStepD4,59,434);
        levelTwoStepD4.setLocation(80,536);
        removeObject(levelTwoStepD4);
        LevelTwoStepD levelTwoStepD5 = new LevelTwoStepD();
        addObject(levelTwoStepD5,61,443);
        cyrusPlayer.setLocation(37,247);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,903,594);
    }
}
