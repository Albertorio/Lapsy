package com.chamas.luis.lapsy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import co.gofynd.gravityview.GravityView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    GravityView gravityView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.bg);
        gravityView = GravityView.getInstance(this).setImage(imageView, R.drawable.main_pic).center();
    }

    @Override
    protected void onResume() {
        super.onResume();
        gravityView.registerListener();
    }

    @Override
    protected void onStop() {
        super.onStop();
        gravityView.unRegisterListener();
    }
}
