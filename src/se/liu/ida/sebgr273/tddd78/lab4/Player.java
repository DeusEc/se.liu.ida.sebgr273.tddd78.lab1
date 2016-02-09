package se.liu.ida.sebgr273.tddd78.lab4;

/**
 * Created by Sebastian on 2016-02-09.
 */
public class Player
{
    public enum Speed{
        SLOW(5), MEDIUM(10), FAST(20);

        private final int speed;

        Speed(final int speed){
            this.speed = speed;
        }
    }

    public enum Mode{
        NORMAL("Normal"), GHOST("Ghost"), INVULNERABLE("Invulnerable");

        private final String mode;

        Mode(final String mode){
            this.mode = mode;
        }
    }

    private int x, y;
    private Speed speedType = Speed.MEDIUM;
    private Mode modeType = Mode.NORMAL;

    public Speed getSpeed() {
        return speedType;
    }

    public void setSpeed(final Speed speed) {
        this.speedType = speed;
    }

    public Mode getMode() {
        return modeType;
    }

    public void setMode(final Mode mode) {
        this.modeType = mode;
    }

    public void moveRight() {
        x += speedType.speed;
    }

    /**
     * Describe current speed and mode -- used for a status display
     */
    public String getDescription() {
        StringBuilder buf = new StringBuilder();
        buf.append("Player is ");

        buf.append(speedType);

        buf.append(" and ");

        buf.append(modeType);

        return buf.toString();
    }

    public static void main(String[] args) {
        final Player player = new Player();
        System.out.println(player.getDescription());
    }
}
