import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world_5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world_5 extends World
{
    
    /**
     * Constructor for objects of class world_5.
     * 
     */
    public sound sound1 = new sound(1);
    public sound sound2 = new sound(2);
    public world_5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 480, 1);
        
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act(){
        if(!sound1.isPlaying()){sound1.playLoop(100);}
        if(sound2.isPlaying()){sound2.stop();}
    }
    private void prepare()
    {
        wrata wrata = new wrata();
        addObject(wrata,59,56);
        npc skeleton = new enemy_npc();
        addObject(skeleton,236,133);
        npc skeleton2 = new enemy_npc();
        addObject(skeleton2,332,206);
        npc skeleton3 = new enemy_npc();
        addObject(skeleton3,146,208);
        npc skeleton4 = new enemy_npc();
        addObject(skeleton4,279,288);
        npc skeleton5 = new enemy_npc();
        addObject(skeleton5,191,288);
        skeleton4.setLocation(302,300);
        skeleton5.setLocation(168,292);
    }
}
