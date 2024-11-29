import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldThreeStageA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldThreeStageA extends WorldThree
{

    /**
     * Constructor for objects of class WorldThreeStageA.
     * 
     */
    public WorldThreeStageA()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelThreeStepA levelThreeStepA = new LevelThreeStepA();
        addObject(levelThreeStepA,58,412);
        LevelThreeStepA levelThreeStepA2 = new LevelThreeStepA();
        addObject(levelThreeStepA2,181,412);
        levelThreeStepA2.setLocation(207,408);
        levelThreeStepA2.setLocation(208,414);
        removeObject(levelThreeStepA2);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,31,196);
        LevelThreeIntroText levelThreeIntroText = new LevelThreeIntroText();
        addObject(levelThreeIntroText,307,90);
        cyrusPlayer.setLocation(34,368);
        levelThreeIntroText.setLocation(244,123);
        removeObject(levelThreeIntroText);
        LevelThreeIntroText levelThreeIntroText2 = new LevelThreeIntroText();
        addObject(levelThreeIntroText2,320,101);
        LevelThreeStepB levelThreeStepB = new LevelThreeStepB();
        addObject(levelThreeStepB,151,501);
        removeObject(levelThreeStepA);
        LevelThreeStepC levelThreeStepC = new LevelThreeStepC();
        addObject(levelThreeStepC,627,419);
        BonusCloudRed bonusCloudRed = new BonusCloudRed();
        addObject(bonusCloudRed,768,264);
        bonusCloudRed.setLocation(768,264);
        BonusCloudRed bonusCloudRed2 = new BonusCloudRed();
        addObject(bonusCloudRed2,895,264);
        BonusCloudRed bonusCloudRed3 = new BonusCloudRed();
        addObject(bonusCloudRed3,1023,264);
        LevelThreeStepA levelThreeStepA3 = new LevelThreeStepA();
        addObject(levelThreeStepA3,895,590);
        LevelThreeStepA levelThreeStepA4 = new LevelThreeStepA();
        addObject(levelThreeStepA4,1021,590);
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,1251,489);
        LevelThreeStepA levelThreeStepA5 = new LevelThreeStepA();
        addObject(levelThreeStepA5,1433,416);
        LevelThreeStepA levelThreeStepA6 = new LevelThreeStepA();
        addObject(levelThreeStepA6,1557,416);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,444,420);
        RobotLv1 robotLv1 = new RobotLv1();
        addObject(robotLv1,1023,197);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,760,585);
    }
}
