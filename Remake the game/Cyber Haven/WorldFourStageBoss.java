import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldFourStageBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldFourStageBoss extends WorldFour
{

    /**
     * Constructor for objects of class WorldFourStageBoss.
     * 
     */
    public WorldFourStageBoss()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BossStepA bossStepA = new BossStepA();
        addObject(bossStepA,93,410);
        BossStepA bossStepA2 = new BossStepA();
        addObject(bossStepA2,91,528);
        BossStepA bossStepA3 = new BossStepA();
        addObject(bossStepA3,273,528);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,37,324);
        Cannon cannon = new Cannon();
        addObject(cannon,102,324);
        BossStepA bossStepA4 = new BossStepA();
        addObject(bossStepA4,1507,282);
        BossStepA bossStepA5 = new BossStepA();
        addObject(bossStepA5,1506,400);
        BossStepA bossStepA6 = new BossStepA();
        addObject(bossStepA6,1506,518);
        BonusCloud bonusCloud = new BonusCloud();
        addObject(bonusCloud,1351,250);
        BonusCloud bonusCloud2 = new BonusCloud();
        addObject(bonusCloud2,1224,250);
        removeObject(bossStepA4);
        removeObject(bonusCloud);
        removeObject(bonusCloud2);
        addObject(bonusCloud,1352,371);
        RobotBoss robotBoss = new RobotBoss();
        addObject(robotBoss,1495,214);
        robotBoss.setLocation(1487,221);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,820,579);
    }
}
