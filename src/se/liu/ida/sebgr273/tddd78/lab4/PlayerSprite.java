package se.liu.ida.sebgr273.tddd78.lab4;

/**
 * Created by Sebastian on 2016-02-09.
 */
public class PlayerSprite extends MovableObject
{
    private final String name;

    public PlayerSprite(final String name, final int x, final int y) {
        super(x, y);
        this.name = name;
    }
}