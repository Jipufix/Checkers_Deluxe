package daobject.checkers;

/**
 * The individual tiles on the board
 *
 * @author   Ashton Char
 * @author   Eli Marcelino
 * @author   Matt David
 * @version  March 2023
 */

public class Tile {
    public enum Value {
        EMPTY,
        RED,
        BLACK,
    }

    private Value inTile;

    private boolean isKing;
    public Tile() {
        inTile = Value.EMPTY;
        isKing = false;
    }// default ctor

    public Value getInTile() {
        return inTile;
    }

    public boolean isKing() {
        return isKing;
    }

}
