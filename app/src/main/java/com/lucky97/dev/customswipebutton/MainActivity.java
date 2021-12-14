package com.lucky97.dev.customswipebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CustomSwipeButton swipeBtn = findViewById(R.id.swipeButton);
        swipeBtn.setSwipeDistance(0.5f);

        swipeBtn.setOnSwipeListener(new CustomSwipeButton.OnSwipeListener() {
            @Override
            public void onSwipeConfirm() {
                // user has swiped the btn. Perform your async operation now
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipeBtn.showResultIcon(true, false);

                    }
                }, 2000);
            }
        });
    }
}