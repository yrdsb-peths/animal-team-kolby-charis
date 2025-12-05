import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant actor
 * 
 * @author Kolby
 * @version 04/12/2025
 */
public class Elephant extends Actor
{
    public void act()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }    

        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
    }
}
