package droids.rizz.videoplayer;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import droids.rizz.videoplayer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        setUp();
    }

    private void setUp() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, VideoPlayerFragment.newInstance(null, null)).commit();
    }
}
