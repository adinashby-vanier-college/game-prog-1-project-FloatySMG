import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldOneStageA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldOneStageA extends WorldOne
{

    /**
     * Constructor for objects of class WorldOneStageA.
     * 
     */
    public WorldOneStageA()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,76,190);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,991,941);
        LevelOneStepF levelOneStepF = new LevelOneStepF();
        addObject(levelOneStepF,84,497);
        LevelOneStepB levelOneStepB = new LevelOneStepB();
        addObject(levelOneStepB,294,517);
        LevelOneStepB levelOneStepB2 = new LevelOneStepB();
        addObject(levelOneStepB2,395,517);
        deathZone.setLocation(617,560);
        LevelOneStepA levelOneStepA = new LevelOneStepA();
        addObject(levelOneStepA,617,560);
        LevelOneStepA levelOneStepA2 = new LevelOneStepA();
        addObject(levelOneStepA2,763,525);
        LevelOneStepA levelOneStepA3 = new LevelOneStepA();
        addObject(levelOneStepA3,903,502);
        LevelOneStepF levelOneStepF2 = new LevelOneStepF();
        addObject(levelOneStepF2,1218,506);
        LevelOneStepB levelOneStepB3 = new LevelOneStepB();
        addObject(levelOneStepB3,1549,500);
        LevelOneStepB levelOneStepB4 = new LevelOneStepB();
        addObject(levelOneStepB4,1447,500);
    }
}
