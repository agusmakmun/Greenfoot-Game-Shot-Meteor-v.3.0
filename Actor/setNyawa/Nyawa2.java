import greenfoot.*;
import java.awt.Color; //module color yang dibutuhkan

/**
 * Ini adalah Nyawa2();
 * Pembatasan nyawa (health) pada level-2
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.2.0)
 */

public class Nyawa2 extends setNyawa
{
    int nyawaku = 3; //setting jumlah nyawa pada level2
    
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
