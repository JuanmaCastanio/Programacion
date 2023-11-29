package EjerciciosPDFTema2;

import java.util.Scanner;

public class SignoNumero {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int numero = dato.nextInt();
        System.out.println((numero == 0) ? "Nulo" : (numero > 0) ? "Positivo" : "Negativo");

    }
}