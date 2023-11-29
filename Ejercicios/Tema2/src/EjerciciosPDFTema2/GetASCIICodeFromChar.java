package EjerciciosPDFTema2;

import java.util.Scanner;

public class GetASCIICodeFromChar {
    public static void main(String[] args) throws Exception {
        Scanner dato = new Scanner(System.in);
    
        System.out.print("Escribe una letra: ");
        char caracter = dato.next().charAt(0);
        System.out.println("El valor ASCII de \'" + caracter + "\' es: " + (int)caracter);
    }
}   
