package guliash.com.anims;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {

    public static final String TAG = "anims";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "ON CREATE " + this);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG, "ON DESTROY " + this);
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        Log.e(TAG, "ON START " + this);
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.e(TAG, "ON STOP " + this);
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.e(TAG, "ON RESUME " + this);
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e(TAG, "ON PAUSE " + this);
        super.onPause();
    }
}
