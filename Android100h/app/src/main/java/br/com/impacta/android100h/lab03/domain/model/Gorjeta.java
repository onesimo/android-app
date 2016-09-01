package br.com.impacta.android100h.lab03.domain.model;

/**
 * Created by no1602 on 15/01/2016.
 */
final public class Gorjeta {
    public interface Formats {
        String VALUE = "%.02f";
    }
    public static final String VALOR_0 = "0.00";

    private Gorjeta() {
        super();
    }

    public static double calcularGorjeta(double valor, double percentual) {
        return valor * percentual;
    }

    private static double toPercent(Integer value) {
        return value / 100.0;
    }
    public static CharSequence calcularValor(double valor, double percentual) {
       return String.format(Formats.VALUE, (valor + calcularGorjeta(valor, percentual)));
    }

    public static CharSequence calcularGorjeta(CharSequence valor, Integer percentual) {
        valor = valor == null || valor.length() == 0 ?
                VALOR_0 : valor;

        return calcularGorjeta(Double.valueOf(valor.
                toString()), percentual);
        }

    public static CharSequence calcularGorjeta(Double valor,Integer percentual) {
       percentual = percentual == null ? Integer. valueOf(VALOR_0) : percentual;

       return String.format(Formats.VALUE, calcularGorjeta(valor, toPercent(percentual)));
    }

    public static CharSequence calcularValor(CharSequence
                                                     valor, Integer percentual) {
         valor = valor == null || valor.length() == 0 ?
                VALOR_0 : valor;

         return calcularValor(Double.valueOf(valor.
                toString()), percentual);
          }

            public static CharSequence calcularValor(Double valor,
                                                         Integer percentual) {
          percentual = percentual == null ? Integer.
                valueOf(VALOR_0) : percentual;

          return calcularValor(valor, toPercent(percentual));
          }

}
