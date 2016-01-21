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

        Rectangle lagom = new Rectangle(20, 30, 15, 10, Color.darkGray);
        Rectangle gert = new Rectangle(1, 2, 100, 50, Color.blue);

        Text kort = new Text(15, 20, 12, Color.black, "En kort text");
        Text mitten = new Text(100, 200, 18, Color.BLACK, "En lite storare text");

        shapes.add(stor);
        shapes.add(liten);
        shapes.add(mellan);
        shapes.add(lagom);
        shapes.add(gert);
        shapes.add(kort);
        shapes.add(mitten);

        for (Shape shape : shapes) {
            //shape.draw();
        }
    }
}
