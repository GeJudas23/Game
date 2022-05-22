import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    GreenfootImage curAnim;

    public menu()
    {    
        super(480, 480, 1);

        prepare();
    }

    public void act(){
        curAnim = new GreenfootImage("menu.png");
        curAnim.scale(480, 480);
        setBackground(curAnim);
        showText("PRESS SPACE TO PLAY", 240, 400);


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
