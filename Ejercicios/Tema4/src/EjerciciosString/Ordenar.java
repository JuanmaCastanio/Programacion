package EjerciciosString;

import java.util.Scanner;

public class Ordenar {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Escribe un par de palabras: ");
        String palabras = dato.nextLine().trim();
        String palabra1 = palabras.substring(0, palabras.lastIndexOf(" ")).trim();
        String palabra2 = palabras.substring(palabras.lastIndexOf(" "), palabras.length()).trim();
        
        if(palabra1.compareToIgnoreCase(palabra2) < 0)
            palabras = palabra1 + " " + palabra2;
        if(palabra1.compareToIgnoreCase(palabra2) > 0)
            palabras = palabra2 + " " + palabra1;
        System.out.println(palabras.trim());
    }
}