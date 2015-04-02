import greenfoot.*;
import java.util.List;

/**
 * Ini adalah settingan background Level3 dan beberapa object baru didalamnya
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class Level3 extends setBackground
{    
    //update counter score ke world
    Counter3 counter = new Counter3();
    public Counter3 getCounter3() {
        return counter;
    }
    
    public Level3()
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
        
        if (getObjects(Meteor3.class).size() < 20) { //pembatasan jumlah meteor untuk level3
            addObject(new Meteor3(), x, y);
        }
        
    }
    
    private void prepare()
    {
        //tampilan untuk counter nantinya
        //perhatikan untuk tidak lebih dari 1 object counter
        addObject(counter, 76, 39);
        counter.setLocation(420, 15);
        
        Rocket3 rocket = new Rocket3();
        addObject(rocket, 120, 248);
        rocket.setLocation(60, 259);  
    }
}
