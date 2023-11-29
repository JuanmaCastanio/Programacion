package EjerciciosBucles;

import java.util.Random;

public class Variacion3 {
    public static void main(String[] args) {
        Random generador = new Random();
        int num1 = generador.nextInt(1,10);
        int num2 = generador.nextInt(1,10);
        int num3 = generador.nextInt(1,10);
        System.out.println("Número 1: " + num1 + ", Número 2: " + num2 + ", Número 3: " + num3);

        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= num2; j++) {
                for (int k = 1; k <= num3; k++) {
                    System.out.println(i + "" + j + "" + k);
                }
            }
        }
    }
}
