import greenfoot.*;
import java.awt.Color; //module color yang dibutuhkan

/**
 * Ini adalah Counter1(); merupakan Counter Score pada Level ke-1.
 * Pembatasan Scorenya sendiri pada Counter1 ini adalah 50 target berhasil.
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */

public class Counter1 extends setCounter
{
    int score = 0;
    private int level2 = 50; //setting jumlah tembakan berhasil untuk level-2
    
    public void act() 
    {
       //System.out.print("Score:" + score);
       setImage(new GreenfootImage("Health: 2, Score: " + score, 20, Color.GREEN, Color.BLACK));

       //creating next level
       if (score == level2) {
           setImage(new GreenfootImage("Level 1 Complete", 18, Color.YELLOW, Color.BLACK));
           Greenfoot.delay(200); //timer tampilan
           //getWorld().removeObject(this);
           Greenfoot.setWorld(new Level2()); //masuk ke Level2();
       }
    }  
    
    public void addScore() {
       score++;
    }
}
