import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant actor
 * 
 * @author Kolby
 * @version 04/12/2025
 */
public class Elephant extends Actor
{
    private GreenfootImage[] idleRightAnim= new GreenfootImage[8];
    private GreenfootImage[] idleLeftAnim= new GreenfootImage[8];
    private GreenfootSound eatSound = new GreenfootSound("sounds/elephantcub.mp3");
    private int imageIndex = 0;
    private String direction = "right";

    public Elephant()
    {
        createAnimArray();
        setImage(idleRightAnim[0]);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
            direction = "right";
        }    

        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
            direction = "left";
        }

        animateElephant();
    }

    public void animateElephant() 
    {
        MyWorld world = (MyWorld) getWorld();
        SimpleTimer timer = world.getTimer();
        if (timer.millisElapsed() >= 100) {
            if (direction.equals("right")) {
                imageIndex = (imageIndex + 1) % idleRightAnim.length;
                setImage(idleRightAnim[imageIndex]);
            } else {
                imageIndex = (imageIndex + 1) % idleLeftAnim.length;
                setImage(idleLeftAnim[imageIndex]);
            }
            timer.mark();
        }
    }

    public void createAnimArray() {

        for (int i = 0; i < 8; i++) {

            idleRightAnim[i] = new GreenfootImage("elephant_idle/idle" + i + ".png");
            idleLeftAnim[i] = new GreenfootImage("elephant_idle/idle" + i + ".png");
            idleLeftAnim[i].mirrorHorizontally();
        }
    }
}
