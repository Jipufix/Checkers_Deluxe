package daobject.checkers;

import edu.up.cs301.game.GameFramework.infoMessage.GameState;

public class checkersState extends GameState {

    // Board Dimensions
    private static final int WIDTH = 8, HEIGHT = 8;

    ///////////////////////////////////////////////////
    // ************ Instance Variables ************* //
    ///////////////////////////////////////////////////
    private Tile[][] board;
    private int isTurn; // 0 if Red's Turn, 1 if Black's Turn

    /**
     *  Default constructor for the game state
     */
    public checkersState() {
        board = new Tile[HEIGHT][WIDTH];
        isTurn = 0;
    }//ctor

    /**
     * Copy constructor of the default game state
     *
     * @param original   The game state object we are copying over
     */
    public checkersState(checkersState original) {
        board = new Tile[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                board[i][j] = original.board[i][j];
            }
        }

        isTurn = original.isTurn;
    }//ctor

    @Override
    public String toString() {
        return null;
    }
}
