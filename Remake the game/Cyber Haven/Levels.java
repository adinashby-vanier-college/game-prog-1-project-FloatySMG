import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Parent class for levels with shared functionality.
 */
public class Levels extends World {
    protected static GreenfootSound currentMusic = null; // Shared music instance

    /**
     * Constructor for objects of class Levels.
     */
    public Levels() {
        super(1600, 600, 1); // Create a new world with specified size
        addPauseButton();
    }

    /**
     * Play the specified music file and stop any currently playing music.
     */
    protected void playMusic(String musicFile) {
        if (currentMusic != null) {
            currentMusic.stop(); // Stop currently playing music
        }
        currentMusic = new GreenfootSound(musicFile);
        currentMusic.playLoop(); // Start looping the new music
    }
    
    public void addPauseButton() {
        PauseButton pauseButton = new PauseButton();
        addObject(pauseButton,1408,50);
        pauseButton.setLocation(1410,50);

    }
}
