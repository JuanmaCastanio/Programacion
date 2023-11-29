package EjerciciosBucles;

import java.util.Random;

public class Triangulo4 {
    public static void main(String[] args) {
        Random generador = new Random();
        int base = generador.nextInt(1,11);
        System.out.println("Base: " + base + "\n");
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
