package EjerciciosPDFTema2;

import java.util.Scanner;

public class Minutos {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Introduce un tiempo en segundos: ");
        int segundos = dato.nextInt();
        System.out.println( segundos / 60 + " m " + segundos % 60 + " s");
    }
}
