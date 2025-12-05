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
        setLocation(getX(), getY() + 1);
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Elephant.class))
        {
            removeApple();
            world.createApple();
            world.addScore();
        }
        
        if(getY() > world.getHeight())
        {
            removeApple();
            world.gameOver();
        }
    }
    public void removeApple()
    {
        MyWorld world = (MyWorld) getWorld();
        world.removeObject(this);
    }
}
