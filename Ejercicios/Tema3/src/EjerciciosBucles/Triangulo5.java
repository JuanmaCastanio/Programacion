package EjerciciosBucles;

import java.util.Random;

public class Triangulo5 {
    public static void main(String[] args) {
        Random generador = new Random();
        int base = generador.nextInt(1,11);
        System.out.println("Base: " + base + "\n");
        for (int i = base; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }  
}
