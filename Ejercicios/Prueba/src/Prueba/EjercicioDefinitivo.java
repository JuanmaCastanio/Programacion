package Autoevaluacion;
/*Realiza un programa java que simule una carrera de 2 caballos, considerando que ambos tienen la misma probabilidad de ganar.
 * 
 * Cada vez que avanza un caballo lo hace en una unidad. Ambos parten desde el valor 0 y la meta se encuentra en el valor resultante de sumar los valores ASCII del nombre que el usuario introduzca desde el teclado.
 * 
 * El caballo que primero llegue a la meta ganará.
 * 
 * Visualmente el avance de cada caballo se hará imprimiendo por consola, el valor 1 para el primer caballo y el 2 para el segundo.
 * 
 * Puedes utilizar la instrucción Thread.sleep(500) para introducir un retardo de medio segundo en cada avance.
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class EjercicioDefinitivo {
    public static void main(String[] args) throws InterruptedException {
        Scanner dato = new Scanner(System.in);
        Random generador = new Random();
        boolean continuar = true;
        int distanciaMeta = 0;
        String caballo1 = "";
        String caballo2 = "";

        System.out.println("Introducir una palabra: ");
        String nombre = dato.next();
        for (int i = 0; i <= nombre.length() - 1; i++) {
            distanciaMeta += (int) nombre.charAt(i);
        }
        do{
          Thread.sleep(100);
          boolean avance = generador.nextBoolean(); 
          if(avance){
               caballo1 = caballo1 + 1;   
          }
          System.out.println(caballo1);
          if(caballo1.length() == distanciaMeta)
               continuar = false;
          avance = generador.nextBoolean();
          if(avance){
               caballo2 = caballo2 + 2;
          }
          System.out.println(caballo2);
          if(caballo1.length() == distanciaMeta){
            System.out.println("Ha ganado: Caballo 1"); 
            continuar = false;   
          }
          else if(caballo2.length() == distanciaMeta){
              System.out.println("Ha ganado: Caballo 2");
            continuar = false;
          }
        }while (continuar);
    }
}
