package EjerciciosCondiciones;

import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Introduce un numero el primer bit: ");
        int b2 = dato.nextInt();
        System.out.print("Introduce un numero el segundo bit: ");
        int b1 = dato.nextInt();
        System.out.print("Introduce un numero el tercero bit: ");
        int b0 = dato.nextInt();
        if((b2 != 1 && b2 != 0) || (b1 != 1 && b1 != 0) || (b0 != 1 && b0 != 0))
            System.out.println("Error");
        else
            System.out.println("Decimal: " + (b2*4 + b1*2 + b0));
    }
}