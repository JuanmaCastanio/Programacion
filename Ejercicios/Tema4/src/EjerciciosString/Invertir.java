package EjerciciosString;

import java.util.Scanner;

public class Invertir {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Cadena original: ");
        String cadena = dato.nextLine();
        String cadenaInvertida = "";

        for (int i = 0; i < cadena.length(); i++) {
            if(Character.isUpperCase(cadena.charAt(i)))
                cadenaInvertida = cadenaInvertida + cadena.toLowerCase().charAt(i);
            else if(Character.isLowerCase(cadena.charAt(i)))
                cadenaInvertida = cadenaInvertida + cadena.toUpperCase().charAt(i);
            else{
                cadenaInvertida = cadenaInvertida + " ";
            }
        }
        System.out.println("Cadena Invertida: " + cadenaInvertida);
    }
}
