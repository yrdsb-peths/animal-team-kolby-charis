import greenfoot.*;

/**
 * MyWorld class
 * 
 * @author Kolby
 * @version 04/12/2025
 */

public class MyWorld extends World {
    int score = 0;
    private Label scoreLabel;
    private SimpleTimer timer = new SimpleTimer();

    public MyWorld() {
        super(600, 400, 1, false);
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        createApple();
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        addObject(apple, randomX(), 0);
    }

    public int randomX()
    {
        return Greenfoot.getRandomNumber(getWidth());
    }

    public void addScore()
    {
        score++;
        scoreLabel.setValue(score);
    }

    public void gameOver()
    {
        Label label = new Label("Game Over", 80);
        addObject(label, getWidth() / 2, getHeight() / 2);
    }
    
    
    public SimpleTimer getTimer()
    {
        return timer;
    }
}
