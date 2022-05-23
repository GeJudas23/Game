import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class player extends Actor
{
    GifImage Run_w = new GifImage("run_w.gif");
    GifImage Run_a = new GifImage("run_a.gif");
    GifImage Run_s = new GifImage("run_s.gif");
    GifImage Run_d = new GifImage("run_d.gif");
    GifImage idle = new GifImage("idle.png");
    GreenfootImage curAnim;
    int vecX = 0;
    int vecY = 0;
    int world = 1;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        controller();
        setImage(curAnim);
        if(isTouching(npc.class)){Greenfoot.setWorld(new pvp());
        }
        swichWorld();
    }
    
    public void controller()
    {   curAnim = idle.getCurrentImage();
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("ц")){
            vecY = -1;
            curAnim = Run_w.getCurrentImage();
        }
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("ф")){
            vecX = -1;
            curAnim = Run_a.getCurrentImage();
        }
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("ы")){
            vecY = 1;
            curAnim = Run_s.getCurrentImage();
        }
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("в")){
            vecX = 1;
            curAnim = Run_d.getCurrentImage();
        }
        if(!Greenfoot.isKeyDown("s")  &&  !Greenfoot.isKeyDown("w") && !Greenfoot.isKeyDown("ц") && !Greenfoot.isKeyDown("ы") ){
             vecY=0;
        }
        if(!Greenfoot.isKeyDown("a")  &&  !Greenfoot.isKeyDown("d") && !Greenfoot.isKeyDown("ф")  &&  !Greenfoot.isKeyDown("в") ){
             vecX = 0;
        } 
        setLocation(getX()+vecX, getY()+vecY);
    }
    
    public void swichWorld(){
    }
    
}
