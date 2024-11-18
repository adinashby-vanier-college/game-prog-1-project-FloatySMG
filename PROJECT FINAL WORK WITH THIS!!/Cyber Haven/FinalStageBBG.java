import greenfoot.*;

public class FinalStageBBG extends World {
    private GreenfootSound finalBMusic;

    public FinalStageBBG() {    
        super(1600, 600, 1); 
        finalBMusic = new GreenfootSound("CYBER_FINAL2_BGM.wav");
        playSound();
        prepare();
    }
    
    public void playSound() {
        finalBMusic.playLoop();
    }

    public void stopSound() {
        finalBMusic.stop();
    }

    public void restartSound() {
        stopSound();
        playSound();
    }

    private void prepare() {
        CoinCounter coinCounter = new CoinCounter();
        addObject(coinCounter, 52, 44);
    }
}
