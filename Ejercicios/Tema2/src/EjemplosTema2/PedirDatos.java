package EjemplosTema2;

import java.util.Scanner;
//Ejemplo de petición de datos de distinto tipo al usuario para meterlos a través de teclado

public class PedirDatos {
    public static void main(String[] args) {
        /**
        Creamos el objeto Scanner para acceder al teclado
        Se crea 1 sola vez
        Usos = infinitos
         */

        Scanner sc = new Scanner(System.in); 

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce los apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        String edad = sc.nextLine();

        System.out.println("Has introducido el nombre " + nombre + " y  has introducido los apellidos " + apellidos);
        System.out.println("Tienes " + edad + " años");
        
        

    }
}