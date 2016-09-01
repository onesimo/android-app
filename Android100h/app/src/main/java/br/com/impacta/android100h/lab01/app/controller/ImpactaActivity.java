package br.com.impacta.android100h.lab01.app.controller;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import br.com.impacta.android100h.R;

/**
 * Created by no1602 on 04/12/2015.
 */
public class ImpactaActivity extends Activity {

    protected <T extends View> T getViewById(int id) {
        return (T) findViewById(id);
    }

    protected void setOnClickAction(final View view, View.
            OnClickListener action) {
        if (view != null) {
            view.setOnClickListener(action);
        }
    }

    protected void setToastOnClickAction(final int id) {
        final Button b = getViewById(id);
        final Resources r = getResources();
        final CharSequence text;

        text = r.getString(R.string.lab01_toast_clicado,
                b.getText());

        setOnClickAction(b, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t;

                t = Toast.makeText(getApplicationContext(),
                        text, Toast.LENGTH_SHORT);

                t.show();
            }
        });
    }

    protected void setOnClickAction(final int id, View.
            OnClickListener action) {
        View v = getViewById(id);
        setOnClickAction(v, action);

    }

    protected void setOnClickActivityAction(final int id, final Class<?> _class) {
        setOnClickAction(id, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), _class);
                startActivity(i);
            }
        });
    }

    protected void copyToClipboard(CharSequence key,
                                   CharSequence value, int idMessage) {
        ClipboardManager clipboard;
        ClipData clip;
        Toast t;

        clipboard = (ClipboardManager)
                getSystemService(CLIPBOARD_SERVICE);
        clip = ClipData.newPlainText(key, value);
        t = Toast.makeText(getApplicationContext(),
                idMessage, Toast.LENGTH_LONG);

        clipboard.setPrimaryClip(clip);
        t.show();
    }

    protected void copyToClipboard(CharSequence key, CharSequence value) {
        copyToClipboard(key, value, R.string.clipboard);
    }

    protected void copyToClipboard(CharSequence value) {
        copyToClipboard(Keys.CLIPBOARD, value);
    }

    protected void setText(int id, CharSequence value) {
        TextView et = getViewById(id);
        et.setText(value);
    }

    protected void setOnLongClickAction(final View view, View.
            OnLongClickListener action) {
        if (view != null) {
            view.setOnLongClickListener(action);
        }
    }

    protected void setOnLongClickAction(int id, View.
            OnLongClickListener action) {
        View v = getViewById(id);

        setOnLongClickAction(v, action);
    }

   // CopyToClipboardAction


    public interface Keys {
        String CLIPBOARD = "impacta.clip";
    }
}
