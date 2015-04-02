import greenfoot.*;

/**
 * Ini adalah settingan background Game Over beserta sound track Ending.
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
 
public class GameOver extends setBackground
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {
        Greenfoot.playSound("levelEnd.wav");
        prepare();
    }

    private void prepare()
    {
        Over over = new Over();
        addObject(over, 395, 237);
        over.setLocation(400, 229);
        
        PlayAgain playagain = new PlayAgain();
        addObject(playagain, 405, 329);
        playagain.setLocation(392, 311);
    }
}
