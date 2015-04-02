import greenfoot.*;

/**
 * Ini adalah Meteor3(); yang hanya digunakan pada Level 3 saja. -->
 * Dimana settingan kecepatan meteor adalah 10.
 * Dan Settingan Banyaknya meteor ada di Level3(); yaitu berkisar antara 20 meteor dalam satu waktu.
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class Meteor3 extends setMeteor
{
    private int kecepatan;
    
    public Meteor3() {
        GreenfootImage img = getImage();
        int s = Greenfoot.getRandomNumber(100);
        img.scale(10+s, 10+s);  //posisi s pertama minimal, maximal
        setImage(img);
        kecepatan = 1+Greenfoot.getRandomNumber(10); //kecepatan meteor
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
