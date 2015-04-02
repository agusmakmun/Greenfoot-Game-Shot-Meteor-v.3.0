 import greenfoot.*;

/**
 * Ini adalah settingan Rocket2(); yang mengacu pada Peluru2(); Counter2(); Meteor2(); dan Level2();
 * Sehingga terdapat 1 acuan untuk level tertentu.
 * Ini juga merupakan turunan dari setRocket();
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class Rocket2 extends setRocket
{
    private int fireDelay = 10; //jumlah delay sekaligus kecepatan semakin kecil semakin cepat
    
    public void act() 
    {
        menembak();
        roketkena();
        kendali();
    }
    
    public void menembak() {
        fireDelay--;
        if(Greenfoot.isKeyDown("space") && fireDelay < 2) {
            Greenfoot.playSound("tembak.wav");            
            getWorld().addObject(new Peluru2(getRotation()), getX(), getY());
        }
        if (fireDelay <=1)
        {
            fireDelay = 10; //looping delay semakin kecil semakin cepat
        }
    }
    
    private int nyawa_awal = 3; //batasan nyawa pada level 2
    private int nyawa_akhir = 0;
    
    public void roketkena() {
        if (isTouching(Meteor2.class)) {
            
            int x = getX();
            int y = getY();
            
            World my_world = getWorld();
            bumRocket kena_bro = new bumRocket();
            if (isTouching(Meteor2.class)) {
                //Greenfoot.playSound("Meledak.mp3");
                removeTouching(Meteor2.class);
                
                nyawa_awal -= 1;
                if (nyawa_awal == nyawa_akhir) {
                    Greenfoot.setWorld(new GameOver());
                }
            }
            my_world.addObject(kena_bro, x, y);
            //my_world.removeObject(this);
            
        }
    }
   
}
