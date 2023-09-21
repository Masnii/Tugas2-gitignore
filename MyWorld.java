import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class MyWorld extends World {
    private Random random = new Random();
    
    public MyWorld() {
        super(700, 500, 1);
        
    }
    
    public void act() {
        if (random.nextInt(230) < 1) {// Munculkan "tower" dengan probabilitas 5%
            int randomX = random.nextInt(getWidth());
            int randomY = random.nextInt(getHeight());
            addObject(new Tower(), randomX, randomY);
        }
    }
}