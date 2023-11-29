package Ejemplos;

import java.text.DecimalFormat;

public class Numero2 {
    public static void main(String[] args) {
        DecimalFormat df1 = new DecimalFormat("#,##0.## ;(#,##0.##)"); //Plantilla para numeros positivos y negativos
        System.out.println(df1.format(12345.678));
        System.out.println(df1.format(-12345.678));
        System.out.println(df1.format(.678));
        System.out.println(df1.format(12345));
    
        DecimalFormat df2 = new DecimalFormat("#,##0.00 ;(#,##0.00)");
        System.out.println(df2.format(12345.678));
        System.out.println(df2.format(-12345.678));
        System.out.println(df2.format(.678));
        System.out.println(df2.format(12345));
    
    }
}
