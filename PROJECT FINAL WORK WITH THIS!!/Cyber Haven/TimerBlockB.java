import greenfoot.*;

public class TimerBlockB extends MapParts {
    private boolean isActive = false; // Initially inactive
    private int timer = 0; // Timer to control blinking
    private TimerBlockA blockA; // Reference to TimerBlockA
    private int blinkCount = 0; // Counts the number of blinks during blinking phase

    public void act() {
        timer++; // Increase the timer on each act

        if (timer >= 90 && timer < 120) { // Blink phase (30 acts)
            if (timer % 10 == 0) { // Toggle the image every 10 acts
                if (isActive) {
                    setImage(blinkCount % 2 == 0 ? "TimerBlockBON.png" : "TimerBlockBOFF.png");
                    blinkCount++; // Increment blink count
                }
            }
        } else if (timer >= 120) { // Reset timer (controlled by TimerBlockA)
            timer = 0;
            blinkCount = 0; // Reset blink count
        }
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
        timer = 0; // Reset timer when the state changes
        blinkCount = 0; // Reset blink count
        if (isActive) {
            setImage("TimerBlockBON.png"); // Image for active state
            getImage().setTransparency(255); // Fully visible
        } else {
            setImage("TimerBlockBOFF.png"); // Image for inactive state
            getImage().setTransparency(100); // Partially transparent to show it's inactive
        }
    }

    public void setBlockA(TimerBlockA blockA) {
        this.blockA = blockA; // Set reference to TimerBlockA
    }

    // Custom method to check if the block is solid
    public boolean isSolid() {
        return isActive; // Only solid when active
    }
}
