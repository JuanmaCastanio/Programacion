package EjerciciosPDFTema2;

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Escribe el primer número real ");
        double n1 = dato.nextDouble();
        System.out.print("Escribe el segundo número real ");
        double n2 = dato.nextDouble();
        System.out.print("Escribe el operando de la operación a realizar: ");
        String op = dato.next();
        
        double resultado = ("+".equals(op)) ? n1 + n2 
            : ("-".equals(op)) ? n1 - n2 
                : ("*".equals(op)) ? n1 * n2 
                    : ("/".equals(op)) ? n1 / n2 
                        : ("%".equals(op)) ? n1 % n2 : Double.MAX_VALUE;
        String verificacion = (resultado == 1.7976931348623157E308) ? "Error" : n1 + " " + op + " " + n2 + " = " + resultado;
        System.out.println("Solución: " + verificacion);
    }
}
