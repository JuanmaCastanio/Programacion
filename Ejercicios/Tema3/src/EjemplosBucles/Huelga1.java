package EjemplosBucles;

import java.util.Scanner;

public class Huelga1 {
    public static void main(String[] args) {
        java.util.Scanner dato = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int num = dato.nextInt();
        // Se inicializan variables para contar y sumar tanto pares como impares
        int contPar = 0, sumaPar = 0, contImpar = 0, sumaImpar = 0;
        while(0 <= num){
            //Si es par, el contador aumenta en 1 y se suma el número
            if(num % 2 == 0){
                contPar++;
                sumaPar += num;
            }
            //Si es impar, hace lo mismo
            else if(num % 2 != 0){
                contImpar++;
                sumaImpar += num;
            }
            num--;
        }
        System.out.println("Cantidad pares: " + contPar);
        System.out.println("La suma de todos los pares es: " + sumaPar);
        System.out.println("Cantidad impares: " + contImpar);
        System.out.println("La suma de todos los impares: " + sumaImpar);
    }
}
