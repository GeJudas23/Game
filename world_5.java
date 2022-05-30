import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world_5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world_5 extends World
{
    sound sound = new sound(1);
    /**
     * Constructor for objects of class world_5.
     * 
     */
    public world_5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 480, 1);
        if(!sound.isPlaying()){sound.play(100);}
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        wrata wrata = new wrata();
        addObject(wrata,59,56);
        skeleton skeleton = new skeleton();
        addObject(skeleton,236,133);
        skeleton skeleton2 = new skeleton();
        addObject(skeleton2,332,206);
        skeleton skeleton3 = new skeleton();
        addObject(skeleton3,146,208);
        skeleton skeleton4 = new skeleton();
        addObject(skeleton4,279,288);
        skeleton skeleton5 = new skeleton();
        addObject(skeleton5,191,288);
        skeleton4.setLocation(302,300);
        skeleton5.setLocation(168,292);
    }
}
