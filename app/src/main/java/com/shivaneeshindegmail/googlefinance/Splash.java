package com.shivaneeshindegmail.googlefinance;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timer = new Thread() {
            public void run(){
                try {
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent start=new Intent("com.shivaneeshindegmail.googlefinance.STARTINGPOINT");
                    startActivity(start);
                }
            }
        };
        timer.start();
    }
    protected  void onPause(){
        super.onPause();
        finish();
    }
}
