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
    }
}
