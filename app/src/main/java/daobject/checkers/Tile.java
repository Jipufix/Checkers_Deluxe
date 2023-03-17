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
    }//Value

    // Instance Variables //
    private Value inTile;
    private boolean isKing; //Empty spaces are assumed to be false

    public Tile() {
        inTile = Value.EMPTY;
        isKing = false;
    }//default ctor
    /** Flips the value of kings */
    public void toggleKing(Boolean givenKing) {isKing = !givenKing}//toggleKing

    /** --- GETTER METHOD --- */
    public Value getInTile() {
        return inTile;
    }//getValue

    /** --- GETTER METHOD --- */
    public boolean isKing() {
        return isKing;
    }//isKing

    /** --- SETTER METHOD --- */
    public void setInTile(Value value) {inTile = value;}//setValue

}//Tile
