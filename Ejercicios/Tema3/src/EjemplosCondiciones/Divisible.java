package EjemplosCondiciones;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        int n1 = dato.nextInt();
        System.out.print("Escribe el segundo número:");
        int n2 = dato.nextInt();

        if(n1 % n2 == 0)
            System.out.println("Es divisible");
        else
            System.out.println("No es divisible");
    }
}
