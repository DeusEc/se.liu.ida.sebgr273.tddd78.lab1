package se.liu.ida.sebgr273.tddd78.lab4;

/**
 * Created by Sebastian on 2016-02-09.
 */
import java.awt.*;

public class InvulnerablePowerup implements Powerup
{
    public void paint(Graphics g, int x, int y) {
        g.fillOval(x, y, 10, 10);
    }

    public void playerHitMe(Player player) {
        player.setMode(Player.Mode.INVULNERABLE);
    }

    @Override public String getDescription() {
        return "Makes a player invulnerable for a while";
    }
}
