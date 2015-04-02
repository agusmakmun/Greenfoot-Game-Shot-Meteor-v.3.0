import greenfoot.*;

/**
 * Ini adalah Peluru2(); yang merupakan turunan dari setPeluru(); -->
 * yang nantinya digunakan untuk Rocket1() yaitu pada level ke-2 "Level2();".
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class Peluru2 extends setPeluru
{
    private int direction, speed;
    
    public Peluru2(int dir) {
        direction = dir; //arah peluru
        speed = 30; //kecepatan peluru
    }
    
    public void act() {
        kena(); //harus berada diatas peluru_hilang() agar tidak error
        setRotation(direction);
        move(speed);
        peluru_hilang();
    }
    
    //file:///usr/share/doc/Greenfoot/API/greenfoot/Actor.html#isTouching(java.lang.Class)
    public void kena() {
        int x = getX();
        int y = getY();
        World my_world = getWorld();
        bumMeteor bum = new bumMeteor();
        
          if (isTouching(Meteor2.class)) {
            //Greenfoot.playSound("Meledak.mp3");
            my_world.addObject(bum, x, y);
            removeTouching(Meteor2.class);
            
            World myWorld = getWorld();
            Level2 bgbaru = (Level2)myWorld;  //Level2 merupakan nama background
            Counter2 counter = bgbaru.getCounter2();
            counter.addScore();
        }
    }
    public void peluru_hilang() {
        if (isAtEdge()) {
           getWorld().removeObject(this);
        }
    }
}
