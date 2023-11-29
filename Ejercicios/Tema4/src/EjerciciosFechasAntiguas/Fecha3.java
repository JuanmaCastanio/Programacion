package EjerciciosFechas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Fecha3 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        DateFormat fechaLarga = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);

        System.out.print("Introduce una cantidad de segundos: ");
        int segundos = dato.nextInt();
        Calendar hoy = Calendar.getInstance();
        hoy.add(Calendar.SECOND, segundos);
        System.out.println(fechaLarga.format(hoy.getTime()));


    }
}
