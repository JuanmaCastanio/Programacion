package EjerciciosPDFTema2;

import java.util.Scanner;

public class Pascua {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Escribe un año: ");
        int anio = dato.nextInt();
        int N = 22 + ((19 * (anio % 19) + 24) % 30) + ((2 * (anio % 4) + 4 * (anio % 7) + 6 * ((19 * (anio % 19) + 24) % 30) + 5) % 7);
        System.out.println(((N <= 31) ? N : String.valueOf(N - 31)) + " de " + ((N <= 31) ? "Marzo" : "Abril"));
    }
}
