package EjerciciosPDFTema2;

import java.util.Scanner;

public class Cambio {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Introduce una cantidad de dinero (en euros): ");
        double cuenta = dato.nextDouble();
        System.out.println("El equivalente a dólares es " + cuenta * 1.06 + " $");
    }
}
