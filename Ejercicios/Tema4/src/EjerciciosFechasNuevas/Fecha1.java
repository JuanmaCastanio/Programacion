package EjerciciosFechasNuevas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Fecha1 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        DateTimeFormatter corta = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter larga = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        
        System.out.print("Introduce el dia: ");
        int dia = dato.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = dato.nextInt();
        System.out.print("Introduce el año: ");
        int año = dato.nextInt();


        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
        System.out.println(corta.format(fechaNacimiento));
        System.out.println(larga.format(fechaNacimiento));
    }
}
