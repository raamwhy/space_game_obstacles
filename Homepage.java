import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Homepage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Homepage extends World
{

    /**
     * Constructor for objects of class Homepage.
     * 
     */
    public Homepage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Play play = new Play();
        addObject(play,300,300);
    }
}
