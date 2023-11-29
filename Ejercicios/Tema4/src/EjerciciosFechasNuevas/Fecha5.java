package EjerciciosFechasNuevas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fecha5 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");
        try {
            
            System.out.print("Fecha de la factura (dd/mm/yyyy): ");
            LocalDate fechaFactura = LocalDate.parse(dato.nextLine());

        } catch (Exception e) {
            
        }
    }
}
