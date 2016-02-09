package se.liu.ida.sebgr273.tddd78.lab4;

/**
 * Created by Sebastian on 2016-02-09.
 */
import java.awt.*;

public class SpeedPowerup implements Powerup
{
    @Override public String getDescription() {
        return "Makes a player faster";
    }

    public void playerHitMe(final Player player) {
        player.setSpeed(Player.Speed.FAST);
    }

    public void paint(Graphics g, int x, int y) {
        g.fillRect(x, y, 10, 10);
    }
}
