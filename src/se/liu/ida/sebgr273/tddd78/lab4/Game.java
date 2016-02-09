package se.liu.ida.sebgr273.tddd78.lab4;

/**
 * Created by Sebastian on 2016-02-09.
 */
import java.util.ArrayList;
import java.util.List;

public class Game
{
    private Player player = new Player();
    private List<Powerup> activePowerups = new ArrayList<>();

    public void playerHitPowerup(Powerup power) {
        activePowerups.add(power);
        power.playerHitMe(player);
    }
}
