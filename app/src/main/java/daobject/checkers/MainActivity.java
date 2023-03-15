package daobject.checkers;


import android.widget.Button;

import edu.up.cs301.game.GameFramework.GameMainActivity;
import edu.up.cs301.game.GameFramework.gameConfiguration.GameConfig;

public abstract class MainActivity extends GameMainActivity {

    Button button = findViewById(R.id.run_test);

    @Override
    public GameConfig createDefaultConfig () {
        return null;
    }
}