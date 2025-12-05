import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Apple actor
 * 
 * @author Kolby
 * @version 04/12/2025
 */
public class Apple extends Actor
{
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        setLocation(getX(), getY() + 1);
        if (isTouching(Elephant.class))
        {
            world.createApple();
            world.addScore();
            removeApple();
            return;
        }
        else if (getY() > world.getHeight())
        {
            world.gameOver();
            removeApple();
            return;
        }
    }
    public void removeApple()
    {
        MyWorld world = (MyWorld) getWorld();
        world.removeObject(this);
    }
}
