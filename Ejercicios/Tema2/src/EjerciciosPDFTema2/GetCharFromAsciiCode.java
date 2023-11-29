package EjerciciosPDFTema2;

import java.util.Scanner;

public class GetCharFromAsciiCode {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Escribe el valor ASCII: ");
        int valorAscii = dato.nextInt();
        System.out.println("El valor ASCII " + valorAscii + " pertenece al caracter \'" + (char)valorAscii + "\'");
    }
}
