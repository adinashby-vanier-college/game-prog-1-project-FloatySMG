import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CoinCounter extends Counter {
    private int coinCount;  // Tracks the number of coins collected
    private GreenfootImage counterImage;  // Image to display the coin count and icon
    private GreenfootImage coinIcon;  // Image for the coin icon
    
    // Constructor
    public CoinCounter() {
        coinCount = 0; // Initialize the coin count to zero
        
        // Load the coin icon image (make sure the image file is in the "images" folder)
        coinIcon = new GreenfootImage("CoinCounterImage.png"); // Example image for the coin
        coinIcon.scale(20, 30);  // Adjust the size of the coin image
        
        // Create an empty counter image large enough to hold the icon and text
        counterImage = new GreenfootImage(coinIcon.getWidth() + 40, 30);  // Extra space for the text
        
        // Draw the coin icon and the initial coin count on the counter image
        updateCounterImage();
    }
    // Increment the coin count and update the display
    public void incrementCoins() {
        coinCount++;
        updateCounterImage(); // Update the image to reflect the new coin count
    }
    // Method to update the coin counter display
    private void updateCounterImage() {
        counterImage.clear();  // Clear the current image
        
        // Draw the coin icon (on the left side of the counter)
        counterImage.drawImage(coinIcon, 0, 0);

        // Draw the coin count text (to the right of the coin icon)
        counterImage.setColor(Color.WHITE); // Set text color to black
        counterImage.drawString("x " + coinCount, coinIcon.getWidth() + 10, 20);  // Position the text

        setImage(counterImage);  // Update the actor's image with the new counter image
    }
    public void act() {
        // No specific action is needed for the CoinCounter every frame
    }
}
