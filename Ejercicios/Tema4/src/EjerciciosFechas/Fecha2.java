package EjerciciosFechas;

import java.util.Date;
import java.text.DateFormat;
import java.util.Scanner;

public class Fecha2 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        df.setLenient(false);
        System.out.println("Introduce una fecha inicial (dd/mm/yyyy): ");
        String fechaInit = dato.nextLine();
        try {
            Date fechaInicial = df.parse(fechaInit);
            Date hoy = new Date();
            if(fechaInicial.before(hoy)){
                System.out.println("La fecha inicial debe ser anterior a la actual");
            }
            else{
                long milisegundos =  fechaInicial.getTime() - hoy.getTime();
                long dias = milisegundos/1000/3600/24;
                System.out.println("Quedan " + dias + " días");

            }
        } catch (Exception e) {
            System.out.println("Error.Fecha errónea");
        }
    }
}
