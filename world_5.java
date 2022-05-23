import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world_5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world_5 extends World
{
    player player = new player();
    /**
     * Constructor for objects of class world_5.
     * 
     */
    public world_5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(460, 480, 1); 
        prepare();
        act();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act(){
        
    if((player.getX()==47)||(player.getY()==169)){Greenfoot.setWorld(new world_4());}
    }
    private void prepare()
    {
        addObject(player,229,248);
        npc npc = new npc();
        addObject(npc,395,138);
        npc npc2 = new npc();
        addObject(npc2,107,116);
        npc npc3 = new npc();
        addObject(npc3,178,111);
        npc npc4 = new npc();
        addObject(npc4,344,334);
        npc npc5 = new npc();
        addObject(npc5,82,308);
        npc npc6 = new npc();
        addObject(npc6,385,227);
        npc npc7 = new npc();
        addObject(npc7,126,217);
        wrata wrata = new wrata();
        addObject(wrata,415,450);
        wrata.setLocation(47,169);
    }
}
