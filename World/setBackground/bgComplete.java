import greenfoot.*;

/**
 * Ini adalah settingan background Complete (bgComplete) beserta sound, dan method stop.
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class bgComplete extends setBackground
{
    public bgComplete()
    {
        Level1 stop_sound = new Level1();
        stop_sound.stopped();
    
        prepare();
        Greenfoot.playSound("levelEnd.wav"); //setting sound for ending
        Greenfoot.stop(); //stop for all activity game
    }

    private void prepare()
    {
        Ending ending = new Ending();
        addObject(ending, 398, 266);
        ending.setLocation(391, 256);
    }
}
