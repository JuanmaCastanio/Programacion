package Ejercicios;

import java.util.Scanner;

public class Primo {
    
    
    public static void main(String[] args) {
        OperacionesPrimos primo = new OperacionesPrimos();
        Scanner dato = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = dato.nextInt();
        System.out.println(primo.esPrimo(numero));
    }
}
