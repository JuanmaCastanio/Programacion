package EjerciciosPDFTema2;

import java.util.Scanner;

public class PorcentajeNotas {
    public static void main(String[] args) {
        Scanner dato =new Scanner(System.in);

        System.out.print("Escribe número de sobresalientes: ");
        int sobresalientes = dato.nextInt();
        System.out.print("Escribe número de notables: ");
        int notables = dato.nextInt();
        System.out.print("Escribe número de aprobados: ");
        int aprobados = dato.nextInt();
        System.out.print("Escribe número de suspensos: ");
        int suspensos = dato.nextInt();
        System.out.print("Escribe número de no presentados: ");
        int noPresentados = dato.nextInt();

        int total = sobresalientes + notables + aprobados + suspensos + noPresentados;
        System.out.println("SB = " + sobresalientes + "" + (sobresalientes/ (double)total) * 100);
        System.out.println("N = " + notables + "" + (notables/ (double)total) * 100);
        System.out.println("A = " + aprobados + "" + (aprobados/ (double)total) * 100);
        System.out.println("S = " + suspensos + "" + (suspensos/ (double)total) * 100);
        System.out.println("NP = " + noPresentados + "" + (noPresentados/ (double)total) * 100);
        System.out.println("Total = "+ total + "" + (total/ (double)total) * 100);
        System.out.println("Total presentados = " + ((total - noPresentados)/ (double) total) *100);
        System.out.println("Total aprobados = " + ((total - noPresentados - suspensos)/ (double) (total - noPresentados)) *100);
        System.out.println("Total suspensos = " + (suspensos / (double) (total - noPresentados)) *100);
        System.out.println("Total no presentados = " + (noPresentados / (double) total) *100);



    }
}
