
package Calculadoras;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Juan José Blanco Díaz
 * @version 1.0
 * @since 07-12-23
 */
public class CalculadoraFechas {
    /**
     * diaSemana
     * traduce el día de la semana a español
     * @param diaSemana El día de la semana en inglés
     * @return El día de la semana en español 
     */
    public static String diaSemanaEspañol(DayOfWeek diaSemana){
       switch (diaSemana) {
            case MONDAY:
                return "lunes";
            case TUESDAY:
                return "martes";
            case WEDNESDAY:
                return "miércoles";
            case THURSDAY:
                return "jueves";
            case FRIDAY:
                return "viernes";
            case SATURDAY:
                return "sábado";
            case SUNDAY:
                return "domingo";
        }
        return "ERROR"; //Caso no contemplado
    }
    public static void main(String[] args) {
        try {
            Scanner dato = new Scanner(System.in);
            System.out.print("Elige una operación (DiaSemana/FechasSemana/FechaHora): ");
            String operacion = dato.nextLine().toLowerCase().trim(); //Almacena la operación elegida
            switch (operacion) {
                case "diasemana":{ //Mediante una fecha, sacar el dia de la semana correspondiente
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("d[d]'/'M[M]'/'yyyy");
                    DateTimeFormatter formatoSinBarras = DateTimeFormatter.ofPattern("ddMMyyyy");
                    System.out.print("Introduce una fecha (dd/mm/yyyy):");
                    String fechaString = dato.nextLine(); //Recoge la fecha introducida como string
                    if(fechaString.indexOf("/") == -1){
                        LocalDate fecha = LocalDate.parse(fechaString, formatoSinBarras);
                        System.out.println("El día de la semana es " + diaSemanaEspañol(fecha.getDayOfWeek()));
                    }
                    else{
                        LocalDate fecha = LocalDate.parse(fechaString, formato);
                        System.out.println("El día de la semana es " + diaSemanaEspañol(fecha.getDayOfWeek()));
                    }
                }
                    break;
                case "fechasemana":{ //Mediante nº de semana anual, sacar las fechas de la semana correspondiente
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");
                    System.out.print("Introduce un nº de semana: ");
                    int numeroSemana = dato.nextInt(); //Número de la semana anual
                    LocalDate fechaComienzo = LocalDate.of(2023, 1, 1); //Fecha donde comienza en el primer día
                    if(numeroSemana < 0 || numeroSemana > 53){
                        System.out.println("ERROR. El número de semana no es correcto.");
                        main(null);
                    }
                     else{
                        System.out.println("La semana " + numeroSemana + " dura entre: " + 
                        formato.format(fechaComienzo.plusDays(numeroSemana*7)) + " - " + formato.format(fechaComienzo.plusDays((numeroSemana + 1) *7)));
                    }   
                }
                    break;
                case "fechahora":{ //Mediante dos fecha con hora, sacar el nº de cada valor correspondiente
                    LocalDateTime fecha1 = LocalDateTime.now();
                    LocalDateTime fecha2 = LocalDateTime.now();
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("d[d]'/'M[M]'/'yyyy H[H]':'m[m]':'s[s]");
                    DateTimeFormatter formatoSinBarras = DateTimeFormatter.ofPattern("d[d]M[M]yyyy H[H]m[m]s[s]");
                    System.out.print("Introduce una fecha y una hora (dd/mm/yyyy hh:mm:ss): ");
                    String fechaString1 = dato.nextLine(); //Recoge la fecha introducida como string
                    if(fechaString1.indexOf("/") == -1){
                        fecha1 = LocalDateTime.parse(fechaString1, formatoSinBarras);
                    }
                    else{
                        LocalDate fecha = LocalDate.parse(fechaString1, formato);
                        System.out.println("El día de la semana es " + diaSemanaEspañol(fecha.getDayOfWeek()));
                    }
                    System.out.print("Introduce otra fecha y una hora (dd/mm/yyyy hh:mm:ss): ");
                    String fechaString2 = dato.nextLine(); //Recoge la fecha2 introducida como string
                    if(fechaString2.indexOf("/") == -1){
                        fecha1 = LocalDateTime.parse(fechaString2, formatoSinBarras);
                    }
                    else{
                        fecha2 = LocalDateTime.parse(fechaString2, formato);
                        System.out.println("El día de la semana es " + diaSemanaEspañol(fecha2.getDayOfWeek()));
                    }
                    if(fecha1.isAfter(fecha2)){ //Si la segunda fecha es menor que la tercera, salta un error
                        System.out.println("ERROR. La fecha 2 es anterior a la fecha 1.");
                        main(null);
                        System.out.println();
                    }
                    else{
                        long diferenciaAnio = ChronoUnit.YEARS.between(fecha1, fecha2); //Años de diferencia
                        long diferenciaMes = ChronoUnit.MONTHS.between(fecha1, fecha2); //Meses de diferencia
                        long diferenciaSemana = ChronoUnit.WEEKS.between(fecha1, fecha2); //Semanas de diferencia
                        long diferenciaDia = ChronoUnit.DAYS.between(fecha1, fecha2); //Dias de diferencia
                        Duration diferenciaHoras = Duration.between(fecha1, fecha2); //Horas, minutos y segundos de diferencia
                        System.out.println("Hay " + diferenciaAnio + " año/s, " + diferenciaMes + " mes/es, " + diferenciaSemana + " semana/s, " + diferenciaDia + " día/s, " + diferenciaHoras.toHours() + " hora/s, " + diferenciaHoras.toMinutes() + " minuto/s, " + diferenciaHoras.toSeconds() + " segundo/s");
                    }
                }
                    break;
                default: //Si no se contempla la operación, lo tratamos como una excepción
                    System.out.println("ERROR. Operación incorrecta.");
                    main(null);
            }
        } catch (Exception e) { //Si salta una excepción, mostramos mensaje de error y volvemos a comenzar el programa
            System.out.println("ERROR. Fecha incorrecta.\n");
            main(null); 
        }
    }
}
