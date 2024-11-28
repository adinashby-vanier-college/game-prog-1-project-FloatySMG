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
        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA,281,410);
    }
}
