import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int score = 0;
    private Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {
        super(600, 400, 1, false);
        Seal seal = new Seal();
        addObject(seal, 300, 300);
        spawnCherry();
        spawnBaby();
        
        scoreLabel = new Label(score, 70);
        addObject(scoreLabel, 50, 50);
        
    }
    
    public void gameOver() {
        Label gameOverLabel = new Label("Play Again", 120);
        addObject(gameOverLabel, getWidth()/2, getHeight()/2); 
    }
    
    public void increaseScore() {
        score = score + 1;
        scoreLabel.setValue(score);
    }
    public void decreaseScore() {
        score = score - 3;
        scoreLabel.setValue(score);
    }
    
    public void spawnCherry() {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Cherry cherry = new Cherry();
        addObject(cherry, x, y);
    }
    public void spawnBaby() {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Baby baby = new Baby();
        addObject(baby, x, y);
    }
}
