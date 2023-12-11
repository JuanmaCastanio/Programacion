package Calculadoras;

import java.util.Scanner;

/**
 * La clase CalculadoraBinaria realiza operaciones lógicas (AND, OR y XOR) cuyos
 * operandos son dos cadenas binarias de longitud 8.
 *
 * @author Juan José Blanco Díaz
 * @version 1.0
 * @since 24-11-2023
 */
public class CalculadoraBinaria {

    /**
     * seleccionarOperacion realiza la operación lógica seleccionada por el
     * usuario y muestra el resultado en decimal y en binario.
     *
     * @param operacion La operación elegida.
     * @param operando1 Primer operador.
     * @param operando2 Segundo operador.
     */
    public static void seleccionarOperacion(String operacion, int operando1, int operando2) {
        //Realiza la operación elegida
        switch (operacion) {
            case "AND": {
                int resultado = operando1 & operando2;
                System.out.println("Resultado en decimal: " + resultado);
                System.out.println("Resultado en binario: " + convertirBinario(resultado));
            }
            break;
            case "OR": {
                int resultado = operando1 | operando2;
                System.out.println("Resultado en decimal: " + resultado);
                System.out.println("Resultado en binario: " + convertirBinario(resultado));
            }
            break;
            case "XOR": {
                int resultado = operando1 ^ operando2;
                System.out.println("Resultado en decimal: " + resultado);
                System.out.println("Resultado en binario: " + convertirBinario(resultado));
            }
            break;

            default: {
                System.out.println("Error. Elección no contemplada");
            }
            break;
        }
    }

    /**
     * enteroDecimal convierte el resultado decimal en una cadena binaria.
     *
     * @param enteroDecimal Resultado en número entero.
     * @return Cadena binaria del resultado.
     */
    public static String convertirBinario(int enteroDecimal) {
        String resultadoBinario = ""; //Variable donde almcenamos la cadena binaria
        boolean continuar = true; //Bandera para la salida del bucle
        int cont = 0; //Contador para almacenar las veces que se divide el número entero
        do {
            //Si el enteroDecimal es 0,terminamos el bucle y añadimos ceros 
            if (enteroDecimal == 0) {
                //Bucle que introduce tantos hasta llegar a formar una cadena binaria de 8 bits
                for (int i = 0; i < 8 - cont; i++) {
                    resultadoBinario = 0 + resultadoBinario;
                }
                continuar = false;
            } //Si el número es par, añadimos un 0
            else if (enteroDecimal % 2 == 0) {
                resultadoBinario = 0 + resultadoBinario;
                cont++;
            } //Si el número es impar, añadimos un 1
            else if (enteroDecimal % 2 != 0) {
                resultadoBinario = 1 + resultadoBinario;
                cont++;
            }

            enteroDecimal = enteroDecimal / 2; //Dividimos el número para ir sacando las cifras binarias
        } while (continuar);
        return resultadoBinario;
    }

    /**
     * verificarBinario revisa si la cadena introducida es un binario antes de
     * operar con él.
     *
     * @param binario Cadena binaria.
     * @return True si es binario y False si no es binario.
     */
    public static boolean verificarBinario(String binario) {
        boolean valido = false; //Resultado inicializado en false
        //Si cumple la longitud, devuelve valido
        if (binario.length() == 8) {
            //Bucle para validar cada cifra binaria
            for (int i = 0; i < binario.length(); i++) {
                //Si todas sus cifras son 1 o 0, valido pasa a tener valor true
                if (binario.charAt(i) == '1' || binario.charAt(i) == '0') {
                    valido = true;
                } else { //Si tiene alguna cifra diferente a 1 o 0, directamente devuelve valido con valor false
                    return valido = false;
                }
            }
        }
        return valido;
    }

    /**
     * main inicia la ejecucuión.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int operando1 = 0; //Primer operador
        int operando2 = 0; //Segundo operador

        System.out.print("Introduce el primer binario de 8 bits: ");
        String byte1 = dato.nextLine(); //Recoge la primera cadena binaria
        //Verificación para ver si la primera cadena binaria es correcta
        if (verificarBinario(byte1)) {
            operando1 = Integer.parseInt(byte1, 2);//Convierte el número binario en un número entero
            System.out.print("Introduce el segundo binario de 8 bits: ");
            String byte2 = dato.nextLine(); //Recoge la primera cadena binaria
            //Verificación para ver si la primera cadena binaria es correcta
            if (verificarBinario(byte2)) {
                operando2 = Integer.parseInt(byte2, 2);//Convierte el número binario en un número entero
                System.out.print("Operación a realizar (AND/OR/XOR): ");
                String operacion = dato.nextLine().trim().toUpperCase(); //Operacion solicitada por el usuario

                seleccionarOperacion(operacion, operando1, operando2);
            } else { //Si el segundo binario es incorrecto, muestra un error
                System.out.println("ERROR. El segundo binario es incorrecto\n");
                main(null);
            }
        } else { //Si el primer binario es incorrecto, muestra un error
            System.out.println("ERROR. El primer binario es incorrecto\n");
            main(null);
        }
    }
}
