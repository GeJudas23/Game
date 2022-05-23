import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pvp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pvp extends World
{

    GreenfootImage curAnim;
    /**
     * Constructor for objects of class pvp.
     * 
     */
    public pvp()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 480, 1); 
    }

    public void act(){
        curAnim = new GreenfootImage("died.jfif");
        curAnim.scale(480, 480);
        setBackground(curAnim);
        showText("PRESS SPACE TO RESTART", 240, 400);
        if(Greenfoot.isKeyDown("space")){
            Greenfoot.setWorld(new world_1());

        }
    }

}

