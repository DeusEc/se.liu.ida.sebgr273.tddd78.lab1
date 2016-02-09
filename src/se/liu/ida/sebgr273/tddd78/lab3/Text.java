package se.liu.ida.sebgr273.tddd78.lab3;

import java.awt.*;

/**
 * Created by Sebastian on 2016-01-21.
 */
public class Text extends AbstractShape{
    private int size;
    private String text;

    public Text(int x, int y, int size, String text, Color color) {
        super(x, y, color);
        this.size = size;
        this.text = text;
    }

    @Override
    public void draw(Graphics g) {
        //System.out.printf("Ritar: " + this);
        g.setColor(color);
        g.setFont(new Font("serif", Font.PLAIN, size));
        g.drawString(text, x, y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", size=" + size +
                ", text=" + text +
                ", color=" + getColor() +
                '}';
    }
}
