import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world_4 extends World
{

    /**
     * Constructor for objects of class world_4.
     * 
     */
    public world_4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 480, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        wrata wrata = new wrata();
        addObject(wrata,433,309);
        
        collider collider = new collider(10, 70);
        addObject(collider,307,243);
        collider.setLocation(2,460);
        
        collider collider2 = new collider(10, 150);
        addObject(collider2,236,246);
        collider2.setLocation(5,40);
        
        collider collider3 = new collider(400, 10);
        addObject(collider3,277,296);
        collider3.setLocation(300,475);
    }
}
