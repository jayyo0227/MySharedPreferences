package jayyo.mysharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferenceHelper.get().setAppContext(getApplicationContext());

        SharedPreferenceHelper.get().putString("airplay_key", "test");

        Log.i(TAG, SharedPreferenceHelper.get().getString("airplay_key_A", "defaultValue"));
    }
}