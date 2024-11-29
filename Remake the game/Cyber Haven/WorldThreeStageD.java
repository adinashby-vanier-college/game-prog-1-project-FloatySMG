import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldThreeStageD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldThreeStageD extends WorldThree
{

    /**
     * Constructor for objects of class WorldThreeStageD.
     * 
     */
    public WorldThreeStageD()
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
        addObject(bounceMedium,51,193);
        BounceMedium bounceMedium2 = new BounceMedium();
        addObject(bounceMedium2,155,193);
        TestNPC testNPC = new TestNPC();
        addObject(testNPC,919,237);
        removeObject(testNPC);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,34,139);
        LevelThreeStepD levelThreeStepD = new LevelThreeStepD();
        addObject(levelThreeStepD,380,511);
        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB,631,369);
        MovePartsB movePartsB2 = new MovePartsB();
        addObject(movePartsB2,827,364);
        MovePartsB movePartsB3 = new MovePartsB();
        addObject(movePartsB3,1023,369);
        MovePartsB movePartsB4 = new MovePartsB();
        addObject(movePartsB4,1219,366);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,1422,374);
        BonusCloudRed bonusCloudRed = new BonusCloudRed();
        addObject(bonusCloudRed,1552,141);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,883,581);
    }
}
