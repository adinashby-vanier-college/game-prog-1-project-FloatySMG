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
        WorldOnePlatformB worldOnePlatformB = new WorldOnePlatformB();
        addObject(worldOnePlatformB,78,498);
        WorldOnePlatformA worldOnePlatformA = new WorldOnePlatformA();
        addObject(worldOnePlatformA,296,496);
        WorldOnePlatformA worldOnePlatformA2 = new WorldOnePlatformA();
        addObject(worldOnePlatformA2,395,496);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,76,190);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,791,941);
        WorldOnePlatformC worldOnePlatformC = new WorldOnePlatformC();
        addObject(worldOnePlatformC,617,443);
        MovePartsB movePartsB = new MovePartsB(50);
        addObject(movePartsB,835,330);
        WorldOnePlatformC worldOnePlatformC2 = new WorldOnePlatformC();
        addObject(worldOnePlatformC2,1077,449);
    }
}
