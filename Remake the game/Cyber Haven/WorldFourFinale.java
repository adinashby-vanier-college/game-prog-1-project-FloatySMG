import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldFourFinale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldFourFinale extends WorldFour
{

    /**
     * Constructor for objects of class WorldFourFinale.
     * 
     */
    public WorldFourFinale()
    {
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelFourStepB levelFourStepB = new LevelFourStepB();
        addObject(levelFourStepB,84,480);
        LevelFourStepC levelFourStepC = new LevelFourStepC();
        addObject(levelFourStepC,295,460);
        LevelFourStepC levelFourStepC2 = new LevelFourStepC();
        addObject(levelFourStepC2,564,296);
        LevelFourStepA levelFourStepA = new LevelFourStepA();
        addObject(levelFourStepA,816,466);
        levelFourStepC2.setLocation(935,429);
        levelFourStepA.setLocation(499,230);
        levelFourStepA.setLocation(520,225);
        levelFourStepC2.setLocation(789,428);
        LevelFourStepC levelFourStepC3 = new LevelFourStepC();
        addObject(levelFourStepC3,1541,231);
        LevelFourStepB levelFourStepB2 = new LevelFourStepB();
        addObject(levelFourStepB2,1490,400);
        levelFourStepC3.setLocation(1186,385);
        levelFourStepB2.setLocation(1467,252);
        levelFourStepC3.setLocation(1379,274);
        levelFourStepC2.setLocation(1242,295);
        LevelFourStepA levelFourStepA2 = new LevelFourStepA();
        addObject(levelFourStepA2,1060,426);
        levelFourStepB.setLocation(133,391);
        levelFourStepA.setLocation(597,301);
        levelFourStepA.setLocation(718,300);
        levelFourStepA.setLocation(547,305);
        LevelFourStepA levelFourStepA3 = new LevelFourStepA();
        addObject(levelFourStepA3,815,399);
        levelFourStepA.setLocation(460,322);
        levelFourStepA.setLocation(500,322);
        levelFourStepA3.setLocation(755,388);
        RobotLv2 robotLv2 = new RobotLv2();
        addObject(robotLv2,1562,135);
        robotLv2.setLocation(1574,142);
        robotLv2.setLocation(1567,143);
        removeObject(robotLv2);
        RobotBoss robotBoss = new RobotBoss();
        addObject(robotBoss,1068,252);
        robotBoss.setLocation(1093,259);
        levelFourStepB2.setLocation(1512,453);
        robotBoss.setLocation(1517,304);
        levelFourStepC3.setLocation(1374,398);
        levelFourStepC2.setLocation(1178,263);
        levelFourStepA2.setLocation(978,412);
        levelFourStepA3.setLocation(754,120);
        levelFourStepA2.setLocation(919,424);
        levelFourStepC2.setLocation(1158,247);
        levelFourStepC2.setLocation(1162,246);
        levelFourStepC2.setLocation(1162,246);
    }
}
