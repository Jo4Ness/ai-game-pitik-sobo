import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class info extends Actor
{
    /**
     * Act - do whatever the info wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseMoved(this)){
            this.setImage("images/info-hover.png");
        } else {
            this.setImage("images/info.png");
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Credit());
        }
    }    
}
