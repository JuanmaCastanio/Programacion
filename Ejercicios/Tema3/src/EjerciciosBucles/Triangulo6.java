package EjerciciosBucles;

import java.util.Random;

public class Triangulo6 {
    public static void main(String[] args) {
        Random generador = new Random();
        int base = generador.nextInt(1,11);
        int lineas = base *2; 
        System.out.println("Base: " + base + "\n");
        for (int i = 1; i <= lineas; i++) {
            if(i <= (base)){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            else{
                for (int j = 1; j <= lineas - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
