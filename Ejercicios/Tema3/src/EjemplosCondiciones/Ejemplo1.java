package EjemplosCondiciones;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) throws Exception {
        Scanner dato = new Scanner(System.in);

        System.out.print("Introduce una nota: ");
        int nota = dato.nextInt();
        if(nota >= 5)
            System.out.println("APROBADO");
        System.out.println("NOTA PROGRAMACIÓN");
        System.out.println("Adiós...");
    }
}
