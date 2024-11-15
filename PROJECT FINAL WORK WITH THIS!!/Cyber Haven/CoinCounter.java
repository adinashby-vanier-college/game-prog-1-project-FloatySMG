import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CoinCounter extends Actor {
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int value;
    private int target;
    private String prefix;
    private int coinCount; 
    private GreenfootImage counterImage;  
    private GreenfootImage coinIcon;  
    
    public void act() 
    {
                if (value < target) {
            value++;
            updateImage();
        }
        else if (value > target) {
            value--;
            updateImage();
        }
    }

    // Constructor
    public CoinCounter() 
    {
        // Load the coin icon image (make sure the image file is in the "images" folder)
        coinIcon = new GreenfootImage("CoinCounterImage.png"); // Example image for the coin
        coinIcon.scale(20, 30);  // Adjust the size of the coin image
        
        // Create an empty counter image large enough to hold the icon and text
        counterImage = new GreenfootImage(coinIcon.getWidth() + 40, 30);  // Extra space for the text
        
        // Draw the coin icon and the initial coin count on the counter image
        updateImage();
    }
    
    /**
     * Add a new score to the current counter value.  This will animate
     * the counter over consecutive frames until it reaches the new value.
     */
    public void add(int score)
    {
        target += score;
    }
    
    /**
     * Return the current counter value.
     */
    public int getValue()
    {
        return target;
    }
    
    /**
     * Set a new counter value.  This will not animate the counter.
     */
    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }

        /**
     * Sets a text prefix that should be displayed before
     * the counter value (e.g. "Score: ").
     */
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }

    // Method to update the coin counter display
    private void updateImage() 
    {
        
        GreenfootImage text = new GreenfootImage(prefix + value, 22, Color.WHITE, transparent);
        
        // Draw the coin icon (on the left side of the counter)
        counterImage.drawImage(coinIcon, 0, 0);

        // Draw the coin count text (to the right of the coin icon)
        counterImage.setColor(Color.WHITE); // Set text color to black
        counterImage.drawString("x " + coinCount, coinIcon.getWidth() + 10, 20);  // Position the text
        
        setImage(counterImage);  // Update the actor's image with the new counter image
    }
}
