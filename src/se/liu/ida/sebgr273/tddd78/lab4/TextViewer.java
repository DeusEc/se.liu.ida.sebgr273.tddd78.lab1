package se.liu.ida.sebgr273.tddd78.lab4;

/**
 * Created by Sebastian on 2016-02-03.
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class TextViewer extends JComponent {

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    public static final int LEFT_ALIGN = 0;
    public static final int FONT_SIZE = 12;
    public static final int ROW_DISTANCE = 2;
    public static final int PARAGRAPH_DISTANCE = 8;

    private List<String> textArray= new ArrayList<>(Arrays.asList(
            "This is the first line of the first paragraph of text.",
            "It is followed by the second line of text.",
            "Which is followed by the third line of text.",
            "Start of the second paragraph of text.",
            "Continuation of the second paragraph of text.",
            "Conclusion of the second paragraph of text.",
            "Start of the third paragraph of text.",
            "Continuation of the third paragraph of text.",
            "Conclusion of the third paragraph of text."
    ));
    private int startX;
    private int paragraph;
    private int row;

    private void drawRow(Graphics g, String text){
        if(row != 0 && row % 3 == 0){paragraph++;}
        int y = (row+1)*FONT_SIZE+row*ROW_DISTANCE+paragraph*PARAGRAPH_DISTANCE;
        g.drawString(text, startX, y);
        row++;
    }

    public TextViewer() throws HeadlessException {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.startX = LEFT_ALIGN;
        this.paragraph = 0;
        this.row = 0;
    }

    public static void main(String[] args) {
	JFrame frame = new JFrame("TextViewer");
	frame.add(new TextViewer());
	frame.pack();
	frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override protected void paintComponent(final Graphics g) {
	g.setColor(Color.BLACK);
	g.setFont(new Font("serif", Font.PLAIN, FONT_SIZE));
    for (String s : textArray) {
        drawRow(g, s);
    }
    }
}