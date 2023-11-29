package EjemplosCondiciones;

import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Introduce una letra: ");
        String letra = dato.nextLine();
        
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("u") || letra.equalsIgnoreCase("o"))
            System.out.println("\'" + letra + "\' es una vocal");
        else
            System.out.println("\'" + letra + "\' no es una vocal");
    }
}
