package se.liu.ida.sebgr273.tddd78.lab3;

import java.awt.*;

/**
 * Created by Sebastian on 2016-01-21.
 */
public abstract class AbstractShape implements Shape {

    protected int x;
    protected int y;
    protected Color color;

    public AbstractShape(int y, int x, Color color) {
        this.y = y;
        this.x = x;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractShape that = (AbstractShape) o;

        if (x != that.x) return false;
        if (y != that.y) return false;
        return color.equals(that.color);

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public int getX(){
        return x;
    }

    @Override
    public int getY(){
        return y;
    }

    @Override
    public Color getColor(){
        return color;
    }
}
