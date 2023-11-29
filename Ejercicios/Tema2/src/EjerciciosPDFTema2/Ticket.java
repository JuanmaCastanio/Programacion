package EjerciciosPDFTema2;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Escribe importe del ticket: ");
        double ticket = dato.nextDouble();
        System.out.print("Escribe el IVA a aplicar: ");
        double iva = dato.nextDouble();

        System.out.println("Ticket sin IVA: " + ticket * (1-(iva/100)) + "\nIVA del ticket: " + (ticket * (iva/100)));

    }
}
