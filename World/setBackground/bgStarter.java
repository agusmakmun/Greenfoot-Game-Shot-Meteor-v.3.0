import greenfoot.*;

/**
 * Ini adalah settingan background Compleyte (bgStarter) beserta sound track start.
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class bgStarter extends setBackground
{

    /**
     * Constructor for objects of class bgStarter.
     * 
     */
    public bgStarter()
    {
        prepare();
        Greenfoot.playSound("start.wav"); //setting sound for starter
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Beginning beginning = new Beginning();
        addObject(beginning, 401, 257);
        Play play = new Play();
        addObject(play, 400, 366);
        beginning.setLocation(399, 268);
        play.setLocation(397, 353);
        beginning.setLocation(390, 254);
        play.setLocation(397, 347);
        Rocket1 rocket1 = new Rocket1();
        addObject(rocket1, 401, 168);
    }
}
