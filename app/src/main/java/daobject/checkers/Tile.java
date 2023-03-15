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

    public Value inTile;

    boolean isKing;
    public Tile() {
        inTile = Value.EMPTY;
        isKing = false;
    }// default ctor

}
