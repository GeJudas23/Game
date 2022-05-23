import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world_1 extends World
{
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    player player = new player();
 
    public world_1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 480, 1); 
        prepare();
        act();

    }
    public void act(){
            if(player.getX() == 470){
                Greenfoot.setWorld(new world_3());
            }
            if(player.getY() == 10){
                Greenfoot.setWorld(new world_2());
            }
    
    }

    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {   npc npc = new npc();
        addObject(player,272,189);
        addObject(npc,438,225);
        npc.setLocation(242,96);
        player.setLocation(120,250);
        npc.setLocation(243,93);
        removeObject(npc);
    }
}
