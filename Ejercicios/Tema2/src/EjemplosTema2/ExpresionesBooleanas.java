package EjemplosTema2;

// Ejemplo de creación de expresiones booleanas con operadores relacionales
import java.util.Scanner;
public class ExpresionesBooleanas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        
        boolean resultado = (edad > 17);
    
        System.out.println("Eres mayor de edad??? " + resultado);
        
        boolean edad18 = edad == 18;
        System.out.println("Mayor de edad? " + edad18);

        //Probamos operadores lógicos && || !
        
        boolean e1 = true && true; //true
        boolean e2 = false || true; //true
        boolean e3 = !false; //false
        e3 = !e3;

        System.out.println("Ejemplo 1: " + e1);
        System.out.println("Ejemplo 2: " + e2);
        System.out.println("Ejemplo 3: " + e3);



        sc.close();
    }
}
