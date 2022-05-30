import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void changeLevel(int world_id,int px,int py,boolean plr){  
        World nextLevel;
        nextLevel = new world_1();
        if(world_id == 1){nextLevel = new world_1();}
        if(world_id == 2){nextLevel = new world_2();}
        if(world_id == 3){nextLevel = new world_3();}
        if(world_id == 4){nextLevel = new world_4();}
        if(world_id == 5){nextLevel = new world_5();}
        if(plr == true){girl girl = new girl(); nextLevel.addObject(girl,px,py);}
        else{cat cat = new cat(); nextLevel.addObject(cat,px,py);}
        Greenfoot.setWorld(nextLevel);
    }
    public int getWorldId(){
        World world = getWorld();
        Color color = world.getColorAt(479,1);
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        int id = r+g+b;
        if(id==512){id = 1;}
        if(id==238){id = 2;}
        if(id==710){id = 3;}
        if(id==319){id = 4;}
        if(id==199){id = 5;}
        return id;
    }
    public void switcher(int world_id,int px,int py,boolean plr){

        if((world_id == 1)&(px>477)){changeLevel(3,5,py,plr);}
        if((world_id == 1)&(py<3)){changeLevel(2,px,475,plr);}
        if((world_id == 2)&(px>477)){changeLevel(4,5,py,plr);}
        if((world_id == 2)&(py>477)){changeLevel(1,px,5,plr);}
        if((world_id == 3)&(px<3)){changeLevel(1,475,py,plr);}
        if((world_id == 3)&(py<3)){changeLevel(4,px,475,plr);}
        if((world_id == 4)&(px<3)){changeLevel(2,475,py,plr);}
        if((world_id == 4)&(py>477)){changeLevel(3,px,5,plr);}
    }
}
