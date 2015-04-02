import greenfoot.*;

/**
 * Ini adalah Meteor1(); yang hanya digunakan pada Level 1 saja. -->
 * Dimana settingan kecepatan meteor adalah 3.
 * Dan Settingan Banyaknya meteor ada di Level1(); yaitu berkisar antara 5 meteor saja dalam satu waktu.
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class Meteor1 extends setMeteor
{
    private int kecepatan;
    
    public Meteor1() {
        GreenfootImage img = getImage();
        int s = Greenfoot.getRandomNumber(100);
        img.scale(10+s, 10+s);  //posisi s pertama minimal, maximal
        setImage(img);
        kecepatan = 1+Greenfoot.getRandomNumber(3); //kecepatan meteor
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
