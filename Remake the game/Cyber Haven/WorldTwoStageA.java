import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldTwoStageA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldTwoStageA extends WorldTwo
{

    /**
     * Constructor for objects of class WorldTwoStageA.
     * 
     */
    public WorldTwoStageA()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelTwoStepA levelTwoStepA = new LevelTwoStepA();
        addObject(levelTwoStepA,76,405);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,38,184);
        cyrusPlayer.setLocation(36,181);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,200,375);
        BounceMedium bounceMedium2 = new BounceMedium();
        addObject(bounceMedium2,304,374);
        BounceMedium bounceMedium3 = new BounceMedium();
        addObject(bounceMedium3,408,374);
        LevelTwoStepA levelTwoStepA2 = new LevelTwoStepA();
        addObject(levelTwoStepA2,534,465);
        LevelTwoStepB levelTwoStepB = new LevelTwoStepB();
        addObject(levelTwoStepB,1012,488);
        BounceMedium bounceMedium4 = new BounceMedium();
        addObject(bounceMedium4,787,496);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,782,587);
        LevelTwoIntroText levelTwoIntroText = new LevelTwoIntroText();
        addObject(levelTwoIntroText,383,84);
        LevelTwoStepC levelTwoStepC = new LevelTwoStepC();
        addObject(levelTwoStepC,1523,460);
        BounceMedium bounceMedium5 = new BounceMedium();
        addObject(bounceMedium5,1191,486);
        BounceMedium bounceMedium6 = new BounceMedium();
        addObject(bounceMedium6,1350,377);
        deathZone.setLocation(1452,554);
        CannonBackgroud cannonBackgroud = new CannonBackgroud();
        addObject(cannonBackgroud,1452,554);
        CannonBackgroud cannonBackgroud2 = new CannonBackgroud();
        addObject(cannonBackgroud2,104,192);
        cyrusPlayer.setLocation(141,193);
        cannonBackgroud2.setLocation(93,194);
        cyrusPlayer.setLocation(145,179);
        cyrusPlayer.setLocation(32,178);
        removeObject(cyrusPlayer);
        addObject(cyrusPlayer,33,184);
    }
}
