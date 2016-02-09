package se.liu.ida.sebgr273.tddd78.lab3;

import javax.swing.*;
import java.awt.*;

public class DiagramViewer {
    public static void main(String[] args) {
    	DiagramComponent comp = new DiagramComponent();

    	// Add several shapes to the component
    	comp.addShape(new Circle(10, 20, 50, Color.BLUE));
        comp.addShape(new Text(30, 50, 20,
                "Nobody expects the spanish inquisition",
                Color.BLACK));
        comp.addShape(new Rectangle(100, 100, 90, 40, Color.green));

    	JFrame frame = new JFrame("Mitt fönster");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLayout(new BorderLayout());
    	frame.add(comp, BorderLayout.CENTER);
    	frame.setSize(800,600);
    	frame.setVisible(true);
    }
}
