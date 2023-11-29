package Ejemplos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FechasNuevas {
    public static void main(String[] args) {
        //Creamos la fecha de hoy
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);

        LocalDateTime hoyAhora = LocalDateTime.now();
        System.out.println(hoyAhora);

        //Crear fecha concreta
        LocalDate nocheBuena = LocalDate.of(2024, Month.DECEMBER, 24);
        System.out.println(nocheBuena);

        //Crear un local date a partit de un date
        LocalDate fecha = LocalDate.ofEpochDay(new Date().getTime()/1000/60/60/24);
        System.out.println(fecha);

        System.out.println(nocheBuena.isAfter(hoy));
        System.out.println(nocheBuena.isBefore(hoy));
        
        System.out.println(hoy.plusDays(7));
        System.out.println(hoy);

        //Uso de Period
        System.out.println(Period.between(hoy,nocheBuena));

        //Uso de Duration
        System.out.println(Duration.between(LocalTime.now(),LocalTime.now().plusMinutes(30)).getSeconds());

        //Formateo: ISO
        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE;
        System.out.println(dtf1.format(nocheBuena));

        //Formateo: Estilos
        DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dtf2.format(nocheBuena));

        //Formateo: Plantillas
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("'Dia: ' EEEE',' dd 'de' MMMM 'de' yyyy");
        System.out.println(dtf3.format(nocheBuena));
    }
}
