import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * SceneMessageWelcomeC with fade-in and fade-out effect.
 */
public class SceneMessageWelcomeC extends Images
{
    private int transparency = 0; // Initial transparency (fully transparent)
    private int frameCounter = 0; // Frame counter for timing
    private final int fadeInDuration = 50; // Duration of fade-in (in frames)
    private final int visibleDuration = 150; // Duration to stay fully visible (in frames)
    private final int fadeOutDuration = 50; // Duration of fade-out (in frames)

    public SceneMessageWelcomeC() {
        scaleImage();
        getImage().setTransparency(transparency); // Set initial transparency
    }

    /**
     * Act - called on every frame to manage fading in and out.
     */
    public void act() {
        frameCounter++;
        
        if (frameCounter > 40 && frameCounter <= 40 + fadeInDuration) { 
            // Start fade-in after 2 seconds (assuming 20 fps)
            transparency = (int)((frameCounter - 40) * (255 / fadeInDuration));
            getImage().setTransparency(Math.min(transparency, 255));
        } else if (frameCounter > 40 + fadeInDuration + visibleDuration &&
                   frameCounter <= 40 + fadeInDuration + visibleDuration + fadeOutDuration) { 
            // Start fade-out after being fully visible
            transparency = 255 - (int)((frameCounter - (40 + fadeInDuration + visibleDuration)) * (255 / fadeOutDuration));
            getImage().setTransparency(Math.max(transparency, 0));
        }
    }

    /**
     * Scale the image to 60% of its original size.
     */
    private void scaleImage() {
        GreenfootImage image = getImage();
        int newWidth = (int) (image.getWidth() * 0.6);
        int newHeight = (int) (image.getHeight() * 0.6);
        image.scale(newWidth, newHeight);
        setImage(image);
    }
}
