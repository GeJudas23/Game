import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class phisical here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class phisical extends attack
{   int DAMAGE = 50;
    /**
     * Act - do whatever the phisical wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkCollision();
        Greenfoot.delay(1);
        getWorld().removeObject(this);
        
        
    }
    private void checkCollision()
    {
        int range = getImage().getWidth();
        List<skeleton> skeletons = getObjectsInRange(range, skeleton.class);     
        
        for (skeleton skelet : skeletons) 
        {
            skelet.hit (DAMAGE);
        }
    }
}
