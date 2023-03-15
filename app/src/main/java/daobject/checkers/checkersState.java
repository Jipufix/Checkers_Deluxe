package daobject.checkers;

import edu.up.cs301.game.GameFramework.infoMessage.GameState;

public class checkersState extends GameState {

    ///////////////////////////////////////////////////
    // ************ Instance Variables ************* //
    ///////////////////////////////////////////////////
    private Tile[][] board;
    private boolean isTurn; // True when player's turn

    /**
     *  Default constructor for the game state
     */
    public checkersState() {
        board = new Tile[8][8];
        isTurn = true;
    }//ctor

    /**
     * Copy constructor of the default game state
     *
     * @param original   The game state object we are copying over
     */
    public checkersState(checkersState original) {

    }//ctor

}
