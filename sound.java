import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sound
{
    private GreenfootSound music;
    public sound(int i)
    {   if(i==1){ music = new GreenfootSound("black.wav");}
        if(i==2){ music = new GreenfootSound("MT.mp3");}
        if(i==3){ music = new GreenfootSound("cat.mp3");}
        if(i==4){ music = new GreenfootSound("girl.mp3");}
        if(i==5){ music = new GreenfootSound("magic.mp3");}
        if(i==6){ music = new GreenfootSound("start.mp3");}
        if(i==7){ music = new GreenfootSound("died.mp3");}
        if(i==8){ music = new GreenfootSound("getdamage.mp3");}
        if(i==8){ music = new GreenfootSound("hit.mp3");}
        music.setVolume(100); 
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
    public void playLoop(){        
        music.playLoop();
    }
    public void setVolume(int volume){        
        music.setVolume(volume);
    }
   
    public boolean isPlaying(){
        return music.isPlaying();
    }
}
