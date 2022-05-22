import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    GifImage bg = new GifImage("menu.gif");
    GreenfootImage curAnim;

    public menu()
    {    
        super(512, 512, 1);

        prepare();
    }

    public void act(){
        curAnim = bg.getCurrentImage();
        curAnim.scale(512, 512);
        setBackground(curAnim);

        if(Greenfoot.isKeyDown("space")){
            Greenfoot.setWorld(new MyWorld());

        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
