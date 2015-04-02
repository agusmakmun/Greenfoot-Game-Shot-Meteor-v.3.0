import greenfoot.*;
import java.util.List;

/**
 * Ini adalah settingan background Level2 dan beberapa object baru didalamnya
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class Level2 extends setBackground
{
    //update counter score ke world
    
    Counter2 counter = new Counter2();
    public Counter2 getCounter2() {
        return counter;
    }
    
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare();
        //Remove_Rocket();
        //Greenfoot.playSound("bg_mulai.mp3");
    }
    
    //menambah meteor
    public void act() {
        int x = getWidth();
        int y = Greenfoot.getRandomNumber(getHeight());
        
        if (getObjects(Meteor2.class).size() < 10) { //pembatasan jumlah meteor untuk level2
            addObject(new Meteor2(), x, y);
        }
        
    }
    
    
    private void prepare()
    {
        //tampilan untuk counter nantinya
        //perhatikan untuk tidak lebih dari 1 object counter
        addObject(counter, 76, 39);
        counter.setLocation(420, 15);
        
        Rocket2 rocket = new Rocket2();
        addObject(rocket, 120, 248);
        rocket.setLocation(60, 259);
              
    }
}
