package EjerciciosFechas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Fecha4 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        DateFormat fechaLarga = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat fechaCorta = DateFormat.getDateInstance(DateFormat.SHORT);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd'/'MM'/'yyyy");

        fechaLarga.setLenient(false);

        System.out.print("Introduce una fecha (dd de 'mes' de yyyy): ");
        String fechaString = dato.nextLine();
        try {
            Date fecha = fechaLarga.parse(fechaString);
            System.out.println(fechaCorta.format(fecha));
            System.out.println(sdf.format(fecha));
        } catch (ParseException e) {
            System.out.println("Error. Fecha Incorrecta");
        }
    }
}
