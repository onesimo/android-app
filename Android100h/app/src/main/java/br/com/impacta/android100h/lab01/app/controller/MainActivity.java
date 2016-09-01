package br.com.impacta.android100h.lab01.app.controller;

import android.os.Bundle;

import br.com.impacta.android100h.R;
import br.com.impacta.android100h.lab02.app.controller.MegaSenaActivity;
import br.com.impacta.android100h.lab03.app.controller.GorjetaActivity;
import br.com.impacta.android100h.lab08.app.controller.NotaDrawerActivity;

/**
 * Created by no1602 on 04/12/2015.
 * Para rotacionar emulador ctrl + f11
 * para mover emulador   alt+spaco+seta
 */
public class MainActivity extends ImpactaActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lab01_main);

        setToastOnClickAction(R.id.lab01_bt_megasena);
        setOnClickActivityAction(R.id.lab01_bt_megasena, MegaSenaActivity.class);
        setOnClickActivityAction(R.id.lab01_bt_gorjeta, GorjetaActivity.class);
        setToastOnClickAction(R.id.lab01_bt_intent);
        setToastOnClickAction(R.id.lab01_bt_cpf);
        setToastOnClickAction(R.id.lab01_bt_cep);
        setToastOnClickAction(R.id.lab01_bt_game01);
        setToastOnClickAction(R.id.lab01_bt_gps);
        setToastOnClickAction(R.id.lab01_bt_game02);
        setToastOnClickAction(R.id.lab01_bt_service);
        setToastOnClickAction(R.id.lab01_bt_bluetooth);
        setToastOnClickAction(R.id.lab01_bt_sms);
        setToastOnClickAction(R.id.lab01_bt_camera);
        setToastOnClickAction(R.id.lab01_bt_game03);
        setToastOnClickAction(R.id.lab01_bt_share_preferences);
        setOnClickActivityAction(R.id.lab01_bt_sqlite, NotaDrawerActivity.class);

    }
}
