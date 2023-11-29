
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

public class CarreraCaballos {
  public static void main(String[] args) throws InterruptedException {
    Scanner dato = new Scanner(System.in);
    Random generador = new Random();
    boolean continuar = true;
    String caballo1 = "";
    String caballo2 = "";
    String caballo3 = "";
    String caballo4 = "";
    int distanciaMeta = 0;
    int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;

    System.out.println("CARRERA DE CABALLOS\nBY JUAN JOSÉ BLANCO\n");
    System.out.print("Introduce el nombre del caballo 1: ");
    String nombre1 = dato.nextLine();
    char letra1 = (char) nombre1.charAt(0);
    System.out.print("Introduce el nombre del caballo 2: ");
    String nombre2 = dato.nextLine();
    char letra2 = (char) nombre2.charAt(0);
    System.out.print("Introduce el nombre del caballo 3: ");
    String nombre3 = dato.nextLine();
    char letra3 = (char) nombre3.charAt(0);
    System.out.print("Introduce el nombre del caballo 4: ");
    String nombre4 = dato.nextLine();
    char letra4 = (char) nombre4.charAt(0);
    caballo1 = caballo1 + letra1;
    caballo2 = caballo2 + letra2;
    caballo3 = caballo3 + letra3;
    caballo4 = caballo4 + letra4;
    System.out.print("Introducir una palabra: ");
    String nombre = dato.next();
    for (int i = 0; i <= nombre.length() - 1; i++) {
      distanciaMeta += (int) nombre.charAt(i);
    }
    for (int i = 1; i < distanciaMeta; i++) {
      caballo1 = caballo1 + "-";
      caballo2 = caballo2 + "-";
      caballo3 = caballo3 + "-";
      caballo4 = caballo4 + "-";
    }
    System.out.println(caballo1);
    System.out.println(caballo2);
    System.out.println(caballo3);
    System.out.println(caballo4);
    System.out.println();
    do {
      Thread.sleep(150);
      boolean avance = generador.nextBoolean();
      if (avance) {
        cont1++;
        caballo1 = "";
        for (int i = 0; i < cont1; i++) {
          caballo1 = caballo1 + "-";
        }
        caballo1 = caballo1 + letra1;
        for (int i = 1; i < distanciaMeta - caballo1.indexOf(letra1); i++) {
          caballo1 = caballo1 + "-";
        }
      }
      System.out.println(caballo1);
      avance = generador.nextBoolean();
      if (avance) {
        cont2++;
        caballo2 = "";
        for (int i = 0; i < cont2; i++) {
          caballo2 = caballo2 + "-";
        }
        caballo2 = caballo2 + letra2;
        for (int i = 1; i < distanciaMeta - caballo2.indexOf(letra2); i++) {
          caballo2 = caballo2 + "-";
        }
      }
      System.out.println(caballo2);
      avance = generador.nextBoolean();
      if (avance) {
        cont3++;
        caballo3 = "";
        for (int i = 0; i < cont3; i++) {
          caballo3 = caballo3 + "-";
        }
        caballo3 = caballo3 + letra3;
        for (int i = 1; i < distanciaMeta - caballo3.indexOf(letra3); i++) {
          caballo3 = caballo3 + "-";
        }
      }
      System.out.println(caballo3);
      avance = generador.nextBoolean();
      if (avance) {
        cont4++;
        caballo4 = "";
        for (int i = 0; i < cont4; i++) {
          caballo4 = caballo4 + "-";
        }
        caballo4 = caballo4 + letra4;
        for (int i = 1; i < distanciaMeta - caballo4.indexOf(letra4); i++) {
          caballo4 = caballo4 + "-";
        }
      }
      System.out.println(caballo4);
      System.out.println();
      if (caballo1.indexOf(letra1) == distanciaMeta - 1) {
        System.out.println("Ha ganado: " + nombre1);
        continuar = false;
      }
      if (caballo2.indexOf(letra2) == distanciaMeta - 1) {
        System.out.println("Ha ganado: " + nombre2);
        continuar = false;
      }
      if (caballo3.indexOf(letra3) == distanciaMeta - 1) {
        System.out.println("Ha ganado: " + nombre3);
        continuar = false;
      }
      if (caballo4.indexOf(letra4) == distanciaMeta - 1) {
        System.out.println("Ha ganado: " + nombre4);
        continuar = false;
      }
    } while (continuar);
  }
}
