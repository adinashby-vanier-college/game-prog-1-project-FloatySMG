import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class TutorialWorld extends World
{
    private Cyrus player;
    private GreenfootImage background;
    private int bgOffset;

    /**
     * Constructor for objects of class TutorialWorld.
     */
    public TutorialWorld()
    {
        super(380, 380, 1);
        player =  new  Cyrus();
        background =  new  GreenfootImage("BackgroundLV1.png");
        setBackground(background);
        bgOffset = 0;
        prepare();
    }

    /**
     * 
     */
    public void prepare()
    {
        addObject(player, 178, 234);
    }

    /**
     * 
     */
    public int getBGOffset()
    {
        return bgOffset;
    }

    /**
     * 
     */
    public void setBGOffset(int newBGOffset)
    {
        bgOffset = newBGOffset;
        redrawBackground();
    }
    
    public void redrawBackground() {
        background.drawImage(background, -bgOffset, 0);
    }
    
}
