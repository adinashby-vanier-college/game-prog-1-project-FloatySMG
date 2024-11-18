import greenfoot.*;

public class TimerBlockA extends MapParts {
    private boolean isActive = true; // Initially active
    private int timer = 0; // Timer to switch state
    private TimerBlockB blockB; // Reference to TimerBlockB

    public void act() {
        timer++; // Increase the timer on each act

        if (timer >= 120) { // After 120 acts (2 seconds)
            setIsActive(!isActive); // Toggle the state of TimerBlockA
            blockB.setIsActive(!blockB.getIsActive()); // Toggle the state of TimerBlockB
            timer = 0; // Reset timer
        }
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
        if (isActive) {
            setImage("TimerBlockAON.png"); // Image for active state
        } else {
            setImage("TimerBlockAOFF.png"); // Image for inactive state
        }
    }

    public void setBlockB(TimerBlockB blockB) {
        this.blockB = blockB; // Set reference to TimerBlockB
    }
}
