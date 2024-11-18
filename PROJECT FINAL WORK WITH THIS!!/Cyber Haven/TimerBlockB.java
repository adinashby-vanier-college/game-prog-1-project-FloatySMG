import greenfoot.*;

public class TimerBlockB extends MapParts {
    private boolean isActive = false; // Initially inactive
    private TimerBlockA blockA; // Reference to TimerBlockA

    public void act() {
        // No need for special logic here, TimerBlockB state is controlled by TimerBlockA
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
        // Update image based on active state
        if (isActive) {
            setImage("TimerBlockBON.png");
        } else {
            setImage("TimerBlockBOFF.png");
        }
    }

    public void setBlockA(TimerBlockA blockA) {
        this.blockA = blockA; // Set reference to TimerBlockA
    }
}
