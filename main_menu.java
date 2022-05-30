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
    sound cat_sound = new sound(3);
    sound girl_sound = new sound(4);
    int count = 0;
    boolean pers = false;
    public main_menu()
    {   
        super(480, 480, 1);
        start = new GreenfootImage("menu/start.png");
        black = new GreenfootImage("menu/black.png");
        showText("PRESS 'X' TO PLAY BY CAT", 240, 400);
        showText("PRESS 'Z' TO PLAY BY GIRL", 240, 440);
        setBackground(start);
    }
    public void act(){
        if (count == 0){
            if(Greenfoot.isKeyDown("x") || Greenfoot.isKeyDown("ч")){
                pers = false;
                //cat_sound.play(100);
                count++;
                showText(" ", 240, 400);
                showText(" ", 240, 440);
            }
            if(Greenfoot.isKeyDown("z") || Greenfoot.isKeyDown("я")){
                pers = true;
                //girl_sound.play(100);
                count++;
                showText(" ", 240, 400);
                showText(" ", 240, 440);
            }
        }
        if(count == 1){
            setBackground(black);
            if(pers){
                showText("story about girl", 240, 240);
            }
            else{
                showText("story about cat", 240, 240);
            }
            if(Greenfoot.isKeyDown("space")){
                changeLevel();
            }
        }
        }
    public void changeLevel(){
        player cat = new cat();
        player girl = new girl();
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