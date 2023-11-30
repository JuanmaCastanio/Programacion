package Examen;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String tramo1 = "", tramo2 = ""; //Cadenas para recoger las dos mitades de la palabra

        System.out.print("Palabra: ");
        String palabra = dato.nextLine().trim().toLowerCase();//Palabra introducida
        //Se recoge el primer tramo hasta la mitad
        tramo1 = palabra.substring(0, palabra.length()/2);
        //Se recoge el segundo tramo, invirtiendo su orden
        for (int i = palabra.length()-1; i > (palabra.length()/2); i--) {
            tramo2 = tramo2 + palabra.charAt(i);
        }
        //Si ambos son iguales, es un palindromo
        if(tramo1.equals(tramo2)){
            System.out.println("Es un palíndromo");
        }
        else{
            System.out.println("No es un palíndromo");
        }
    }
}
