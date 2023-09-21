import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower extends Actor
{
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkCollision();
    }
    private void checkCollision() {
        Actor Plane = getOneIntersectingObject(Plane.class);
        if (Plane != null) {
            int PlaneX = Plane.getX();
            int PlaneY = Plane.getY();
            World world = getWorld();
            if (world != null) {
                world.removeObject(this);
                world.addObject(new Boom(), PlaneX, PlaneY);
            }
        }
     }
}
