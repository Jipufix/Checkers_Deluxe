package daobject.checkers;



import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import edu.up.cs301.game.GameFramework.GameMainActivity;
import edu.up.cs301.game.GameFramework.LocalGame;
import edu.up.cs301.game.GameFramework.gameConfiguration.GameConfig;
import edu.up.cs301.game.GameFramework.infoMessage.GameState;
import edu.up.cs301.tictactoe.TTTLocalGame;
import edu.up.cs301.tictactoe.infoMessage.TTTState;

public abstract class MainActivity extends GameMainActivity {

    Button button = findViewById(R.id.run_test);
    EditText editText = findViewById(R.id.editTextTextMultiLine);

    @Override
    public void onClick(View button) {
        editText.clearComposingText();

        CheckersState firstInstance = new CheckersState();

        CheckersState secondInstance = new CheckersState(firstInstance);



        super.onClick(button);
    }

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
}