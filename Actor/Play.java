import greenfoot.*;

/**
 * Ini adalah button Play(); yang digunakan sebagai button play starter -->
 * yang ketika di klik, akan menuju ke Level1();
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.2.0)
 */
public class Play extends Actor
{
    public void act() 
    {
        if (Greenfoot.mousePressed(this) )  
        {   
            Greenfoot.setWorld(new Level1()); //press button masuk ke Level1();
        }
    }    
}
