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

        AVAIL, //Available move when displaying possible moves
    }//Value

    // Instance Variables //
    private Value inTile;
    private boolean isKing; //Empty spaces are assumed to be false
    private int row;
    private int col;

    public Tile(int row, int col) {
        inTile = Value.EMPTY;
        isKing = false;
        this.row = row;
        this.col = col;
    }//ctor

    /** --- GETTER METHOD --- */
    public Value getInTile() {return inTile;}//getValue

    /** --- GETTER METHOD --- */
    public boolean getKing() {return isKing;}//isKing

    /** --- SETTER METHOD --- */
    public void setInTile(Value value) {inTile = value;}//setValue

    /** --- SETTER METHOD --- */
    public void setKing(Boolean givenKing) {isKing = givenKing;} //toggleKing

}//Tile
