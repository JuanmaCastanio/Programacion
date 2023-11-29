package EjemplosBucles;

import java.util.Scanner;

public class Huelga2 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        /*Inicializamos contador de números, la variable para leer números 
        y la cadena para almacenar los multiplos de 5*/
        int num = 0, cont = 0;
        String multiplo5 = "";
        do{
            System.out.print("Introduce un número (0 para terminar): ");
            num = dato.nextInt();
            // Para no contar al cero
            if(num != 0){
                cont++;
                //Si es múltipo de 5, guardarlo en la cadena
                if(num % 5 == 0){
                    multiplo5 = multiplo5 + num + " ";
                }
            }
        }while(num != 0);
        System.out.println("La cantidad de números introducidos: " + cont);
        System.out.println("Los números múltiplos de 5 son: " + multiplo5);
    }
}
