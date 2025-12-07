import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen for the game.
 * 
 * @author Kolby
 * @author Charis
 * @version December 2025
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label titleLabel = new Label("Hungry Elephant", 60);
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        
        Label instructionLabel = new Label("Press Space to Start", 40);
        addObject(instructionLabel, getWidth()/2, getHeight()/2 + 60);
        
        Label arrowLabel = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(arrowLabel, getWidth()/2, getHeight()/2 + 110);
        
        Elephant elephant = new Elephant();
        addObject(elephant, getWidth()/2, 100);
    }
    
    /**
     * The main world act loop.
     */
    public void act()
    {
        // Start the game if the user presses the space bar
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
