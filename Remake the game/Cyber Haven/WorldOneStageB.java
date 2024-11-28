import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldOneStageB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldOneStageB extends WorldOne
{

    /**
     * Constructor for objects of class WorldOneStageB.
     * 
     */
    public WorldOneStageB()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelOneStepB levelOneStepB = new LevelOneStepB();
        addObject(levelOneStepB,43,498);
        LevelOneStepB levelOneStepB2 = new LevelOneStepB();
        addObject(levelOneStepB2,132,527);
        LevelOneStepB levelOneStepB3 = new LevelOneStepB();
        addObject(levelOneStepB3,235,527);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,27,365);
        levelOneStepB3.setLocation(228,431);
        levelOneStepB3.setLocation(226,467);
        levelOneStepB3.setLocation(235,527);
        TutorialTextC tutorialTextC = new TutorialTextC();
        addObject(tutorialTextC,337,98);
        tutorialTextC.setLocation(381,156);
        tutorialTextC.setLocation(404,146);
        MovePartsB movePartsB = new MovePartsB();
        addObject(movePartsB,405,387);
        LevelOneStepD levelOneStepD = new LevelOneStepD();
        addObject(levelOneStepD,599,449);
        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA,896,309);
        LevelOneStepD levelOneStepD2 = new LevelOneStepD();
        addObject(levelOneStepD2,1175,445);
        cyrusPlayer.setLocation(38,341);
        cyrusPlayer.setLocation(33,335);
        MovePartsB movePartsB2 = new MovePartsB();
        addObject(movePartsB2,1332,224);
        removeObject(movePartsB2);
        LevelOneStepC levelOneStepC = new LevelOneStepC();
        addObject(levelOneStepC,1435,542);
        removeObject(levelOneStepC);
        LevelOneStepE levelOneStepE = new LevelOneStepE();
        addObject(levelOneStepE,1426,520);
        LevelOneStepE levelOneStepE2 = new LevelOneStepE();
        addObject(levelOneStepE2,1426,339);
        removeObject(levelOneStepE2);
        removeObject(levelOneStepE);
        LevelOneStepB levelOneStepB4 = new LevelOneStepB();
        addObject(levelOneStepB4,1432,508);
        LevelOneStepB levelOneStepB5 = new LevelOneStepB();
        addObject(levelOneStepB5,1434,296);
        LevelOneStepB levelOneStepB6 = new LevelOneStepB();
        addObject(levelOneStepB6,1534,509);
        levelOneStepB6.setLocation(1533,507);
        LevelOneStepB levelOneStepB7 = new LevelOneStepB();
        addObject(levelOneStepB7,1533,296);
    }
}
