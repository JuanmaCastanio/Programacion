package EjerciciosFechas;

import java.text.DateFormat;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class Fecha1 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        DateFormat largo = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat corto = DateFormat.getDateInstance(DateFormat.SHORT);
        largo.setLenient(false);
        corto.setLenient(false);

        System.out.print("Introduce el día de tu fecha de nacimiento: ");
        int diaNacimiento = dato.nextInt();
        System.out.print("Introduce el mes de tu fecha de nacimiento: ");
        int mesNacimiento = dato.nextInt();
        System.out.print("Introduce el año de tu fecha de nacimiento: ");
        int añoNacimiento = dato.nextInt();
        
        GregorianCalendar fechaNacimiento = new GregorianCalendar(añoNacimiento,mesNacimiento - 1,diaNacimiento);
        System.out.println("Fecha larga: " + largo.format(fechaNacimiento.getTime()));
        System.out.println("Fecha corto: " + corto.format(fechaNacimiento.getTime()));
    }
}