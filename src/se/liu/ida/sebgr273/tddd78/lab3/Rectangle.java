package se.liu.ida.sebgr273.tddd78.lab3;

import java.awt.*;
import java.awt.Color;

/**
 * Created by Sebastian on 2016-01-21.
 */
public class Rectangle extends AbstractShape{
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(y, x, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }
}
