package infoMessage;

/*
 * Contains the state of the game :)
 *
 * @author   Ashton Char
 * @author   Eli Marcelino
 * @author   Matt David
 * @version  March 2023
 */

import androidx.annotation.NonNull;

import edu.up.cs301.game.GameFramework.infoMessage.GameState;

import daobject.checkers.Tile;


public class CheckersState extends GameState {

    // Board Dimensions //
    private static final int WIDTH = 8, HEIGHT = 8;

    // Instance Variables //
    private Tile[][] board;
    private boolean isTurn; //true if P1's Turn, false if P2's turn
    private boolean isClicked; //A boolean
    private double timeElapsed;

    /** Default constructor for the game state */
    public CheckersState() {
        board = new Tile[HEIGHT][WIDTH];
        isTurn = true; //Allows player 1 to go first
        isClicked = false;
        timeElapsed = 0;
    }//default ctor

    /**
     * Copy constructor of the default game state
     * @param original   The game state object we are copying over
     */
    public CheckersState(CheckersState original) {
        board = new Tile[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            System.arraycopy(original.board[i], 0, board[i], 0, WIDTH);
        }

        isTurn = original.isTurn;
        isClicked = original.isClicked;
        timeElapsed = original.timeElapsed;
    }//ctor

    /**
     * Turns all board data into one long string
     * @return The appended string
     */
    @NonNull
    @Override
    public String toString() {
        String result = "PlayerTurn: ";
        if (isTurn) {
            result += "Red's turn";
        } else if (!isTurn) {
            result += "Black's turn";
        }
        result += "\n ";

        result += "Time Elapsed: " + timeElapsed + "\n ";

        // Actual conversion of the board's content
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                String board1 = "";
                switch (board[i][j].getInTile()) {
                    case EMPTY: {
                        board1 = " ";
                        break;
                    }
                    case BLACK: {
                        board1 = "B";
                        break;
                    }
                    case RED: {
                        board1 = "R";
                        break;
                    }
                }
                result += " " + board1;
            }
            result += "\n ";
        }

        return result;
    }//toString

    /**
     * --- HELPER METHOD ---
     * Checks the surrounding tiles for valid moves
     * @return True if valid, false if out of bounds
     */
    public boolean validMove (int row, int col) {
        if (row < 0 || col < 0 || row > HEIGHT || col > HEIGHT) {
            return false;
        } else if (board[row][col].getInTile() != Tile.Value.EMPTY) {
            return false;
        }
        return true;
    }//validMove

}//CheckersState
