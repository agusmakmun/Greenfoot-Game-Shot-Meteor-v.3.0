import greenfoot.*;
import java.awt.Color; //module color yang dibutuhkan

/**
 * Ini adalah Counter2(); merupakan Counter Score pada Level ke-2.
 * Pembatasan Scorenya sendiri pada Counter2 ini adalah 100 target berhasil.
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */

public class Counter2 extends setCounter
{
    int score = 0;
    private int level2 = 100; //setting jumlah tembakan berhasil untuk level-2
    
    public void act() 
    {
       //System.out.print("Score:" + score);
       setImage(new GreenfootImage("Health: 3, Score: " + score, 20, Color.GREEN, Color.BLACK));

       //creating next level
       
       if (score == level2) {
           setImage(new GreenfootImage("Level 2 Complete", 18, Color.YELLOW, Color.BLACK));
           Greenfoot.delay(200); //timer tampilan
           //getWorld().removeObject(this);
           Greenfoot.setWorld(new Level3()); //masuk ke Level3();
       }
       
    }  
    
    public void addScore() {
       score++;
    }
}
