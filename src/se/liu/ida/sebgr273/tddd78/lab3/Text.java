package se.liu.ida.sebgr273.tddd78.lab3;

import java.awt.*;

/**
 * Created by Sebastian on 2016-01-21.
 */
public class Text extends AbstractShape{
    private int size;
    private String text;

    public Text(int x, int y, int size, Color color, String text) {
        super(y, x, color);
        this.size = size;
        this.text = text;
    }

    @Override
    public void draw(Graphics g) {
        System.out.println("Ritar: " + this);
    }

    @Override
    public String toString() {
        return "Text{" +
                "x=" + x +
                ", y=" + y +
                ", size=" + size +
                ", color=" + color +
                ", text='" + text + '\'' +
                '}';
    }
}
