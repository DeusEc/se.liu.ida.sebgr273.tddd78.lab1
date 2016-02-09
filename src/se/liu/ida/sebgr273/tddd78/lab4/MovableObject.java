package se.liu.ida.sebgr273.tddd78.lab4;

/**
 * Created by Sebastian on 2016-02-09.
 */
public class MovableObject
{
    protected int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public MovableObject(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
