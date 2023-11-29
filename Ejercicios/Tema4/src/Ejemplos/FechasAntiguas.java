package Ejemplos;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FechasAntiguas {
    public static void main(String[] args) {

        //Ejemplos de creación de objetos Date
        Date fecha1 = new Date();
        System.out.println(fecha1);

        Date fecha2 = new Date(999999999);
        System.out.println(fecha2);

        //Creación de objeto Calendar
        Calendar fecha3 = Calendar.getInstance();
        System.out.println(fecha3);


        //Creación de objeto GregorianCalendar
        GregorianCalendar nocheBuena = new GregorianCalendar(2055,11,2);
        System.out.println(nocheBuena);


        //Trabajo partes de una fecha
        System.out.println("Año: " + nocheBuena.get(Calendar.YEAR));
        System.out.println("Semana del año: " + fecha3.get(Calendar.WEEK_OF_YEAR));
        fecha3.set(Calendar.DAY_OF_MONTH,30);
        System.out.println("Último día del mes: " + fecha3);
        System.out.println(fecha3.getTime());
        System.out.println("Número de milisegundos desde 1/1/1970 hasta la NocheBuena de este año: " + nocheBuena.getTimeInMillis());

        //Aplicamos formatos a las fechas

        //-> DateFormat
        //-> SimpleDateFormat

        DateFormat df1 = DateFormat.getDateInstance();
        System.out.println(df1.format(fecha1));

        DateFormat df2 = DateFormat.getTimeInstance();
        System.out.println(df2.format(fecha1));

        DateFormat df3 = DateFormat.getDateTimeInstance();
        System.out.println(df3.format(fecha1));

        DateFormat df4 = DateFormat.getInstance();
        System.out.println(df4.format(fecha1));

        DateFormat df5 = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df5.format(fecha1));

        //format: Date -> String con el formato elegido
        //parse: String -> Date equivalente con el formato establecido por el String

        try {
            df5.setLenient(false);
            Date date5 = df5.parse("29/02/24");
            System.out.println(date5);
        } catch (Exception e) {
            System.out.println("Error.Fecha incorrecta");
        }
    }
}
