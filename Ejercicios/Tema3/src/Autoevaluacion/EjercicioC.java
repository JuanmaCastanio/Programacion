package Autoevaluacion;
/*
 * Hacer un programa que muestre las combinaciones de 3 números menores de 25 que cumplan el Teorema de Pitágoras.
 * En matemáticas, se llama terna pitagórica a cualquier conjunto de tres números naturales (a, b, c)
 * para los cuales se cumple la relación a² + b² = c². Los primeros ejemplos son (3, 4, 5), (5, 12, 13), (6, 8, 10), (7, 24, 25), …
 */


public class EjercicioC {
    public static void main(String[] args) {
        int maximo = 25;
        String ternas = "";
        for (int i = 1; i <= maximo; i++) {
            for (int j = 1; j <= maximo; j++) {
                for (int k = 1; k <= maximo; k++) {
                    if((int) Math.pow(i, 2) + (int) Math.pow(j, 2) == (int) Math.pow(k, 2))
                        ternas = ternas + "(" + i + ", " + j + ", " + k + ") ";
                }
            }
        }
        System.out.println("Las ternas pitagóricas de números menores de " + maximo + " son : " + ternas);
    }
}