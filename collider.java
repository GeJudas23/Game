import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class collider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class collider extends Actor
{
    /**
     * Act - do whatever the collider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean debug = false;
    public collider(int w,int h){
        
    if(!debug){
        GreenfootImage img = new GreenfootImage("inv_mesh.png");
        img.scale(w,h);
        setImage(img);
    }
    else{
        GreenfootImage img = new GreenfootImage("enemy_mesh.png");
        img.scale(w,h);
        setImage(img);    
    }
    }
    public void act()
    {
        
        // Add your action code here.
    }
}
