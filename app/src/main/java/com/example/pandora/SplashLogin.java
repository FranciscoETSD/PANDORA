package com.example.pandora;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SplashLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_login);
        LottieAnimationView lottieAnimationView = null;
        lottieAnimationView.enableMergePathsForKitKatAndAbove(true);

        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Thread td = new Thread(){

            public void run() {
                try {

                }catch (Exception ex){
                    ex.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplashLogin.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };td.start();
    }
}