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
    }
}
