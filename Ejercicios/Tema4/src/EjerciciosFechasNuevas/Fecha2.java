package EjerciciosFechasNuevas;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha2 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");

        System.out.print("Introduce una fecha: ");
        LocalDate fecha = LocalDate.parse(dato.nextLine(), formato);
        if(fecha.isAfter(LocalDate.now())){
            System.out.println(fecha.toEpochDay() - LocalDate.now().toEpochDay());
        }

    }
}