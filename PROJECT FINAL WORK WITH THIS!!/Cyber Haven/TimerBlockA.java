import greenfoot.*;

public class TimerBlockA extends MapParts {
    private boolean isActive = true; // Initially active
    private int timer = 0; // Timer to switch state
    private TimerBlockB blockB; // Reference to TimerBlockB
    private int blinkCount = 0; // Counts the number of blinks during blinking phase

    public void act() {
        timer++; // Increase the timer on each act

        if (timer >= 90 && timer < 120) { // Blink phase (30 acts)
            if (timer % 10 == 0) { // Toggle the image every 10 acts
                if (isActive) {
                    setImage(blinkCount % 2 == 0 ? "TimerBlockAON.png" : "TimerBlockAOFF.png");
                    blinkCount++; // Increment blink count
                }
            }
        } else if (timer >= 120) { // After 120 acts (2 seconds)
            setIsActive(!isActive); // Toggle the state of TimerBlockA
            blockB.setIsActive(!blockB.getIsActive()); // Toggle the state of TimerBlockB
            timer = 0; // Reset timer
            blinkCount = 0; // Reset blink count
        }
        if (blockB != null && blockB.getIsActive()){
            
        }
    }   

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
        if (isActive) {
            setImage("TimerBlockAON.png"); // Image for active state
            getImage().setTransparency(255); // Fully visible
        } else {
            setImage("TimerBlockAOFF.png"); // Image for inactive state
            getImage().setTransparency(100); // Partially transparent to show it's inactive
        }
    }

    public void setBlockB(TimerBlockB blockB) {
        this.blockB = blockB; // Set reference to TimerBlockB
    }

    // Custom method to check if the block is solid
    public boolean isSolid() {
        return isActive; // Only solid when active
    }
}
