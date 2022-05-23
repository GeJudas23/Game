import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world_4 extends World
{
    player player = new player();
    /**
     * Constructor for objects of class world_4.
     * 
     */
    public world_4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 480, 1); 
        prepare();
        act();
    }
    public void act(){
            if(player.getX() == 10){
                Greenfoot.setWorld(new world_3());

            }
            if(player.getY() == 470){
                Greenfoot.setWorld(new world_2());

            }
            if((player.getX()==433)||(player.getY()==307)){Greenfoot.setWorld(new world_5());
            }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        addObject(player,212,236);
        wrata wrata = new wrata();
        addObject(wrata,433,307);
        npc npc = new npc();
        addObject(npc,243,187);
    }
}
