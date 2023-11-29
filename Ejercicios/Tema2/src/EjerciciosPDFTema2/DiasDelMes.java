package EjerciciosPDFTema2;

import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Escribe el nº de un mes: ");
        int numeroMes = dato.nextInt();
        int resultado = ((numeroMes == 1 || numeroMes == 3 || numeroMes == 5 || numeroMes == 7 || numeroMes == 8 || numeroMes == 10 || numeroMes == 12) ? 31 
                                                : (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11) ? 30
                                                : (numeroMes == 2)? 28 : -1);
        String validacion = (resultado == -1) ? "Error, mes fuera del rango 1 -12" : "" + "Este mes tiene " + resultado + " días";
        System.out.println(validacion);
    }
}