package EjemplosBucles;

//Programa que muestre por consola un número de asteriscos entre 1 y 100
//Resuelvelo con los 3 tipos de bucles (while,do-while,for)

import java.util.Random;

public class Ejemplo8 {
    public static void main(String[] args) {
        Random generador = new Random();
        int num = generador.nextInt(1,31);
        System.out.println(num);
        int i = 0;
        //Bucle while
        while (i < num){
            System.out.print("*");
            i++;
        }
        System.out.println("\n");
        //Bucle do while
        i = 0;
        do {
            System.out.print("*");
            i++;
        }while (i < num);
        System.out.println("\n");
        //Bucle for
        for(i = 0;i<num;i++){
            System.out.print("*");
        }
    }
}
