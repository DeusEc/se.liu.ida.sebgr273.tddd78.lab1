package se.liu.ida.sebgr273.tddd78.lab4;

/**
 * Created by Sebastian on 2016-02-09.
 */
public class GameBoard
{
    private enum CellType
    {
        EMPTY(false), TREE(true), BUILDING(true),
        ROCK(true), POWERUP(false), BORDER(true);

        public final boolean isObstacle;

        CellType(final boolean isObstacle) {
            this.isObstacle = isObstacle;
        }
    }

    private CellType[][] cells;
    private int currentX, currentY;

    public GameBoard(int width, int height) {
        this.cells = new CellType[height][width];
        this.currentX = width / 2;
        this.currentY = height / 2;
    }

    public enum Move {
        DOWN(0,1), UP(0, -1), RIGHT(1, 0), LEFT(-1, 0);

        private final int deltaX;
        private final int deltaY;

        Move(final int deltaX, final int deltaY){
            this.deltaX = deltaX;
            this.deltaY = deltaY;
        }
    }

    public void move(Move here){
        if (canMove(here)){
            currentX = here.deltaX;
            currentY = here.deltaY;
        }
    }
    public boolean canMove(Move here){
        return !cells[currentY + here.deltaY][currentX + here.deltaX].isObstacle;
    }
}
