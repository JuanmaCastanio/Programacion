package EjerciciosString;

import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = dato.nextLine();
        int cont = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.toLowerCase().charAt(i) == 'a' ||  cadena.toLowerCase().charAt(i) == 'e' 
            || cadena.toLowerCase().charAt(i) == 'i' || cadena.toLowerCase().charAt(i) == 'o' 
            || cadena.toLowerCase().charAt(i) == 'u')
                cont ++;
        }
        System.out.println("En '" + cadena +  "' hay " + cont + " vocales");
    }
}
