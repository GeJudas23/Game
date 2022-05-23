import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world_3 extends World
{
    player player = new player();
    /**
     * Constructor for objects of class world_3.
     * 
     */
    public world_3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 480, 1); 
        prepare();
        act();
    }
    public void act(){
            if(player.getX() == 10){
                Greenfoot.setWorld(new world_1());
            }
            if(player.getY() == 10){
                Greenfoot.setWorld(new world_4());
            }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        addObject(player,28,248);
    }
}
