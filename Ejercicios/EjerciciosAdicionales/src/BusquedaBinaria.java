/**
 * @author Juan José Blanco
 * @version 1.0
 * @since 13-11-2023
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BusquedaBinaria {
    /**
     * Búsqueda Binaria: Búsqueda rapida de un número en conjuntos ordenados
     * 
     * @param numeros Conjunto de números donde queremos hacer la búsqueda
     * @param numeroBusqueda Número a encontrar dentro del conjunto
     * @return Número si se encuentre, si no, se devuleve -1 (no se encuentra en el conjunto)
     */
    public static int busquedaBinaria(int [] numeros, int numeroBusqueda){
        int tamaño = numeros.length; //Tamaño del conjunto
        int mitad = tamaño / 2; //Mitad del tamaño

        System.out.println("Tamaño: " + tamaño);
        System.out.println("Mitad: " + mitad);
        System.out.println("Array: " + Arrays.toString(numeros));
        System.out.println("----------------------------------------------------");

        if(numeros[mitad] == numeroBusqueda) //Si es el número buscado, devuelve el número
            return numeros[mitad];
        else if(tamaño == 1) //Si el número no se encuentra en el conjunto, devuelve -1
            return -1;
        else if(numeros[mitad] > numeroBusqueda) //Si el número está pero es menor que el número de la mitad, cojemos del conjunto solo los valores menores a la mitad y repetimos la búsqueda
            return busquedaBinaria(Arrays.copyOfRange(numeros, 0, mitad), numeroBusqueda);
        else //Si el número está pero es mayor que el número de la mitad, cojemos del conjunto solo los valores mayores a la mitad y repetimos la búsqueda
            return busquedaBinaria(Arrays.copyOfRange(numeros, mitad+1, tamaño), numeroBusqueda);
    }
    /**
     * Ordenar Conjunto: Ordenación de un conjunto de menor a mayor 
     * @param numeros Conjunto que se quiere ordenar
     * @return El conjunto ya ordenado
     */
    public static int [] ordenarConjunto(int [] numeros){
        int aux = 0; //Variable auxiliar para guardar el valor de un número
        int cont = 0; //Variable para controlar el bucle de verificación

        do {
            cont = 0; //Se inicializa la variable al comenzar una nuceva iteración
            //Recorrer el conjunto para ir ordenandolo
            for (int i = 1; i < numeros.length; i++) {
                //Si el primer número es mayor al segundo, se intercambian las posiciones
                if(numeros[i - 1] > numeros[i]){
                    aux = numeros[i - 1];
                    numeros[i - 1] = numeros[i];
                    numeros[i] = aux;
                    cont++; //Se incrementa si se tiene que intercambiar el número
                }
            } 
        //Si no ordena ningún número (cont = 0), el conjunto está ordenado
        } while (cont != 0);
        return numeros; //Devuelve el conjunto ordenado
    }
    /**
     * Esta Numero: Nos indica si un número está en el conjunto
     * @param num número que queremos ver si esta en el conjunto
     * @param array conjunto lleno de datos
     * @param pos posición que nos encontramos en la iteración
     * @return un boolean si está o no está
     */
    public static boolean estaNumero(int num, int [] array, int pos){
        int i = 0;

        while ((i < pos) && num != array[i]) {
            i++;
        }

        return i < pos;
    }
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Random generador = new Random();
        int [] numeros = new int[50];
        int pos = 0;
        System.out.println("Introduce un número: ");
        int numeroBusqueda = dato.nextInt();
        //Generación aleatoria del conjunto
        while(pos < numeros.length){
            int numAleatorio = generador.nextInt(100);
            if(!estaNumero(numAleatorio, numeros, pos)){
                numeros[pos] = numAleatorio;
                pos++;
            }
        }
        System.out.println("El número es: " + busquedaBinaria(ordenarConjunto(numeros), numeroBusqueda));
        dato.close();
    }
}
