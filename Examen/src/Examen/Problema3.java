package Examen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d[d]'/'M[M]'/'yyyy");
        LocalDate fechaNacimiento;// Fecha de nacimiento introducida
        try {
        System.out.print("Fecha de nacimiento (dd/mm/aaaa): ");
        fechaNacimiento = LocalDate.parse(dato.nextLine(),formato);
        String dia = "", mes = "", anio = "";//Acumuladores de dia, mes y año en una cadena
        int sumaTotal = 0;//Acumulador del valor de cada cifra
        dia = dia.valueOf(fechaNacimiento.getDayOfMonth());
        mes = mes.valueOf(fechaNacimiento.getMonthValue());
        anio = anio.valueOf(fechaNacimiento.getYear());
        //Se acumula cada cifra en sumaTotal
        for (int i = 0; i < dia.length(); i++) {
            sumaTotal = sumaTotal + Integer.parseInt(dia.substring(i, i + 1));
        }
        for (int i = 0; i < mes.length(); i++) {
            sumaTotal = sumaTotal + Integer.parseInt(mes.substring(i, i + 1));
        }
        for (int i = 0; i < anio.length(); i++) {
            sumaTotal = sumaTotal + Integer.parseInt(anio.substring(i, i + 1));
        }

        String sumaTotalString = "";//Acumulador de sumaTotal en una cadena
        //Hasta que sumaTotal no sea de una unica cifra, se suma la primera cifra con la segunda
        do{
            sumaTotalString = sumaTotalString.valueOf(sumaTotal);
            int num1 = Integer.parseInt(sumaTotalString.substring(0, 1));
            int num2 = Integer.parseInt(sumaTotalString.substring(1));
            sumaTotal = num1 + num2;
        }while(sumaTotal > 10);

        System.out.println("Número de la suerte: " + sumaTotal);
        } catch (Exception e) {
            System.out.println("ERROR. Fecha incorrecta. Inténtalo de nuevo.");
            main(null);//Cada vez que se introduce mal la fecha, comienza de nuevo la ejecucion del main
        }
    }
}