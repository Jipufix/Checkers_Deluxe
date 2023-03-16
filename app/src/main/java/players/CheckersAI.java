package players;

/**
 * The "computer players" of the game with 2 types
 *      DUMB AI: Plays first possible move going from bottom to top
 *      SMART AI: Looks for moves the maximizes piece capture and
 *          avoids moving the back row
 *
 * @author   Ashton Char
 * @author   Eli Marcelino
 * @author   Matt David
 * @version  March 2023
 */

import edu.up.cs301.game.GameFramework.infoMessage.GameInfo;
import edu.up.cs301.game.GameFramework.infoMessage.NotYourTurnInfo;
import edu.up.cs301.game.GameFramework.players.GameComputerPlayer;
import edu.up.cs301.game.GameFramework.utilities.Logger;

public class CheckersAI extends GameComputerPlayer {
    /** Constructor for the CheckersAI */
    public CheckersAI(String name) {
        super(name);
    }//ctor

    /**
     * Called when the player receives a game-state (or other info)
     * from the game
     * @param info   The message from the game
     */
    @Override
    protected void receiveInfo(GameInfo info) {

        // if it was a "not your turn" message, just ignore it
        if (info instanceof NotYourTurnInfo) return;
        Logger.log("CheckersComputer", "My turn!");

        // pick x and y positions at random (0-2)
        int xVal = (int)(3*Math.random());
        int yVal = (int)(3*Math.random());

        // delay for a second to make opponent think we're thinking
        sleep(1);

        // Submit our move to the game object. We haven't even checked it it's
        // our turn, or that that position is unoccupied. If it was not our turn,
        // we'll get a message back that we'll ignore. If it was an illegal move,
        // we'll end up here again (and possibly again, and again). At some point,
        // we'll end up randomly pick a move that is legal.

    }//recieveInfo
}
