package daobject.checkers;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import daobject.checkers.GameFramework.GameMainActivity;
import daobject.checkers.GameFramework.gameConfiguration.GameConfig;
import daobject.checkers.GameFramework.LocalGame;
import daobject.checkers.GameFramework.infoMessage.GameState;

public class MainActivity extends GameMainActivity {


    @Override
    public GameConfig createDefaultConfig() {
        return null;
    }

    @Override
    public LocalGame createLocalGame(GameState gameState) {
        return null;
    }
}