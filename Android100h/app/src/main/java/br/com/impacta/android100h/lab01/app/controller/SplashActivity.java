package br.com.impacta.android100h.lab01.app.controller;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;

import br.com.impacta.android100h.R;

/**
 * Created by no1602 on 04/12/2015.
 */
public class SplashActivity extends ImpactaActivity {

    private Handler h;
    private Resources r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab01_splash);

        h = new Handler();
        r = getResources();
    }

    @Override
   protected void onResume() {
        super.onResume();

        final Intent i = new Intent(this, MainActivity.class);
        final int d = r.getInteger(R.integer.lab01_handler_delay);

        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(i);
            }
            }, d);
        }
}

