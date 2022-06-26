import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;
/**
 * Write a description of class main_menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main_menu extends World
{   private GreenfootImage start;
    private GreenfootImage black;
    GifImage WASD = new GifImage("WASD.gif");
    GreenfootImage curAnim;
    int count = 0;
    boolean pers = false;
    boolean flag = false;
    player cat = new cat();
    player girl = new girl();
    public String lastKeyPressed = "";
    public main_menu()
    {   
        super(480, 480, 1);
        start = new GreenfootImage("menu/start.png");
        black = new GreenfootImage("menu/black.png");
        showText("PRESS 'X' TO PLAY BY CAT", 240, 400);
        showText("PRESS 'Z' TO PLAY BY LADY", 240, 440);
        setBackground(start);
    }
    public void act(){
        String myKey = Greenfoot.getKey();
        if (myKey != null) lastKeyPressed = myKey;
        if (count == 0){
            if(Greenfoot.isKeyDown("x") || Greenfoot.isKeyDown("ч")){
                pers = false;
                sound.play(3);
                count++;
                showText(" ", 240, 400);
                showText(" ", 240, 440);
            }
            if(Greenfoot.isKeyDown("z") || Greenfoot.isKeyDown("я")){
                pers = true;
                sound.play(4);
                count++;
                showText(" ", 240, 400);
                showText(" ", 240, 440);
            }
        }
        if(count == 1){
            setBackground(black);
            showText("PRESS 'SPACE' TO CONTINUE", 240, 440);
            if(pers){
                showText("My cat was kidnapped", 240, 240);
                showText("I need to save it", 240, 280);
            }
            else{
                showText("My lady was kidnapped", 240, 240);
                showText("I need to save her", 240, 280);
            }
            if("space".equals(lastKeyPressed)){
                //sound.playLoop(100);
                
                lastKeyPressed = null;
                showText(" ", 240, 440);
                showText(" ", 240, 240);
                showText(" ", 240, 280);
                count++;
            }
        }
        if (count == 2){
            setBackground(WASD.getCurrentImage());
            if("space".equals(lastKeyPressed)){
                //sound.playLoop(100);
                changeLevel();
                flag = true;
            }
        }
        
        }
    public void changeLevel(){

        World nextLevel = new world_1();
        if(pers){
            nextLevel.addObject(girl, 240, 240);
        }
        else{
            nextLevel.addObject(cat, 240, 240);
        }
        Greenfoot.setWorld(nextLevel);
    }
}