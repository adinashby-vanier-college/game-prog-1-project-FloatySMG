import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TestLevelThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestLevelThree extends WorldThree
{

    /**
     * Constructor for objects of class TestLevelThree.
     * 
     */
    public TestLevelThree()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelOneStepC levelOneStepC = new LevelOneStepC();
        addObject(levelOneStepC,653,348);
        LevelOneStepC levelOneStepC2 = new LevelOneStepC();
        addObject(levelOneStepC2,899,349);
        LevelOneStepC levelOneStepC3 = new LevelOneStepC();
        addObject(levelOneStepC3,334,347);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,264,230);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,700,571);
    }
}
