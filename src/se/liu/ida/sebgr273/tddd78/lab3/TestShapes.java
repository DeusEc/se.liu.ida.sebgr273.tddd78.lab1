package se.liu.ida.sebgr273.tddd78.lab3;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Sebastian on 2016-01-21.
 */
public class TestShapes {
    public static void main(String[] args) {
        final ArrayList<Shape> shapes = new ArrayList<>();

        Circle stor = new Circle(10, 20, 15, Color.darkGray);
        Circle liten = new Circle(5, 5, 3, Color.blue);
        Circle mellan = new Circle(20, 25, 30, Color.green);

        shapes.add(stor);
        shapes.add(liten);
        shapes.add(mellan);

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
