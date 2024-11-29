import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldTwoStageB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldTwoStageB extends WorldTwo
{

    /**
     * Constructor for objects of class WorldTwoStageB.
     * 
     */
    public WorldTwoStageB()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelTwoStepC levelTwoStepC = new LevelTwoStepC();
        addObject(levelTwoStepC,70,447);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,27,265);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,260,384);
        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA,522,272);
        LevelTwoStepD levelTwoStepD = new LevelTwoStepD();
        addObject(levelTwoStepD,806,446);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,995,508);
        BounceHigh bounceHigh2 = new BounceHigh();
        addObject(bounceHigh2,1100,507);
        bounceHigh2.setLocation(1114,503);
        LevelTwoStepC levelTwoStepC2 = new LevelTwoStepC();
        addObject(levelTwoStepC2,1284,451);
        removeObject(levelTwoStepC2);
        LevelTwoStepA levelTwoStepA = new LevelTwoStepA();
        addObject(levelTwoStepA,1286,409);
        removeObject(bounceHigh2);
        BounceHigh bounceHigh3 = new BounceHigh();
        addObject(bounceHigh3,1099,508);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,895,583);
        BonusCloudRed bonusCloudRed = new BonusCloudRed();
        addObject(bonusCloudRed,1537,239);
        BonusCloudRed bonusCloudRed2 = new BonusCloudRed();
        addObject(bonusCloudRed2,1415,240);
        levelTwoStepA.setLocation(1264,385);
        levelTwoStepA.setLocation(1264,383);
        removeObject(levelTwoStepA);
        LevelTwoStepA levelTwoStepA2 = new LevelTwoStepA();
        addObject(levelTwoStepA2,1270,406);
    }
}
