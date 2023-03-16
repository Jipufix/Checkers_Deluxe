package daobject.checkers;

/*
 * The main activity of the game
 *
 * @author   Ashton Char
 * @author   Eli Marcelino
 * @author   Matt David
 * @version  March 2023
 */

import android.view.View;
import android.widget.EditText;

import edu.up.cs301.game.GameFramework.GameMainActivity;
import edu.up.cs301.game.GameFramework.LocalGame;
import edu.up.cs301.game.GameFramework.gameConfiguration.GameConfig;
import edu.up.cs301.game.GameFramework.infoMessage.GameState;
import edu.up.cs301.tictactoe.TTTLocalGame;
import edu.up.cs301.tictactoe.infoMessage.TTTState;

import infoMessage.CheckersState;

public abstract class MainActivity extends GameMainActivity {
    @Override
    public void onClick(View button) {
        //Run Test Button
        if (button.getId() == R.id.run_test) {
            EditText editText = findViewById(R.id.editTextTextMultiLine);
            editText.clearComposingText();

            //Instances before any changes/moves are made
            CheckersState firstInstance = new CheckersState();
            CheckersState secondInstance = new CheckersState(firstInstance);

            // *** INSERT METHOD CALLS HERE *** //

            //Instances after any changes/moves are made
            CheckersState thirdInstance = new CheckersState();
            CheckersState fourthInstance = new CheckersState(thirdInstance);

            /* Prints out the text for both the before and after game
             states and puts it into the multi-line Edit Text */
            editText.append(secondInstance.toString());
            editText.append(fourthInstance.toString());
        }
    }//onClick

    @Override
    public GameConfig createDefaultConfig () {
        return null;
    }//GameConfig

    @Override
    public LocalGame createLocalGame(GameState gameState){
        if(gameState == null)
            return new TTTLocalGame();
        return new TTTLocalGame((TTTState) gameState);
    }//LocalGame

}//MainActivity