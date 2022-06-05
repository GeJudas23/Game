import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sound
{   GreenfootSound test = new GreenfootSound("black.wav");
    private GreenfootSound music;
    public sound(int i)
    {   if(i==1){ music = new GreenfootSound("black.wav");}
        if(i==2){ music = new GreenfootSound("MT.wav");}
        if(i==3){ music = new GreenfootSound("cat.wav");}
        if(i==4){ music = new GreenfootSound("girl.wav");}
        if(i==5){ music = new GreenfootSound("win.wav");}
        if(i==6){ music = new GreenfootSound("proton.wav");}
        music.setVolume(100); 
    }
    public void act(){
        test.play();
    
    }
    public void play(int sound){
        try
        {
            music.setVolume(sound);
            music.play();
        }
        catch( java.lang.IllegalArgumentException fail)
        {   System.err.println("                                                                        ");
            System.err.println("you put "+sound +" as the volume, the minmuim is zero and maxmin is 100.");
            System.err.println("//////////////////////////////////////////////////////////////////////");
            System.err.println(fail);
        }
     }
    public void stop(){        
        music.stop();
    }
    public void pause(){        
        music.pause();
    }
    public void playLoop(int sound){
        music.setVolume(sound);
        music.playLoop();
    }
    public void setVolume(int volume){        
        music.setVolume(volume);
    }
   
    public boolean isPlaying(){
        return music.isPlaying();
    }
    
}
