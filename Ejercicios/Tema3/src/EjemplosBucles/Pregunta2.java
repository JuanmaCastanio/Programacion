package EjemplosBucles;

import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        int numCaracteres = 0 , numFrases = 0; // Variables que acumula caracteres y frases
        String palabra; // Variable encargada de introducir palabras y dar la respuesta para continuar

        do {
            System.out.print("Introduce una palabra o frase: ");
            palabra = dato.nextLine().trim();
            //Muestra la palabra con todas las letras mayúsculas
            System.out.println(palabra.toUpperCase());
            //Acumula los caracteres de la cadena actual 
            numCaracteres += palabra.length();
            //Cuenta la frase
            numFrases++;
            // Verificación para seguir introduciendo palabras
            System.out.println("¿Quieres continuar? (s/n): ");
            palabra = dato.nextLine().trim();
            //Se repite si no introduces s o n,tanto en mayúscula como en minúscula
            while (!(palabra.equalsIgnoreCase("s")) && !(palabra.equalsIgnoreCase("n"))) {
                System.out.println("Error. Introduce uno de estos datos --> s/n: ");
                palabra = dato.nextLine().trim();
            }
        //Comparación ignorando si son mayusculas o minúscualas    
        } while(palabra.equalsIgnoreCase("s")); 
        System.out.println("Todas las palabras utilizadas suman " + numFrases + " frases y " + numCaracteres + " caracteres");
        dato.close();
    }
}