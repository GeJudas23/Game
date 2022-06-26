import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sound
{
    static GreenfootSound music1 = new GreenfootSound("black.wav");
    static GreenfootSound music2 = new GreenfootSound("MT.wav");
    static GreenfootSound music3 = new GreenfootSound("cat.wav");
    static GreenfootSound music4 = new GreenfootSound("girl.wav");
    static GreenfootSound music5 = new GreenfootSound("win.wav");
    static GreenfootSound music6 = new GreenfootSound("proton.wav");
    static private GreenfootSound music;
    public sound()
    {   
    }
    static public void act(){
    
    }
    static public void play(int i){
         switch (i) {
            case 1: music1.play();
                break;
            case 2: music2.play();
                break;
            case 3: music3.play();
                break;
            case 4: music4.play();
                break;
            case 5: music5.play();
                break;
            case 6: music6.play();
                break;
            }
     }
    static public void stop(int i){ 
        switch (i) {
            case 1: music1.stop();
                break;
            case 2: music2.stop();
                break;
            case 3: music3.stop();
                break;
            case 4: music4.stop();
                break;
            case 5: music5.stop();
                break;
            case 6: music6.stop();
                break;
            }
    }
    static public void pause(int i){
        switch (i) {
            case 1: music1.pause();
                break;
            case 2: music2.pause();
                break;
            case 3: music3.pause();
                break;
            case 4: music4.pause();
                break;
            case 5: music5.pause();
                break;
            case 6: music6.pause();
                break;
            }
    }
    static public void playLoop(int i){
        switch (i) {
            case 1: music1.playLoop();
                break;
            case 2: music2.playLoop();
                break;
            case 3: music3.playLoop();
                break;
            case 4: music4.playLoop();
                break;
            case 5: music5.playLoop();
                break;
            case 6: music6.playLoop();
                break;
            }
    }
    static public boolean isPlaying(int i){
        boolean state = false;
        switch (i) {
            case 1: state = music1.isPlaying();
                break;
            case 2: state = music2.isPlaying();
                break;
            case 3: state = music3.isPlaying();
                break;
            case 4: state = music4.isPlaying();
                break;
            case 5: state = music5.isPlaying();
                break;
            case 6: state = music6.isPlaying();
                break;
            }
        return state;
    }
    
}
