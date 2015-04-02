import greenfoot.*;
import java.awt.Color; //module color yang dibutuhkan

/**
 * Ini adalah Counter3(); merupakan Counter Score pada Level ke-3.
 * Pembatasan Scorenya sendiri pada Counter3 ini adalah 200 target berhasil.
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */

public class Counter3 extends setCounter
{
    int score = 0;
    private int level2 = 200; //setting jumlah tembakan berhasil untuk level-2
    
    public void act() 
    {
       //System.out.print("Score:" + score);
       setImage(new GreenfootImage("Health: 5, Score: " + score, 20, Color.GREEN, Color.BLACK));

       //creating next level
       
       if (score == level2) {
           setImage(new GreenfootImage("All Level Complete", 18, Color.YELLOW, Color.BLACK));
           Greenfoot.delay(200); //timer tampilan
           //getWorld().removeObject(this);
           
           Greenfoot.setWorld(new bgComplete()); //masuk ke bgComplete();
       }
       
    }  
    
    public void addScore() {
       score++;
    }
}
