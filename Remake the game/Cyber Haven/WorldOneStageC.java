import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldOneStageC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldOneStageC extends WorldOne
{

    /**
     * Constructor for objects of class WorldOneStageC.
     * 
     */
    public WorldOneStageC()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelOneStepA levelOneStepA = new LevelOneStepA();
        addObject(levelOneStepA,64,501);
        levelOneStepA.setLocation(65,499);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,27,372);
        LevelOneStepD levelOneStepD = new LevelOneStepD();
        addObject(levelOneStepD,475,449);
        LevelOneStepF levelOneStepF = new LevelOneStepF();
        addObject(levelOneStepF,733,515);
        LevelOneStepF levelOneStepF2 = new LevelOneStepF();
        addObject(levelOneStepF2,725,292);
        levelOneStepF2.setLocation(732,292);
        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB,291,456);
        BonusCloud bonusCloud = new BonusCloud();
        addObject(bonusCloud,1534,465);
        BonusCloud bonusCloud2 = new BonusCloud();
        addObject(bonusCloud2,1408,464);
        BonusCloud bonusCloud3 = new BonusCloud();
        addObject(bonusCloud3,1284,462);
        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA,1005,234);
        TutorialChokePoint tutorialChokePoint = new TutorialChokePoint();
        addObject(tutorialChokePoint,1534,403);
    }
}
