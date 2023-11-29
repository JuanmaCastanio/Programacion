package EjerciciosBucles;

public class Variaciones {
    public static void main(String[] args) {
        int combinaciones = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int j2 = 1; j2 <= 4; j2++) {
                    for (int k = 1; k <= 4; k++) {
                        System.out.println(i + " " + j + " " + j2 + " " + k);
                        combinaciones++;
                    }
                }
            }
        }
        System.out.printf("Numero de combinaciones: %d", combinaciones);
    }
}
