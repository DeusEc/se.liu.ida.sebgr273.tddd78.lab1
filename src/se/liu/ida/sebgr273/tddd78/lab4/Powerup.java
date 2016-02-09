package se.liu.ida.sebgr273.tddd78.lab4;

/**
 * Created by Sebastian on 2016-02-09.
 */
import java.awt.*;

public interface Powerup
{
    String getDescription();

    public void paint(Graphics g, int x, int y);
    public void playerHitMe(Player player);
}
