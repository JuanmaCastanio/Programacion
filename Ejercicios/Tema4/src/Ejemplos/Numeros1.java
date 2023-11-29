package Ejemplos;

import java.text.NumberFormat;
import java.util.Locale;

public class Numeros1 {
    public static void main(String[] args) {
        
        double numero = 1234.567;
        NumberFormat nf1 = NumberFormat.getInstance(); //Formateo predeterminado
        nf1.setMaximumFractionDigits(1);
        System.out.println(nf1.format(numero));

        NumberFormat nf2 = NumberFormat.getCurrencyInstance();
        System.out.println(nf2.format(numero));

        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf3.format(numero));

        NumberFormat nf4 = NumberFormat.getPercentInstance();
        nf4.setMinimumFractionDigits(2);
        System.out.println(nf4.format(0.4353464));

        NumberFormat nf5 = NumberFormat.getIntegerInstance();
        System.out.println(nf5.format(numero));
    }
}
