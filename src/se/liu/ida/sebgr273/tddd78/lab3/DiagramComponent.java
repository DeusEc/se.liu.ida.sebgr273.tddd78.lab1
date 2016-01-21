package se.liu.ida.sebgr273.tddd78.lab3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.Graphics;

/**
 * Created by Sebastian on 2016-01-21.
 */
public class DiagramComponent extends JComponent{
    @Override
    protected void paintComponent(final Graphics g){
        super.paintComponent(g);
    }

    private List<Shape> shapes = new ArrayList<>();

    public DiagramComponent(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void addShape(Shape s){
        shapes.add(s);
    }
}
