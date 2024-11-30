import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldFourStageB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldFourStageB extends WorldFour
{

    /**
     * Constructor for objects of class WorldFourStageB.
     * 
     */
    public WorldFourStageB()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        LevelFourStepC levelFourStepC = new LevelFourStepC();
        addObject(levelFourStepC,50,441);
        LevelFourStepC levelFourStepC2 = new LevelFourStepC();
        addObject(levelFourStepC2,152,441);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,22,381);
        Cannon cannon = new Cannon();
        addObject(cannon,79,382);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,287,428);
    }
}
