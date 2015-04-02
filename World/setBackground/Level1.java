import greenfoot.*;

/**
 * Ini adalah settingan background Level1 dan beberapa object didalamnya
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class Level1 extends setBackground
{
    private GreenfootSound bgSound = new GreenfootSound("bg_mulai.mp3");
    
    //update counter score ke world
    Counter1 counter = new Counter1();
    public Counter1 getCounter1() {
        return counter;
    }
   
    public Level1()
    {  
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //Greenfoot.playSound("bg_mulai.mp3"); //menambah sound track
        prepare();
        started();
    }
        
    //Level1 stop_sound = new Level1();
    //stop_sound.stopped();
    
    public void started() {
        bgSound.setVolume(95);
        bgSound.play();
        //bgSound.playLoop();
    }
    public void stopped() {
        bgSound.stop();
        bgSound.pause();
    }
    //menambah meteor
    public void act() {
        started();
        
        int x = getWidth();
        int y = Greenfoot.getRandomNumber(getHeight());
                
        if (getObjects(Meteor1.class).size() < 5) { //pembatasan jumlah meteor untuk level1
            addObject(new Meteor1(), x, y);
        }
    }
    

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        //tampilan untuk counter nantinya
        //perhatikan untuk tidak lebih dari 1 object counter
        addObject(counter, 76, 39);
        counter.setLocation(420, 15);
        
        Rocket1 rocket = new Rocket1();
        addObject(rocket, 120, 248);
        rocket.setLocation(60, 259);        
    }
}
