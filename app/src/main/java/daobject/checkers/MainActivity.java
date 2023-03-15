package daobject.checkers;



import android.view.View;
import android.widget.Button;

import edu.up.cs301.game.GameFramework.GameMainActivity;
import edu.up.cs301.game.GameFramework.LocalGame;
import edu.up.cs301.game.GameFramework.gameConfiguration.GameConfig;
import edu.up.cs301.game.GameFramework.infoMessage.GameState;
import edu.up.cs301.tictactoe.TTTLocalGame;
import edu.up.cs301.tictactoe.infoMessage.TTTState;

public abstract class MainActivity extends GameMainActivity implements View.OnClickListener{

    Button button = findViewById(R.id.run_test);

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