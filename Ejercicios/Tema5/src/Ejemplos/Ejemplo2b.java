package Ejemplos;

import java.util.Scanner;

public class Ejemplo2b {
    
    static int num;

    public static double raizCuadrada(){
        if(num >0){
            return Math.sqrt(num);
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = dato.nextInt();
        double raiz = raizCuadrada(num);
        if(raiz != -1){
            System.out.println("Raiz cuadrada = " + raiz);
        }
        else{
            System.out.println("Error de cálculo");
        }

    }
}
