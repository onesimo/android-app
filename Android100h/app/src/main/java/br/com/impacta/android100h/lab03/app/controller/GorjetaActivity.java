package br.com.impacta.android100h.lab03.app.controller;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;

import br.com.impacta.android100h.R;
import br.com.impacta.android100h.lab01.app.controller.ImpactaActivity;
import br.com.impacta.android100h.lab01.design.pattern.OnSeekBarChangeAdapter;
import br.com.impacta.android100h.lab01.design.pattern.TextWatcherAdapter;
import br.com.impacta.android100h.lab03.domain.model.Gorjeta;

/**172.16.7.4
 * Created by no1602 on 15/01/2016.
 */
public class GorjetaActivity extends ImpactaActivity {
    private EditText etCONTA;
    private SeekBar sbDEF;


    private class ValorZeroTextWatcherAction extends TextWatcherAdapter {

        @Override
        public void onTextChanged(CharSequence s, int start,
                                  int before, int count) {
            if (s == null || s.length() == 0) {
                etCONTA.setText(Gorjeta.VALOR_0);
                etCONTA.selectAll();
            }
        }
    }

    private class Calcular10PorcentoTextWatcherAction extends
            TextWatcherAdapter {

        @Override
        public void onTextChanged(CharSequence s, int start,
                                  int before, int count) {
            final Resources r = getResources();
            CharSequence v;
            Integer p;

            p = r.getInteger(R.integer.lab03_percent_1);
            v = Gorjeta.calcularGorjeta(s, p);
            setText(R.id.lab01_bt_gorjeta, v);

            v = Gorjeta.calcularValor(s, p);
            setText(R.id.lab03_et_valor_1, v);
        }
    }


    private class Calcular15PorcentoTextWatcherAction extends
            TextWatcherAdapter {

        @Override
        public void onTextChanged(CharSequence s, int start,
                                  int before, int count) {
            final Resources r = getResources();
            CharSequence v;
            Integer p;

            p = r.getInteger(R.integer.lab03_percent_2);
            v = Gorjeta.calcularGorjeta(s, p);
            setText(R.id.lab03_et_gorjeta_2, v);

            v = Gorjeta.calcularValor(s, p);
            setText(R.id.lab03_et_valor_2, v);
        }
    }

    private class Calcular20PorcentoTextWatcherAction extends
            TextWatcherAdapter {

        @Override
        public void onTextChanged(CharSequence s, int start,
                                  int before, int count) {
            final Resources r = getResources();
            CharSequence v;
            Integer p;

            p = r.getInteger(R.integer.lab03_percent_3);
            v = Gorjeta.calcularGorjeta(s, p);
            setText(R.id.lab03_et_gorjeta_3, v);

            v = Gorjeta.calcularValor(s, p);
            setText(R.id.lab03_et_valor_3, v);
        }
    }


    private class CalcularPercentagemDefinidaTextWatcherAction
            extends TextWatcherAdapter {

        @Override
        public void onTextChanged(CharSequence s, int start,
                                  int before, int count) {
            CharSequence v;
            Integer p;

            p = sbDEF.getProgress();
            v = Gorjeta.calcularGorjeta(s, p);
            setText(R.id.lab03_et_gorjeta_def, v);

            v = Gorjeta.calcularValor(s, p);
            setText(R.id.lab03_et_valor_def, v);
        }
    }


    private class OnSeekBarChangeAction extends
            OnSeekBarChangeAdapter {

        @Override
        public void onProgressChanged(SeekBar seekBar,
                                      int progress, boolean fromUser) {
            CharSequence v, s;

            s = etCONTA.getText();
            v = Gorjeta.calcularGorjeta(s, progress);
            setText(R.id.lab03_et_gorjeta_def, v);

            v = Gorjeta.calcularValor(s, progress);
            setText(R.id.lab03_et_valor_def, v);

            //setText(R.id.lab03_tv_def, R.string.lab03_tv_percent, progress);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lab03_gorjeta);

        etCONTA = getViewById(R.id.lab03_et_conta);
        sbDEF = getViewById(R.id.lab03_sb_def);

        etCONTA.addTextChangedListener(new
                ValorZeroTextWatcherAction());
        etCONTA.addTextChangedListener(new
                Calcular10PorcentoTextWatcherAction());
        etCONTA.addTextChangedListener(new
                Calcular15PorcentoTextWatcherAction());
        etCONTA.addTextChangedListener(new
                Calcular20PorcentoTextWatcherAction());
        etCONTA.addTextChangedListener(new
                CalcularPercentagemDefinidaTextWatcherAction());

        sbDEF.setOnSeekBarChangeListener(new
                OnSeekBarChangeAction());
        /*
        setOnLongClickAction(R.id.lab03_et_gorjeta_1,
                new CopyToClipboardAction());
        setOnLongClickAction(R.id.lab03_et_gorjeta_2,
                new CopyToClipboardAction());
        setOnLongClickAction(R.id.lab03_et_gorjeta_3,
                new CopyToClipboardAction());

        setOnLongClickAction(R.id.lab03_et_valor_1, new CopyToClipboardAction());
        setOnLongClickAction(R.id.lab03_et_valor_2, new
                CopyToClipboardAction());
        setOnLongClickAction(R.id.lab03_et_valor_3, new
                CopyToClipboardAction());

        setOnLongClickAction(R.id.lab03_et_gorjeta_def,
                new CopyToClipboardAction());
        setOnLongClickAction(R.id.lab03_et_valor_def,
                new CopyToClipboardAction());
        */
    }
}
