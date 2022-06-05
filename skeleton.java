import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skeleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skeleton extends enemy
{
    /**
     * Act - do whatever the skeleton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int hp = 100;
    GifImage idle = new GifImage("npc.gif");
    GreenfootImage curAnim;
    public void act()
    {
        curAnim = idle.getCurrentImage();
        setImage(curAnim);
    }
    public void showHP(){
         Bar bar = new Bar("", "", 100, 100);
         getWorld().addObject(bar, getX(), getY()+25);
    }
    public void hit(int damage) 
    {
        hp = hp - damage;
        Bar bar = getWorld().getObjectsAt(getX(), getY()+25,Bar.class).get(0);
        bar.subtract(damage);
        if (hp <= 0) 
        {
            getWorld().removeObject(this);  
        }
    }
}
