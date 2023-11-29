package Autoevaluacion;
/* Hacer un programa que cuente las veces que aparece una determinada letra en una frase,
 * ambas introducidas por teclado. 
 */

import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = dato.nextLine();
        System.out.print("Introduce una letra: ");
        char letra = dato.nextLine().charAt(0);
        int cont = 0;

        for (int i = 0; i <= frase.length() - 1; i++) {
            if(frase.charAt(i) == letra)
                cont++;    
        }
        System.out.println("La letra '" + letra + "' aparece " + cont);
    }
}
