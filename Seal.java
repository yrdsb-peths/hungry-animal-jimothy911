import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seal extends Actor
{
    /**
     * Act - do whatever the Seal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("a")){
            move(-20);
        }
        if(Greenfoot.isKeyDown("d")){
            move(10);
        }
        
        eat();
        munch();
  
    }
    private void eat() {
        if(isTouching(Cherry.class)) {
            removeTouching(Cherry.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnCherry();
            world.increaseScore();
        }
    }
    private void munch() {
        if(isTouching(Baby.class)) {
            removeTouching(Baby.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnBaby();
            world.decreaseScore();
        }
    }
}
