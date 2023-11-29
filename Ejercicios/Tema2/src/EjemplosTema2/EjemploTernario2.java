package EjemplosTema2;

import java.util.Scanner;

/**
 * Programa que solicite al usuario el importe de la venta
 * Se aplicará un descuento en función de este importe
 * Hasta 5.000 € --> No hay descuento
 * Entre 5.000 y 10.000 € --> Descuento del 5%
 * Ventas superiores a 10.000 € --> Descuento del 7%
 */

public class EjemploTernario2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un importe de venta: ");
        double venta = sc.nextDouble();
        final double DESCUENTO5 = 0.05;
        final double DESCUENTO7 = 0.07;
        double importe = (venta <= 5000) ? venta:((5000 < venta && venta <= 10000) ? venta * (1 - DESCUENTO5): venta * (1 - DESCUENTO7));  
        
        System.out.println("Tu importe es de " + importe + " euros");
        
        sc.close();
    }
}
