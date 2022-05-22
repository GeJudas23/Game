import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class npc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class npc extends Actor
{   GifImage idle = new GifImage("npc.gif");
    GreenfootImage curAnim;
    /**
     * Act - do whatever the nebo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        curAnim = idle.getCurrentImage();
        setImage(curAnim);
    }
}

