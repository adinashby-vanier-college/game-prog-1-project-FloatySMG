import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldTwoStageD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldTwoStageD extends WorldTwo
{

    /**
     * Constructor for objects of class WorldTwoStageD.
     * 
     */
    public WorldTwoStageD()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,51,248);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,154,248);
        BonusCloudRed bonusCloudRed = new BonusCloudRed();
        addObject(bonusCloudRed,270,252);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,34,193);
        BounceHigh bounceHigh2 = new BounceHigh();
        addObject(bounceHigh2,439,485);
        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB,630,274);
        BounceHigh bounceHigh3 = new BounceHigh();
        addObject(bounceHigh3,840,409);
        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA,1106,233);
        LevelTwoStepD levelTwoStepD = new LevelTwoStepD();
        addObject(levelTwoStepD,1398,448);
        LevelTwoStepD levelTwoStepD2 = new LevelTwoStepD();
        addObject(levelTwoStepD2,1540,448);
        levelTwoStepD.setLocation(1339,398);
        CannonBackgroud cannonBackgroud = new CannonBackgroud();
        addObject(cannonBackgroud,1339,398);
        levelTwoStepD.setLocation(1416,533);
        removeObject(levelTwoStepD);
        LevelTwoStepD levelTwoStepD3 = new LevelTwoStepD();
        addObject(levelTwoStepD3,1400,446);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,779,588);
    }
}
