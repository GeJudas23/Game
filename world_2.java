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
    player player = new player();
    public world_2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 480, 1); 
        prepare();
        act();
    }
    public void act(){
            if(player.getX() == 470){
                Greenfoot.setWorld(new world_4());
            }
            if(player.getY() == 470){
                Greenfoot.setWorld(new world_1());
            }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(player,230,416);
    }
}
