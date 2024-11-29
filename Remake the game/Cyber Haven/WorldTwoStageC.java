import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldTwoStageC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldTwoStageC extends WorldTwo
{

    /**
     * Constructor for objects of class WorldTwoStageC.
     * 
     */
    public WorldTwoStageC()
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
        addObject(bonusCloudRed,62,121);
        BonusCloudRed bonusCloudRed2 = new BonusCloudRed();
        addObject(bonusCloudRed2,189,121);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,32,66);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,359,515);
        BounceHigh bounceHigh2 = new BounceHigh();
        addObject(bounceHigh2,463,515);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,787,586);
        LevelTwoStepB levelTwoStepB = new LevelTwoStepB();
        addObject(levelTwoStepB,670,218);
        BonusCloudRed bonusCloudRed3 = new BonusCloudRed();
        addObject(bonusCloudRed3,628,369);
        BonusCloudRed bonusCloudRed4 = new BonusCloudRed();
        addObject(bonusCloudRed4,748,370);
        levelTwoStepB.setLocation(711,290);
        removeObject(levelTwoStepB);
        LevelTwoStepB levelTwoStepB2 = new LevelTwoStepB();
        addObject(levelTwoStepB2,688,210);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,944,369);
        LevelTwoStepA levelTwoStepA = new LevelTwoStepA();
        addObject(levelTwoStepA,1144,411);
        BounceMedium bounceMedium2 = new BounceMedium();
        addObject(bounceMedium2,1267,378);
        BounceHigh bounceHigh3 = new BounceHigh();
        addObject(bounceHigh3,1371,378);
        BounceMedium bounceMedium3 = new BounceMedium();
        addObject(bounceMedium3,1477,378);
        BounceHigh bounceHigh4 = new BounceHigh();
        addObject(bounceHigh4,1581,379);
        levelTwoStepB2.setLocation(652,264);
        CannonBackgroud cannonBackgroud = new CannonBackgroud();
        addObject(cannonBackgroud,652,264);
        levelTwoStepA.setLocation(1077,521);
        CannonBackgroud cannonBackgroud2 = new CannonBackgroud();
        addObject(cannonBackgroud2,1077,521);
        removeObject(levelTwoStepB2);
        removeObject(cannonBackgroud);
        LevelTwoStepB levelTwoStepB3 = new LevelTwoStepB();
        addObject(levelTwoStepB3,689,209);
        removeObject(bounceMedium);
    }
}
