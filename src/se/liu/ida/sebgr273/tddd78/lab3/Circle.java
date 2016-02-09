package se.liu.ida.sebgr273.tddd78.lab3;

import java.awt.*;

/**
 * Created by Sebastian on 2016-01-21.
 */
public class Circle extends AbstractShape{
    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        if (radius < 0){
            throw new IllegalArgumentException("Negativ radie!");
        }
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw(Graphics g) {
        //System.out.printf("Ritar: " + this);
        int height = radius*2;
        int width = radius*2;
        g.setColor(color);
        g.drawOval(x, y, width, height); // calculated from radius!
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", radius=" + radius +
                ", color=" + getColor() +
                '}';
    }
}
