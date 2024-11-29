import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldThreeStageC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldThreeStageC extends WorldThree
{

    /**
     * Constructor for objects of class WorldThreeStageC.
     * 
     */
    public WorldThreeStageC()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelThreeStepB levelThreeStepB = new LevelThreeStepB();
        addObject(levelThreeStepB,239,494);
        LevelThreeStepA levelThreeStepA = new LevelThreeStepA();
        addObject(levelThreeStepA,61,412);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,37,196);
    }
}
