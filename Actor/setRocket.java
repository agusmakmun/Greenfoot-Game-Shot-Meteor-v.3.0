 import greenfoot.*;

/**
 * Ini adalah kumpulan Rocket, dimana didalam setRocket ini hanya terdapat fungsi ->
 * yang dapat digunakan untuk seluruh actor Rocket yang berbeda, yaitu navigation keyboard.
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class setRocket extends Actor
{
    public void act() 
    {
        kendali();
    }
    
    public void kendali() {
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+5);
        }
        if(Greenfoot.isKeyDown("left")) {
            move(-5);
        }
        if(Greenfoot.isKeyDown("right")) {
            move(5);
        }
    }
}
