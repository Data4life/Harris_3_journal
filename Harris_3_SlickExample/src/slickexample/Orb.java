package slickexample;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Orb {
    private int x,y,width,height;
    private int dmg,hitboxX,hitboxY,hitboxWidth,hitboxHeight;
    private boolean isVisible;
    Image orbpic;
    Shape hitbox;
    
    public Orb (int a,int b) throws SlickException {
    this.x = a;
    this.y = b;
    this.isVisible = false;
    this.orbpic = new Image ("res/Orbs/Ninja_12.png");
    this.hitbox = new Rectangle (a,b,32,32);
    
    
    /*
    * Gettersand Setters are a common concept in Java.
    * A design guideline in Java, and object oriented
    * programmining in general, is to encapsulate/isolate
    * values as much as possible.
    * Getters - are methods used to query the value of 
    * instance variables
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    */
    }
    
    
    
    
    
    
    
    
    
}
