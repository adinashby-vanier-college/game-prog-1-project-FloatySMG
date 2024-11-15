import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CoinCollect extends Actor {
    private GreenfootImage CoinCollectImage;

    public void act() 
    {

    }

    public CoinCollect() {
        CoinCollectImage = new GreenfootImage("CoinCollect.png");
        scaleImage();
    }

    private void scaleImage() {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight() / 3;
        int myNewWidth = (int)myImage.getWidth() / 1;
        myImage.scale(myNewHeight, myNewWidth);  
    }
}

