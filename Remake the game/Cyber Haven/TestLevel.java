import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TestLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestLevel extends Levels
{

    /**
     * Constructor for objects of class TestLevel.
     * 
     */
    public TestLevel() //This level only exists to test the game mechanics.
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BounceHigh bounceHigh = new BounceHigh();
        addObject(bounceHigh,649,565);
        BounceMedium bounceMedium = new BounceMedium();
        addObject(bounceMedium,957,565);
        CyrusPlayer cyrusPlayer = new CyrusPlayer();
        addObject(cyrusPlayer,816,566);
        bounceHigh.setLocation(438,254);
        bounceMedium.setLocation(611,297);
        cyrusPlayer.setLocation(463,176);
        cyrusPlayer.setLocation(552,210);
        DeathZone deathZone = new DeathZone();
        addObject(deathZone,777,738);
        MovePartsA movePartsA = new MovePartsA();
        addObject(movePartsA,938,433);
    }
}
