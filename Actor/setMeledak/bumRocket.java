import greenfoot.*;

/**
 * Ini adalah bumRocket(); dimana agar ketika terjadi tabrakan antara Rocket dengan -->
 * Meteor, akan terjadi ledakan dikeduanya.
 * Script ini kami dapatkan dari forum Greenfoot.org
 * bumRocket() ini juga merupakan turunan dari setMeledak();
 * 
 * @author (Summon Agus - Agus Makmun - L200130113) 
 * @blog (bloggersmart.net)
 * @version (Update: v.3.0)
 */
public class bumRocket extends setMeledak
{
    /**
     * Act - do whatever the booms wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /** How many images should be used in the animation of the explostion */
    private final static int IMAGE_COUNT= 8;
    
    /** 
     * The images in the explosion. This is static so the images are not
     * recreated for every object (improves performance significantly).
     */
    private static GreenfootImage[] images;
    
    /** Current size of the explosion */
    private int imageNo = 0;
    
    /** How much do we increment the index in the explosion animation. */
    private int increment=1;    
    private GreenfootSound bumSound = new GreenfootSound("Meledak.mp3");
    
    public bumRocket() {
        initialiseImages(1);
        setImage(images[0]);        
        //Greenfoot.playSound("Meledak.mp3");
        bumSound.setVolume(80);
        bumSound.play();
    }    
    
    /** 
     * Create the images for explosion.
     */
    public synchronized static void initialiseImages(int maxs) {
        if(images == null) {
            GreenfootImage baseImage = new GreenfootImage("daw.png");
            int maxSize = baseImage.getWidth()/maxs;
            int delta = maxSize / (IMAGE_COUNT+1);
            int size = 0;
            images = new GreenfootImage[IMAGE_COUNT];
            for(int i=0; i < IMAGE_COUNT; i ++) {
                size = size + delta;
                images[i] = new GreenfootImage(baseImage);
                images[i].scale(size, size);
            }
        }
    }
    
    /**
     * EXPLODE!
     */
    public void act()
    { 
        if(imageNo > 0) {
            setImage(images[imageNo]);
        }

        imageNo += increment;
        if(imageNo >= IMAGE_COUNT) {
            increment = -increment;
            imageNo += increment;
        }
        
        if(imageNo <= 0) {
            setImage(new GreenfootImage(1,1));
        }
        
        
    }
}
