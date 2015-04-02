import greenfoot.*;
import java.awt.Color; //module color yang dibutuhkan

/**
 * Pembatasan nyawa pada level-3
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */

public class Nyawa3 extends setNyawa
{
    int nyawaku = 2; //setting jumlah nyawa pada level3
    
    public void act() 
    {
       //System.out.print("Score:" + score);
       setImage(new GreenfootImage("Health: " + nyawaku, 20, Color.RED, Color.BLACK));
    }  
    
    public void kurangiNyawa() {
       nyawaku--;
       
       if (nyawaku == 0) {
           Greenfoot.setWorld(new GameOver()); //game over
        }
    }
}
