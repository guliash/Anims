package guliash.com.anims;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BaseFragment extends Fragment {

    public static final String TAG = "anims";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "ON CREATE " + this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        Log.e(TAG, "ON DESTROY " + this);
        super.onDestroy();
    }

    @Override
    public void onStart() {
        Log.e(TAG, "ON START " + this);
        super.onStart();
    }

    @Override
    public void onStop() {
        Log.e(TAG, "ON STOP " + this);
        super.onStop();
    }

    @Override
    public void onResume() {
        Log.e("TAG", "ON RESUME " + this);
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e("TAG", "ON PAUSE " + this);
        super.onPause();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(TAG, "ON CREATE " + this);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        Log.e(TAG, "ON DESTROY VIEW " + this);
        super.onDestroyView();
    }
}
