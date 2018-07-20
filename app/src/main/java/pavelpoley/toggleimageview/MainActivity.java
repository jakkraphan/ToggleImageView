package pavelpoley.toggleimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import pavelpoley.toggleimage.ToggleImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleImageView toggleImageView = findViewById(R.id.toggleImageView);
        
        toggleImageView.addStateListener(new ToggleImageView.OnStateChangedListener() {
            @Override
            public void onChecked() {
                Log.d(TAG, "onChecked: ");
            }

            @Override
            public void onUnchecked() {
                Log.d(TAG, "onUnchecked: ");
            }
        });

        toggleImageView.setChecked();

    }

   
}
