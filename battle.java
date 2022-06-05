import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class battle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class battle extends World
{   boolean escapeTrue = false;
    boolean phase; // false - player, true - enemy
    int aim_id = 0;
    public String lastKeyPressed = "";
    private int world_id;
    private boolean plr;
    private int wave;
    private int hero_hp = 100;
    private boolean finall;
    private boolean show = false;
    public battle(int id,boolean p,int w,boolean fin)
    {   
        super(480, 480, 1); 
        world_id = id;
        plr = p;
        wave = w;
        finall = fin;
        
        if(plr == true){girl_npc girl = new girl_npc(); addObject(girl,400,240); girl.showHP();}
        if(plr == false){cat_npc cat = new cat_npc(); addObject(cat,400,240); cat.showHP();}
        phase = false;
        generateEnemy();
        
        
    }

    public void act()
    {
        if(!phase){
            if(!show){checkHP();}
            if(Greenfoot.isKeyDown("x") & escapeTrue){escape(world_id,plr);}
            moveAim();
            castSpell();
            checkWin(world_id,plr);
        }
        else if (phase){
            getDamage();
        }
    }
    public void checkHP(){
    Bar bar = getObjectsAt(400, 265,Bar.class).get(0);
    hero_hp = bar.getValue();
    if (hero_hp < 30){showText("press 'x' to try escape", 240, 240); Greenfoot.delay(50); showText(" ", 240, 240); show = true; escapeTrue = true;}
    }
    public void getDamage(){
        int imax = getObjects(skeleton.class).size();
        for(int i = 0; i<imax; i++){
            
            npc hero = getObjectsAt(400,240,npc.class).get(0);
            hero.hit(2);
            
        
        }
        phase = !phase;
    }
    public void escape(int id,boolean plr){
        if(escapeTrue){
            changeLevel(id,240,400,plr);
            showText("Yep", 240, 240);
        }
        else{
            showText("Nope", 240, 240);
            Greenfoot.delay(10);
            showText(" ", 240, 240);
        }
    }

    public void moveAim(){
        if(!getObjects(skeleton.class).isEmpty()){
            int aim_max = getObjects(skeleton.class).size();
            if(getObjects(aim.class).isEmpty()){
                aim aim = new aim();
                addObject(aim, 0, 0);
                }   
            if (aim_max > 1) {
                if(Greenfoot.isKeyDown("right")){
                    aim_id++;
                    if(aim_id==aim_max){aim_id = 0;}
                    Greenfoot.delay(20);
                    }
                if(Greenfoot.isKeyDown("left")){
                    aim_id--;
                    if(aim_id==-1){aim_id = aim_max-1;}
                    Greenfoot.delay(20);
                    }
                }
            else{aim_id=0;}
            skeleton skelet = getObjects(skeleton.class).get(aim_id);
            int x = skelet.getX();
            int y = skelet.getY();
            aim aim = getObjects(aim.class).get(0);
            aim.setLocation(x,y);
            }   
        }
    
    public void castSpell(){
        String myKey = Greenfoot.getKey();
        if (myKey != null) lastKeyPressed = myKey;
        if("space".equals(lastKeyPressed)){
            aim aim = getObjects(aim.class).get(0);
            if(!plr){attack magic = new magic(); addObject(magic,aim.getX(),aim.getY());}
            else{attack phisical = new phisical(); addObject(phisical,aim.getX(),aim.getY());}
            phase = !phase;
            lastKeyPressed = null;
            Greenfoot.delay(5);
        }
    }

    private void generateEnemy(){
        for(int i = 0; i < getRandomNumber(1,2); i++) {
            skeleton skeleton = new skeleton();
            addObject(skeleton, 140, i*80 + 100);
            skeleton.showHP();
        }
        for(int i = 0; i < getRandomNumber(0,2); i++) {
            skeleton skeleton = new skeleton();
            addObject(skeleton, 80, i*80 + 50);
            skeleton.showHP();
        }
        for(int i = 0; i < getRandomNumber(0,2); i++) {
            skeleton skeleton = new skeleton();
            addObject(skeleton, 140, 400 - i*80);
            skeleton.showHP();
        }
        for(int i = 0; i < getRandomNumber(0,2); i++) {
            skeleton skeleton = new skeleton();
            addObject(skeleton, 80,430 - i*80);
            skeleton.showHP();
        }
    }

    public int getRandomNumber(int start,int end)
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }

    public void changeLevel(int world_id,int px,int py,boolean plr){  
        World nextLevel;
        nextLevel = new world_2();
        if(world_id == 1){nextLevel = new world_1();}
        if(world_id == 2){nextLevel = new world_2();}
        if(world_id == 3){nextLevel = new world_3();}
        if(world_id == 4){nextLevel = new world_4();}
        if(world_id == 5){nextLevel = new world_5();if(plr == false ){girl_npc girl = new girl_npc(); nextLevel.addObject(girl,240,240);}
        else{cat_npc cat = new cat_npc(); nextLevel.addObject(cat,240,240);}}
        
        if(plr == true){girl girl = new girl(); nextLevel.addObject(girl,px,py);}
        else{cat cat = new cat(); nextLevel.addObject(cat,px,py);}
        Greenfoot.setWorld(nextLevel);
    }

    public void checkWin(int world_id, boolean plr){
        if(getObjects( skeleton.class).isEmpty()){
            if(finall){
                wave++;
                if (wave == 6){
                    World nextLevel = new HappyEnd();
                    Greenfoot.setWorld(nextLevel);
                }
                else{
                    showText("wave "+String.valueOf(wave), 240, 240);
                    Greenfoot.delay(80);
                    showText(" ", 240, 240);
                    World nextLevel = new battle(world_id,plr,wave,true);
                    Greenfoot.setWorld(nextLevel);
                }
            }
            else{
                changeLevel(world_id,240,400,plr);
                }
            }
        }
    }


