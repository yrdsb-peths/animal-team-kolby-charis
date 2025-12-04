import greenfoot.*;

/**
 * MyWorld class
 * 
 * @author Kolby
 * @version 04/12/2025
 */

public class MyWorld extends World {
    int score = 0;

    public MyWorld() {
        super(600, 400, 1);
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        createApple();
        Label label = new Label(0, 80);
        addObject(label, 50, 50);
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
    }
}
