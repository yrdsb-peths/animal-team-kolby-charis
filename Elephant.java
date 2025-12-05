import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant actor
 * 
 * @author Kolby
 * @version 04/12/2025
 */
public class Elephant extends Actor
{
    private GreenfootImage[] images;
    private int imageIndex;
    public Elephant
    {
        images = new GreenfootImage[8];
        for (int i = 0; i < 8; i++)
        {
            images[i] = new GreenfootImage("idle" + i + ".png");
        }
        setImage(images[0]);
    }
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
