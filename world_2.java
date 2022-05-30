import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world_2 extends World
{

    /**
     * Constructor for objects of class world_2.
     * 
     */
    public world_2()
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
        skeleton skeleton = new skeleton();
        addObject(skeleton,310,216);

        collider collider = new collider(200, 70);
        addObject(collider,307,243);
        collider.setLocation(380,460);

        collider collider2 = new collider(200, 70);
        addObject(collider2,119,217);
        collider2.setLocation(95,460);

        collider collider3 = new collider(250, 150);
        addObject(collider3,236,246);
        collider3.setLocation(390,40);

        collider collider4 = new collider(150, 5);
        addObject(collider4,185,251);
        collider4.setLocation(130,114);

        collider collider5 = new collider(5, 150);
        addObject(collider5,43,170);
        collider5.setLocation(48,45);

        collider collider6 = new collider(60, 60);
        addObject(collider6,328,360);
        collider6.setLocation(31,421);
        
        
    }
}
