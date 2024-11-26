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
        TestNPC testNPC = new TestNPC();
        addObject(testNPC,84,139);
    }
}
