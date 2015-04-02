import greenfoot.*;

/**
 * Ini adalah Peluru3(); yang merupakan turunan dari setPeluru(); -->
 * yang nantinya digunakan untuk Rocket3() yaitu pada level ke-3 "Level3();".
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class Peluru3 extends setPeluru
{
    private int direction, speed;
    
    public Peluru3(int dir) {
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
        
          if (isTouching(Meteor3.class)) {
            //Greenfoot.playSound("Meledak.mp3");
            my_world.addObject(bum, x, y);
            removeTouching(Meteor3.class);
            
            World myWorld = getWorld();
            Level3 bgbaru = (Level3)myWorld;  //background merupakan nama background
            Counter3 counter = bgbaru.getCounter3();
            counter.addScore();
        }
    }
    public void peluru_hilang() {
        if (isAtEdge()) {
           getWorld().removeObject(this);
        }
    }
}
