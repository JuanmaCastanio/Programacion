package Autoevaluacion;
/*
 * Hacer un programa que compruebe si dos números son amigos.
 * Dos números son amigos si la suma de los divisores del primero, excepto él, es igual al segundo número,
 * y viceversa. Los números serán enteros positivos y se introducirán por teclado.
 */

import java.util.Scanner;

public class EjercicioB {
    public static void main(String[] args) {
        Scanner dato  = new Scanner(System.in);
        int num1, num2, cont1 = 1, cont2 = 1;

       do {
            System.out.print("Introduce el primer número: ");
            num1 = dato.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = dato.nextInt();
            if(num1 < 1 || num2 < 1)
                System.out.println("Error. El número es negativo o 0");
            else{
                for (int i = 2 ; i < (num1/2) + 1; i++) {
                    if(num1 % i == 0)
                        cont1 += i;
                }
                if (cont1 == num2) {
                    for (int i = 2 ; i < (num2/2) + 1; i++) {
                        if(num2 % i == 0)
                            cont2 += i;
                     }
                    if( cont2 == num1)
                        System.out.println("Los números " + num1 + " y " + num2 + " son BFF");
                    else
                        System.out.println("Los números " + num1 + " y " + num2 + " no son BFF");
                }
                else
                    System.out.println("Los números " + num1 + " y " + num2 + " no son BFF");      
            }
       } while (num1 < 1 || num2 < 1);
    }
}