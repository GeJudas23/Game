import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class world_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world_1 extends World
{
    /**
     * Constructor for objects of class world_1.
     * 
     */
    public world_1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 480, 1); 
        act();
        prepare();
    }

    public void act(){
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        collider collider = new collider(200, 150);
        addObject(collider,307,243);
        collider.setLocation(380,30);

        collider collider2 = new collider(150, 100);
        addObject(collider2,277,296);
        collider2.setLocation(440,148);

        collider collider3 = new collider(200, 150);
        addObject(collider3,119,217);
        collider3.setLocation(95,72);

        collider collider4 = new collider(130, 130);
        addObject(collider4,289,262);
        collider4.setLocation(110,140);
    }
}
