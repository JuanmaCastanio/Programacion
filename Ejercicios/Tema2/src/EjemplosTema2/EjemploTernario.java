package EjemplosTema2;

import java.util.Scanner;

/**
 * Ejemplos de uso del operador ternario
 * cuya sintaxis es 
 * expresión_booleana ? valor1 : valor2;
 **/


public class EjemploTernario {
    public static void main(String[] args) {
        /**
         * Pedimos una nota al usuario
         * Si es mayor que 5, aprobado
         * si no, suspenso
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una nota: ");
        double nota = sc.nextDouble();
        String resultado = (nota >= 5)? "aprobado" : "suspenso"; 
        System.out.println("Has " + resultado);
        

        /**
         * Pedimos al usuario el saldo de su cuenta
         * Si es mayor de 1000 € no se le aplica comisión
         * si no, hay que aplicar una comisión del 2% 
         */
        System.out.print("Introduce el saldo de tu cuenta: ");
        int saldo = sc.nextInt();
        final double COMISION = 0.02;
        double resultado2 = (saldo < 1000) ? saldo * (1 - COMISION) : saldo; 
        System.out.println("Su saldo es de " + resultado2 + " euros");

        sc.close();
    }    
}
