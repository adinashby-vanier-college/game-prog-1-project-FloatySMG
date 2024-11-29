import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldFourStageA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldFourStageA extends WorldFour
{

    /**
     * Constructor for objects of class WorldFourStageA.
     * 
     */
    public WorldFourStageA()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelFourStepA levelFourStepA = new LevelFourStepA();
        addObject(levelFourStepA,69,430);
        LevelFourStepA levelFourStepA2 = new LevelFourStepA();
        addObject(levelFourStepA2,204,428);
        LevelFourStepA levelFourStepA3 = new LevelFourStepA();
        addObject(levelFourStepA3,475,424);
        LevelFourStepA levelFourStepA4 = new LevelFourStepA();
        addObject(levelFourStepA4,611,424);
        LevelFourStepA levelFourStepA5 = new LevelFourStepA();
        addObject(levelFourStepA5,904,419);
        LevelFourStepA levelFourStepA6 = new LevelFourStepA();
        addObject(levelFourStepA6,1039,418);
        LevelFourStepA levelFourStepA7 = new LevelFourStepA();
        addObject(levelFourStepA7,1175,418);
        LevelFourStepA levelFourStepA8 = new LevelFourStepA();
        addObject(levelFourStepA8,1310,418);
        LevelFourStepA levelFourStepA9 = new LevelFourStepA();
        addObject(levelFourStepA9,1444,419);
        removeObject(levelFourStepA9);
        addObject(levelFourStepA9,1446,418);
        LevelFourStepA levelFourStepA10 = new LevelFourStepA();
        addObject(levelFourStepA10,1581,418);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,39,369);
        removeObject(cyrusPlayer);
        RobotLv1 robotLv1 = new RobotLv1();
        addObject(robotLv1,1061,347);
        RobotLv2 robotLv2 = new RobotLv2();
        addObject(robotLv2,1474,344);
        CyrusPlayer cyrusPlayer2 = new CyrusPlayer();
        addObject(cyrusPlayer2,35,369);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,880,586);
        cyrusPlayer2.setLocation(169,369);
        cyrusPlayer2.setLocation(154,372);
    }
}
