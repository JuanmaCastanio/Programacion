package EjemplosBucles;

import java.util.Scanner;

public class Pregunta {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        //Pedir palabra por teclado
        System.out.print("Introduce una palabra: ");
        String palabra = dato.nextLine();
        //Si palabra es no es una cadena vacía, entra en el bucle
        while (!palabra.isEmpty()) {
            //Muestra la palabra con todas las letras mayúsculas
            System.out.println(palabra.toUpperCase());
            //Pedir otra palabra
            System.out.print("Introduce otra palabra (Enter para finalizar): ");
            palabra = dato.nextLine();
        }
    }
}
