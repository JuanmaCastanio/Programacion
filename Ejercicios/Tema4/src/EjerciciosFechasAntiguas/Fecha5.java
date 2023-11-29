package EjerciciosFechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Fecha5 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        SimpleDateFormat fechaCorta = new SimpleDateFormat("dd'/'MM'/'yyyy");
        Calendar fechaFactura = Calendar.getInstance();
        int dia = 0; //Variable para extraer dia
        int mes = 0; //Variable para extraer mes
        int año = 0; //Variable para extraer año
        
        try {
            System.out.print("Fecha de la factura (dd/mm/yyyy): ");
            String fechaFacturaString = dato.nextLine();

            //Extraccíon dia, mes, año
            dia = Integer.parseInt(fechaFacturaString.substring(0,fechaFacturaString.indexOf("/")));
            mes = Integer.parseInt(fechaFacturaString.substring(fechaFacturaString.indexOf("/") + 1,fechaFacturaString.lastIndexOf("/")));
            año = Integer.parseInt(fechaFacturaString.substring(fechaFacturaString.lastIndexOf("/") + 1,fechaFacturaString.length()));
            fechaFactura.set(año, mes - 1, dia);

            System.out.print("Termino de pago (7D/14D/3x30):");
            String terminoPago = dato.nextLine();

            switch (terminoPago) {
                case "7D":{
                    fechaFactura.add(Calendar.DAY_OF_MONTH, 7);
                    System.out.println(fechaCorta.format(fechaFactura.getTime()));
                }break;
                case "14D":{
                    fechaFactura.set(año, mes - 1, dia);
                    fechaFactura.add(Calendar.DAY_OF_MONTH, 14);
                    System.out.println(fechaCorta.format(fechaFactura.getTime()));
                }break;
                case "3x30":{
                    System.out.print("Introduzca el importe de la factura: ");
                    int importeFactura = dato.nextInt();
                    System.out.print("Porcentage 1º pago: ");
                    int primerPorcentage = dato.nextInt();
                    System.out.print("Porcentage 2º pago: ");
                    int segundoPorcentage = dato.nextInt();
                    System.out.print("Porcentage 3º pago: ");
                    int tercerPorcentage = dato.nextInt();
                    fechaFactura.add(Calendar.DAY_OF_MONTH, 30);
                    System.out.print("1º pago: " + fechaCorta.format(fechaFactura.getTime()) + " Importe : " + ((importeFactura * (primerPorcentage / (double) 100))) + " €");
                    fechaFactura.add(Calendar.DAY_OF_MONTH, 30);
                    System.out.print("2º pago: " + fechaCorta.format(fechaFactura.getTime()) + " Importe: " + ((importeFactura * (segundoPorcentage / (double) 100))) + " €");
                    fechaFactura.add(Calendar.DAY_OF_MONTH, 30);
                    System.out.print("3º pago: " + fechaCorta.format(fechaFactura.getTime()) + " Importe: " + ((importeFactura * (tercerPorcentage / (double) 100))) + " €");
                }break;        
                default:{
                    System.out.println("El termino introducido es incorrecto");
                }break;
            }
        } catch (Exception e) {
            System.out.println("Error. Fecha Incorrecta");
        }
    }
}