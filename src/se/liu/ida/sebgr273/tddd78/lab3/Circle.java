package se.liu.ida.sebgr273.tddd78.lab3;

import java.awt.*;

/**
 * Created by Sebastian on 2016-01-21.
 */
public class Circle implements Shape{
    private int x;
    private int y;
    private int radius;
    private java.awt.Color color;

    public Circle(int x, int y, int radius, Color color) {
        if (radius < 0){
            throw new IllegalArgumentException("Negativ radie!");
        }
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }
}
