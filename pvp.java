import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pvp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pvp extends World
{

    GifImage bg = new GifImage("pvp.gif");
    GreenfootImage curAnim;
    /**
     * Constructor for objects of class pvp.
     * 
     */
    public pvp()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(512, 512, 1); 
    }

    public void act(){
        curAnim = bg.getCurrentImage();
        curAnim.scale(512, 512);
        setBackground(curAnim);

        if(Greenfoot.isKeyDown("space")){
            Greenfoot.setWorld(new MyWorld());

        }
    }

}

