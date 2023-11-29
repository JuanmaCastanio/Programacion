package EjerciciosBucles;
//ENUNCIADO
/*
 * Programa que pinte un romboide de base y altura aleatorios entre 1 y 10.
 * El romboide puede ser opuesto o no. Inicialmente se solicitará
 * Inicialmente se solicitará por teclado el caracter de relleno, a través de su ASCII.
 * Este debe ser un caracter imprimible.
 * Y si se quiere pintar el romboide opuesto o normal.
 * En caso de que el tipo no sea válido o el caracter de relleno se solicitará nuevamente el dato al usuario, hasta un máximo de 3 veces.
 * Superado este límte el programa finalizará.
 * 
 * Base: 5, Altura: 3
 * Relleno: 97
 * Tipo (N/O): U
 * No te entiendo
 * Tipo (N/O): X
 * No te entiendo
 * Tipo (N/O); X (de máximo tres intentos)
 * 
 * Base: 5, Altura: 3
 * Relleno: 13
 * Caracter no imprimible.
 * 
 * Tipo (N/O): N
 *   aaaaa
 *  aaaaa
 * aaaaa
 * 
 * Tipo (N/O): O
 * aaaaa
 *  aaaaa
 *   aaaaa
 */

import java.util.Random;
import java.util.Scanner;

public class Romboide {
    public static void main(String[] args) {
        Random generador = new Random();
        Scanner dato = new Scanner(System.in);
        char relleno = ' ', respuesta = ' ';//Declaración del caracter de relleno y el caracter para la respuesta del tipo
        int cont = 0;//Contador que marcará los pasos por los bucles de validación
        boolean continuar = true;//Bandera que actúa en por si se incumple una petición, salte al final

        int base = generador.nextInt(2,11);//Generación aleatoria base
        int altura = generador.nextInt(2,11);//Generación aleatoria altura
        System.out.println("Base: " + base +", Altura: " + altura);
        //Primer bucle do while que valida el caracter de relleno
        do {
            System.out.print("Introduzca un caracter para el relleno: ");
            relleno = (char) dato.nextInt();
            //Si relleno no cumple con los caracteres ASCII entre esos valores, no válido
            if (((int)relleno <= 33 || (int)relleno >= 254) && cont == 2) {
                System.out.println("Eres un inútil, me largo");
                cont++;//Aumento contador hasta 3
            }
            else if ((int)relleno <= 33 || (int)relleno >= 254) {
                System.out.println("Error. Caracter no válido");
                cont++;//Aumento contador hasta 3
            }
            //Si iteracion = 3, cambiamos la bandera para finalizar el programa
            if(cont == 3)
                continuar = false;
        //Se repetirá el bucle solamente 3 veces mientras no se contemplen los valores ASCII deseados
        } while(((int)relleno <= 33 || (int)relleno >= 254) && cont != 3);
        //Si continuar = true, seguimos con la siguiente validación
        if(continuar){
            cont = 0;//Reutilizamos el mismo contador
            do {
                continuar = true;//Reutilizamos la misma bandera
                System.out.print("Introduzca el tipo de romboide (N/O): ");
                respuesta = dato.next().toUpperCase().charAt(0);
                //Si se introduce un valor diferente a 'N' o 'S' minúscula como mayúscula, no válido
                if (respuesta != 'N' && respuesta != 'O' && cont == 2) {
                    System.out.println("Eres un inútil, me largo");
                    cont++;//Aumento contador hasta 3
                }
                else if(respuesta != 'N' && respuesta != 'O'){
                    System.out.println("Error. No se ha elegido un tipo establecido");
                    cont++;//Aumento contador hasta 3
                }
                //Si iteracion = 3, cambiamos la bandera para finalizar el programa
                if(cont ==3)
                    continuar = false;
            //Se repetirá un máximo de 3 veces mientras el caracter sea diferente a 'N' o 'S' minúscula como mayúscula
            } while (respuesta != 'N' && respuesta != 'O' && cont != 3);
            //Si continuar = true, mostramos el romboide
            if(continuar){
                //'N' = Romboide normal
                if(respuesta == 'N'){
                    //Recorre la altura
                    for (int i = 1; i <= altura; i++) {
                        //Escribe los espacios de separación
                        for (int j = 0; j < altura - i; j++) {
                            System.out.print(" ");
                        }
                        //Escribe la base
                        for (int k = 1; k <= base; k++) {
                            System.out.print(relleno);
                        }
                        System.out.println();//Separación entre altura y altura
                    }
                }
                //'O' = Romboide invertido
                else if(respuesta == 'O'){
                    //Recorre la altura
                    for (int i = altura; i >= 0; i--) {
                        //Escribe los espacios de separación
                        for (int j = 0; j < altura - i; j++) {
                            System.out.print(" ");
                        }
                        //Escribe la base
                        for (int k = 1; k <= base; k++) {
                            System.out.print(relleno);
                        }
                        System.out.println();//Separación entre altura y altura
                    }
                }
            }
        }
    }
}