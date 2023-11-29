package EjerciciosFechasNuevas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Fecha5 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");
        try {
            
            System.out.print("Fecha de la factura (dd/mm/yyyy): ");
            LocalDate fechaFactura = LocalDate.parse(dato.nextLine(),formato);

            System.out.print("Termino de pago (7D/14D/3x30):");
            String terminoPago = dato.nextLine().trim().toUpperCase();
            switch (terminoPago) {
                case "7D":{
                    System.out.println("Fecha de vencimiento: " + formato.format(fechaFactura.plusDays(7)));
                }break;
                case "14D":{
                     System.out.println("Fecha de vencimiento: " + formato.format(fechaFactura.plusDays(14)));
                }break;
                case "3X30":{
                    System.out.print("Introduzca el importe de la factura: ");
                    int importeFactura = dato.nextInt();
                    System.out.print("Porcentage 1º pago: ");
                    int primerPorcentage = dato.nextInt();
                    System.out.print("Porcentage 2º pago: ");
                    int segundoPorcentage = dato.nextInt();
                    System.out.print("Porcentage 3º pago: ");
                    int tercerPorcentage = dato.nextInt();
                    if((primerPorcentage + segundoPorcentage + tercerPorcentage) == 100){
                        System.out.println("1º pago: " + formato.format(fechaFactura.plusDays(30)) + " Importe : " + ((importeFactura * (primerPorcentage / (double) 100))) + " €");
                        System.out.println("2º pago: " + formato.format(fechaFactura.plusDays(60)) + " Importe: " + ((importeFactura * (segundoPorcentage / (double) 100))) + " €");
                        System.out.println("3º pago: " + formato.format(fechaFactura.plusDays(90)) + " Importe: " + ((importeFactura * (tercerPorcentage / (double) 100))) + " €");
                    }
                    else{
                        System.out.println("Error. La suma de porcentages no es 100%");
                    }

                }break;        
                default:{
                    System.out.println("El termino introducido es incorrecto");
                }break;
            }
        } catch (Exception e) {
            System.out.println("Error. Dato introducido no válido.");
        }
    }
}

