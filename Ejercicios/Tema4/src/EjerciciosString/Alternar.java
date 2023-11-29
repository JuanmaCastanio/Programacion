package EjerciciosString;

import java.util.Scanner;

public class Alternar {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = dato.nextLine();
        String cadenaAlternativa = "";
        boolean esImpar = true;  

        do {
            if(esImpar){
                cadenaAlternativa = cadenaAlternativa + cadena.charAt(0);
                esImpar = false;
                cadena = cadena.substring(1, cadena.length());
            }
            else{
                cadenaAlternativa = cadenaAlternativa + cadena.charAt(cadena.length() - 1);
                esImpar = true;
                cadena = cadena.substring(0, cadena.length() - 1);
            }
        } while(!cadena.equals(""));
        System.out.println(cadenaAlternativa);
    }
}