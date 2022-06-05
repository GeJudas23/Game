import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class girl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class girl extends player
{   GifImage Run_w = new GifImage("girl/run_w.gif");
    GifImage Run_a = new GifImage("girl/run_a.gif");
    GifImage Run_s = new GifImage("girl/run_s.gif");
    GifImage Run_d = new GifImage("girl/run_d.gif");
    GifImage idle = new GifImage("girl/idle.png");
    GreenfootImage curAnim;
    boolean plr = true;
    int vecX = 0;
    int vecY = 0;
    int sprint = 0;
    /**
     * Act - do whatever the cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   //if(!isTouching(collider.class)){controller(Run_w,Run_a,Run_s,Run_d);}
        controller(Run_w,Run_a,Run_s,Run_d);
        setImage(curAnim);
        int world_id = getWorldId();
        switcher(world_id,getX(),getY(),plr);
        if(isTouching(enemy_npc.class)){
            World world = getWorld();
            world_5 myworld = (world_5) world;
            myworld.sound1.stop();
            startBattle(getWorldId(),plr,true);
        }
        if(Greenfoot.getRandomNumber(2000)==1){startBattle(getWorldId(),plr,false);}
        if(isTouching(wrata.class)){
            if(world_id == 4){changeLevel(5,240,400,plr);}
            if(world_id == 5){changeLevel(4,240,240,plr);}
        }
    }

    public  void controller(GifImage Run_w,GifImage Run_a,GifImage Run_s,GifImage Run_d)
    {   int px = getX();
        int py = getY();
        curAnim = idle.getCurrentImage();
        if(Greenfoot.isKeyDown("shift")){
            sprint=1;
        }
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("ц")){
            vecY = -1 - sprint;
            curAnim = Run_w.getCurrentImage();
        }
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("ф")){
            vecX = -1 - sprint;
            curAnim = Run_a.getCurrentImage();
        }
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("ы")){
            vecY = 1 + sprint;
            curAnim = Run_s.getCurrentImage();
        }
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("в")){
            vecX = 1 + sprint;
            curAnim = Run_d.getCurrentImage();
        }
        if(!Greenfoot.isKeyDown("s")  &&  !Greenfoot.isKeyDown("w") && !Greenfoot.isKeyDown("ц") && !Greenfoot.isKeyDown("ы") ){
             vecY=0;
        }
        if(!Greenfoot.isKeyDown("a")  &&  !Greenfoot.isKeyDown("d") && !Greenfoot.isKeyDown("ф")  &&  !Greenfoot.isKeyDown("в") ){
             vecX = 0;
        }
        if(!Greenfoot.isKeyDown("shift")){
            sprint=0;
        }
        setLocation(getX()+vecX, getY()+vecY);
        if(isTouching(collider.class)){
            setLocation(px, py);
            curAnim = idle.getCurrentImage();
        }
        
    }
}
