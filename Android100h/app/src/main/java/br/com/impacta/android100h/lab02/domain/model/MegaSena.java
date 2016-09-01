package br.com.impacta.android100h.lab02.domain.model;

import java.util.ArrayList;

/**
 * Created by no1602 on 11/01/2016.
 */
public final class MegaSena {


    private MegaSena() {
      super();
    }

    public interface Bundle {
        String JOGO = "lab02.megasena.jogo";
        String JOGOS = "lab02.megasena.jogos";


        ArrayList<String> getStringArrayList(String jogos);

        int getCharSequence(String jogo);
    }

    public static String sortear() {
        final Byte[] jogo = {0, 0, 0, 0, 0, 0};
        return String.format(Formats.JOGO, jogo);

    }

    public static ArrayList<String> sortear(int jogos) {
       final ArrayList<String> js = new ArrayList<>();
       return js;
    }
}
