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
        if(isTouching(Elephant.class))
        {
            removeApple();
        }
    }
    public void removeApple()
    {
        MyWorld world = (MyWorld) getWorld();
        world.removeObject(this);
        world.createApple();
    }
}
