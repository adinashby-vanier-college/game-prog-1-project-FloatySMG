import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldThreeStageE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldThreeStageE extends WorldThree
{

    /**
     * Constructor for objects of class WorldThreeStageE.
     * 
     */
    public WorldThreeStageE()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BonusCloudRed bonusCloudRed = new BonusCloudRed();
        addObject(bonusCloudRed,59,116);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,26,60);
        LevelThreeStepC levelThreeStepC = new LevelThreeStepC();
        addObject(levelThreeStepC,345,416);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,584,478);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,685,217);
        BonusCloudRed bonusCloudRed2 = new BonusCloudRed();
        addObject(bonusCloudRed2,919,248);
        BonusCloudRed bonusCloudRed3 = new BonusCloudRed();
        addObject(bonusCloudRed3,1046,248);
        removeObject(bonusCloudRed3);
        BonusCloud bonusCloud = new BonusCloud();
        addObject(bonusCloud,1046,248);
        addObject(bonusCloudRed3,1172,248);
        BonusCloud bonusCloud2 = new BonusCloud();
        addObject(bonusCloud2,1298,247);
        BonusCloudRed bonusCloudRed4 = new BonusCloudRed();
        addObject(bonusCloudRed4,1425,246);
        BonusCloud bonusCloud3 = new BonusCloud();
        addObject(bonusCloud3,1550,246);
        RobotLv2 robotLv2 = new RobotLv2();
        addObject(robotLv2,1552,180);
        robotLv2.setLocation(1562,171);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,691,585);
    }
}
