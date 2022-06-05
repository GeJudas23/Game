import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class npc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class npc extends Actor
{   public int hp = 100;
    /**
     * Act - do whatever the npc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
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
            World nextLevel = new GameOver();
            Greenfoot.setWorld(nextLevel);
        }
    }
}
