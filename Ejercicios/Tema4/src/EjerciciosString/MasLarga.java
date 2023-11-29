package EjerciciosString;

import java.util.Scanner;

public class MasLarga {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String cadena; //Cadena que introduces
        String cadenaLarga = ""; //Cadena más larga introducida

        do {
            System.out.print("Introduce una cadena: ");
            cadena = dato.nextLine();
            //Comparamos la cadena actual con la mayor
            if(cadena.length() > cadenaLarga.length())
                cadenaLarga = cadena;
        //Se detiene hasta que se introduzca vacío
        } while (!cadena.isEmpty());
        System.out.println("La cadena más larga es '" + cadenaLarga + "'");
    }
}
