import greenfoot.*;

public class LocationSeeker extends Actor
{
    int xo, yo; // final location of actor (where added into world)
    int ro = Greenfoot.getRandomNumber(360); // approach angle
    int rad = Greenfoot.getRandomNumber(400)+600; // start distance from final location
    int turnDir = 1-2*Greenfoot.getRandomNumber(2); // turn direction
    int stepDir = 1; // step direction
    int step; // step counter
    
    protected void addedToWorld(World world)
    {
        xo = getX();
        yo = getY(); // save final location
        setRotation(ro*turnDir); // set angle of approach
        move(rad); // go to starting location
    }
    
    public void act()
    {
        if ((step+1)%362 == 0) // done moving
        {
            if (Greenfoot.isKeyDown("r"))
            { // continue "on course" or reset off screen
                stepDir = -stepDir; // reverse steo direction
                turnDir = -turnDir; // reverse turn direction
                ro = (540-ro)%360; // reflect original angle
            }
            else return; // wait for a key
        }
        setLocation(xo, yo); // go to final location
        setRotation(((360-step)+ro)*turnDir); // set new position angle
        move(rad*(360-step)/360); // move an adjusted (lesser) amount to new position
        setRotation((360-step)*turnDir); // set new visual angle
        step += stepDir; // increment step counter
        getWorld().getBackground().fillRect(getX()-1, getY()-1, 2, 2);
    }
}