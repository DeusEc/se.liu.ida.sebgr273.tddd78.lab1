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

        Rectangle lagom = new Rectangle(150, 200, 40, 60, Color.MAGENTA);
        Rectangle klot = new Rectangle(300, 400, 25, 10, Color.RED);

        Text beskrivande = new Text(100, 50, 12, "En beskrivande text", Color.black);
        Text ickebeskrivande = new Text(20, 20, 18, "What is love?", Color.black);

        shapes.add(stor);
        shapes.add(liten);
        shapes.add(mellan);
        shapes.add(lagom);
        shapes.add(klot);
        shapes.add(beskrivande);
        shapes.add(ickebeskrivande);

        for (Shape shape : shapes) {
            //shape.draw();
        }
    }
}
