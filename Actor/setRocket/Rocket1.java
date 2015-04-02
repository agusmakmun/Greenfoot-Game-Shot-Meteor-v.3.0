 import greenfoot.*;

/**
 * Ini adalah settingan Rocket1(); yang mengacu pada Peluru1(); Counter1(); Meteor1(); dan Level1();
 * Sehingga terdapat 1 acuan untuk level tertentu.
 * Ini juga merupakan turunan dari setRocket();
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class Rocket1 extends setRocket
{
    private int fireDelay = 15; //jumlah delay sekaligus kecepatan semakin kecil semakin cepat
    private GreenfootSound pecutSound = new GreenfootSound("Pecut.mp3");
    
    public void act() 
    {
        menembak();
        roketkena();
        kendali();
    }
    
    public void menembak() {
        fireDelay--;
        if(Greenfoot.isKeyDown("space") && fireDelay < 2) {
            Greenfoot.playSound("Pecut.mp3");//tembak.wav
            //pecutSound.setVolume(50);
            //pecutSound.playLoop();
            getWorld().addObject(new Peluru1(getRotation()), getX(), getY());
        }
        if (fireDelay <=1)
        {
            fireDelay = 15; //looping delay semakin kecil semakin cepat
        }
    }
    
    private int nyawa_awal = 2; //batasan nyawa pada level1
    private int nyawa_akhir = 0;
            
    public void roketkena() {
        if (isTouching(Meteor1.class)) {
            
            int x = getX();
            int y = getY();
                        
            World my_world = getWorld();
            bumRocket kena_bro = new bumRocket();
            
            if (isTouching(Meteor1.class)) {
                //Greenfoot.playSound("Meledak.mp3");
                removeTouching(Meteor1.class);
                
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
