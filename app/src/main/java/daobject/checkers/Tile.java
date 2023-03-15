package daobject.checkers;

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
