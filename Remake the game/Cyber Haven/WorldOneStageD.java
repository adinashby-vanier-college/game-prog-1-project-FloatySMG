import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldOneStageD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldOneStageD extends WorldOne
{

    /**
     * Constructor for objects of class WorldOneStageD.
     * 
     */
    public WorldOneStageD()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB,1270,430);
        removeObject(movePartsB);
        BonusCloud bonusCloud = new BonusCloud();
        addObject(bonusCloud,62,127);
        BonusCloud bonusCloud2 = new BonusCloud();
        addObject(bonusCloud2,190,127);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,48,71);
        MovePartsB movePartsB2 = new MovePartsB();
        addObject(movePartsB2,373,263);
        MovePartsB movePartsB3 = new MovePartsB();
        addObject(movePartsB3,602,307);
        MovePartsB movePartsB4 = new MovePartsB();
        addObject(movePartsB4,797,249);
        LevelOneStepF levelOneStepF = new LevelOneStepF();
        addObject(levelOneStepF,1041,507);
        LevelOneStepF levelOneStepF2 = new LevelOneStepF();
        addObject(levelOneStepF2,1041,285);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,688,591);
        LevelOneStepG levelOneStepG = new LevelOneStepG();
        addObject(levelOneStepG,1249,199);
        LevelOneStepF levelOneStepF3 = new LevelOneStepF();
        addObject(levelOneStepF3,1459,285);
        LevelOneStepF levelOneStepF4 = new LevelOneStepF();
        addObject(levelOneStepF4,1459,509);
        LevelOneStepF levelOneStepF5 = new LevelOneStepF();
        addObject(levelOneStepF5,1595,286);
        LevelOneStepF levelOneStepF6 = new LevelOneStepF();
        addObject(levelOneStepF6,1599,507);
        LevelOneStepI levelOneStepI = new LevelOneStepI();
        addObject(levelOneStepI,1256,502);
        LevelOneStepH levelOneStepH = new LevelOneStepH();
        addObject(levelOneStepH,1343,501);
        LevelOneStepH levelOneStepH2 = new LevelOneStepH();
        addObject(levelOneStepH2,1171,500);
        TutorialTextD tutorialTextD = new TutorialTextD();
        addObject(tutorialTextD,1330,66);
        tutorialTextD.setLocation(1242,80);
        tutorialTextD.setLocation(1216,97);
    }
}
