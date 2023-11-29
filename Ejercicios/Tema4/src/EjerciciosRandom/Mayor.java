package EjerciciosRandom;

import java.util.Random;

public class Mayor {
    public static void main(String[] args) {
        Random generador = new Random();
        int cantidad = 20;
        int numMayor = 0;

        for (int i = 0; i < cantidad; i++) {
            int numAleatorio = generador.nextInt(1, 1001);
            System.out.print(numAleatorio + " ");
            if(numAleatorio > numMayor)
                numMayor = numAleatorio;
        }
        System.out.println("\nEl número más grande es '" + numMayor + "'");
    }
}
