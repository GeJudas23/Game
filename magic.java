import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class magic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class magic extends attack
{
    /**
     * Act - do whatever the magic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final int DAMAGE = 1;
    
    /** How many images should be used in the animation of the wave */
    private static final int NUMBER_IMAGES= 40;
    
    /** 
     * The images of the wave. This is static so the images are not
     * recreated for every object (improves performance significantly).
     */
    private static GreenfootImage[] images;
    
    /** The image index currently displayed */
    private int currentImage = 0;
    
    public magic()
    {
        initializeImages();
        setImage(images[0]);
        sound.play(100);
    }
    
    /** 
     * Create the images for expanding the wave.
     */
    public static void initializeImages() 
    {
        if (images == null) 
        {
            GreenfootImage baseImage = new GreenfootImage("wave.png");
            baseImage.scale(320,320);
            images = new GreenfootImage[NUMBER_IMAGES];
            for (int i = 0; i < NUMBER_IMAGES; i++) 
            {
                int size = (i+1) * ( baseImage.getWidth() / NUMBER_IMAGES );
                images[i] = new GreenfootImage(baseImage);
                images[i].scale(size, size);
            }
        }
    }
    
    /**
     * Act for the proton wave is: grow and check whether we hit anything.
     */
    public void act()
    { 
        checkCollision();
        grow();
    }
    
    /**
     * Explode all intersecting asteroids.
     */
    private void checkCollision()
    {
        int range = getImage().getWidth() / 2;
        List<skeleton> skeletons = getObjectsInRange(range, skeleton.class);     
        
        for (skeleton skelet : skeletons) 
        {
            skelet.hit (DAMAGE);
        }
    }

    /**
     * Grow this wave. If we get to full size, remove.
     */
    private void grow()
    {
        if (currentImage >= NUMBER_IMAGES) 
        {
            getWorld().removeObject(this);
        }
        else 
        {
            setImage(images[currentImage]);
            currentImage++;
        }
    }
}
