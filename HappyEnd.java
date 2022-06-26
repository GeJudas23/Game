import greenfoot.*;
import java.util.ArrayList;
import java.util.List;

public class HappyEnd extends World
{   private int slide = 1;
    public String lastKeyPressed = "";
    static final Color TRANS = new Color(0, 0, 0, 0);
    public HappyEnd()
    {
        super(480, 480, 1, false); // unbounded world
        showSlide(1);
        
    }
    public void act(){
        if(!sound.isPlaying(5)){sound.play(5);}
        String myKey = Greenfoot.getKey();
        if (myKey != null) lastKeyPressed = myKey;
        if("space".equals(lastKeyPressed)){
            List objects = getObjects(null);
            removeObjects(objects);
            slide++;
            setBackground(new GreenfootImage("black.png"));
            showSlide(slide);
            lastKeyPressed = null;
        }
    }
    
    public void showSlide(int slide){
        ArrayList<String> texts = new ArrayList<String>();
        if(slide == 1){
        texts.add(" ");
        texts.add("you win");
        texts.add(" ");
        texts.add("cat and her lady");
        texts.add(" ");
        texts.add("together now");
        slide++;
        }
        else if(slide == 2){
        texts.add(" ");
        texts.add("Game by");
        texts.add("George");
        texts.add("kErill");
        texts.add("SirGay");
        texts.add("and");
        texts.add("danpost");
        slide++;
        }
        else if(slide == 3){
        texts.add(" ");
        texts.add("Thanks");
        texts.add("  ");
        texts.add("for");
        texts.add("  ");
        texts.add("playing");
        slide++;
        }
        else if(slide == 4){
        sound.stop(5);
        Greenfoot.stop();
        }
        int h = 40;
        for(String text : texts){
            int ct = text.length();
            for (int i=0; i<ct; i++) // for each character
                {
                    Actor actor = new LocationSeeker();
                    actor.setImage(new GreenfootImage(""+text.charAt(i), 60, Color.WHITE, TRANS));
                    addObject(actor, 255-ct*15+i*30, h);
                }
            getBackground().setColor(Color.BLUE);
            h+=60;  
            }
    }
}