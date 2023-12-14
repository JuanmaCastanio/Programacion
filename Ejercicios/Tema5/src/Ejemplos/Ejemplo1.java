package Ejemplos;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Programa que realiza operacioes aritméticas con dos operandos enteros
 * 
 */
public class Ejemplo1 {
   /**
    * Método que realiza la suma de 2 enteros recibidos como parámetros
    * 
    * @param operando1
    * @param operando2
    */
    public static int sumar(int operando1, int operando2){
        int suma = operando1 + operando2;
        return suma;
    }
   /**
    * Método que realiza la resta de 2 enteros recibidos como parámetros
    * 
    * @param operando1
    * @param operando2
    */
    public static int restar(int operando1, int operando2){ 
        return operando1 - operando2; 
    }
   /**
    * Método que realiza la multiplicación de 2 enteros recibidos como parámetros
    * 
    * @param operando1
    * @param operando2
    */
    public static int multiplicar(int operando1, int operando2){
        return operando1 * operando2;
    }
    /**
     * 
     * @param operando1
     * @param operando2
     * @return
     */
    public static double dividir(int operando1, int operando2){
        return operando1 / (double)operando2;
    }
   /**
    * Método que realiza la división de 2 enteros recibidos como parámetros
    * 
    * @param operando1
    * @param operando2
    */
    public static double dividir(int operando1, int operando2, int precision){
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(precision);
        String resultado  = nf.format(operando1 / (double)operando2);
        return Double.parseDouble(resultado);
        
    }

    public static void main(String[] args) {

        int num1 = 2, num2 =3;

        System.out.println(sumar(num1,  num2));
        int resultado = restar(num1, num2);
        System.out.println(resultado);
        System.out.println(multiplicar(num1, num2));
        System.out.println(dividir(num1, num2));
        System.out.println(dividir(num1, num2, 4));
    }
}