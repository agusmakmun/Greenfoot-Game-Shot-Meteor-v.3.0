import greenfoot.*;

/**
 * Ini adalah Meteor2(); yang hanya digunakan pada Level 2 saja. -->
 * Dimana settingan kecepatan meteor adalah 5.
 * Dan Settingan Banyaknya meteor ada di Level2(); yaitu berkisar antara 10 meteor dalam satu waktu.
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class Meteor2 extends setMeteor
{
    private int kecepatan;
    
    public Meteor2() {
        GreenfootImage img = getImage();
        int s = Greenfoot.getRandomNumber(100);
        img.scale(10+s, 10+s);  //posisi s pertama minimal, maximal
        setImage(img);
        kecepatan = 1+Greenfoot.getRandomNumber(5); //kecepatan meteor
    }
    
    public void act() 
    {
        move(-kecepatan);
        hilang();
    }
    
    public void hilang() {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
