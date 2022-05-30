import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world_3 extends World
{

    /**
     * Constructor for objects of class world_3.
     * 
     */
    public world_3()
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
        collider collider = new collider(10, 150);
        addObject(collider,307,243);
        collider.setLocation(2,30);

        collider collider2 = new collider(10, 100);
        addObject(collider2,277,296);
        collider2.setLocation(2,148);

        collider collider3 = new collider(400, 100);
        addObject(collider3,277,296);
        collider3.setLocation(300,45);

        collider collider4 = new collider(210, 210);
        addObject(collider4,277,296);
        collider4.setLocation(173,385);

        collider collider5 = new collider(50, 210);
        addObject(collider5,277,296);
        collider5.setLocation(310,433);
    }
}
