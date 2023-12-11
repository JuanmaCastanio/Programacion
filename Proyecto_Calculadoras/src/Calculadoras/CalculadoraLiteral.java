package Calculadoras;

import java.util.Scanner;

/**
 *
 * La clase CalculadoraLiteral realiza operaciones básicas (suma, resta,
 * producto, división y módulo) con dos operandos escritos cada cifra como una
 * cadena de Strings.
 *
 * @author Juan José Blanco Díaz
 * @version 1.0
 * @since 24-11-2023
 */
public class CalculadoraLiteral {

    /**
     * convertirNumero transforma cada número de tipo String recogido como frase
     * a un número de tipo int.
     *
     * @param num1 La primera cifra del número.
     * @param num2 La segunda cifra del número. Si el número tiene 1 cifra, se
     * asigna por defecto "".
     * @return El número ya convertido en un entero.
     */
    public static int convertirNumero(String num1, String num2) {
        try {
            String numeroEnCifras = ""; //Número representado en cifras
            String num; //Almacena una cifra para buscarla en un switch
            //Bucle para repetir la busqueda de la cifra según el tamaño del número (Max 2 dígitos) 
            for (int i = 1; i <= 2; i++) {
                if (i == 1) { //Si estamos en la primera iteración, elegimos la primera cifra
                    num = num1;
                } else { //Si estamos en la segunda, elegimos la segunda
                    num = num2;
                }
                //Según el caso, concatena a numeroEnCifras la cifra correspondiente 
                switch (num) {
                    case "": { //Si el numero solo tiene una cifra, se recoge en este caso num2
                    }
                    break;
                    case "cero": {
                        numeroEnCifras = numeroEnCifras + "0";
                    }
                    break;
                    case "uno": {
                        numeroEnCifras = numeroEnCifras + "1";
                    }
                    break;
                    case "dos": {
                        numeroEnCifras = numeroEnCifras + "2";
                    }
                    break;
                    case "tres": {
                        numeroEnCifras = numeroEnCifras + "3";
                    }
                    break;
                    case "cuatro": {
                        numeroEnCifras = numeroEnCifras + "4";
                    }
                    break;
                    case "cinco": {
                        numeroEnCifras = numeroEnCifras + "5";
                    }
                    break;
                    case "seis": {
                        numeroEnCifras = numeroEnCifras + "6";
                    }
                    break;
                    case "siete": {
                        numeroEnCifras = numeroEnCifras + "7";
                    }
                    break;
                    case "ocho": {
                        numeroEnCifras = numeroEnCifras + "8";
                    }
                    break;
                    case "nueve": {
                        numeroEnCifras = numeroEnCifras + "9";
                    }
                    break;
                    default: { //Si no es ninguna de los casos anteriores, consideramos que es una excepción
                        throw new Exception();
                    }
                }
            }
            return Integer.parseInt(numeroEnCifras);
        } catch (Exception error1) { //Si salta una excepción, mostramos mensaje de error y volvemos a comenzar el programa
            System.out.println("ERROR. Los datos introducidos son incorrectos\n");
            main(null);
        }
        return -1;
    }

    /**
     * numeroCifras divide la cadena en la que se encuenta el número escrito en
     * dos cadenas diferentes.
     *
     * @param num La cadena String en la que se encuenta el numero.
     * @return Número entero.
     */
    public static int numeroCifras(String num) {
        int operando; //Variable donde guardamos el número entero
        //Si el número es de 1 cifra, lo pasamos directamente a convertirNumero
        if (!num.contains(" ")) {
            operando = convertirNumero(num, "");
        } //Si el número es de 2 cifras, lo dividimos en dos cadenas y lo pasamos a convertirNumero
        else {
            String primerNum = num.substring(0, num.indexOf(" ")).trim(); //Recoge la primera cifra como cadena
            String segundoNum = num.substring((num.indexOf(" ") + 1), num.length()).trim(); //Recoge la segunda cifra como cadena
            operando = convertirNumero(primerNum, segundoNum);
        }
        return operando;
    }

    /**
     * resultado realiza con dos números una operación elegida por el usuario.
     *
     * @param operando1 El primer operador de la operación.
     * @param operando2 El segundo operador de la operación.
     * @param signoOperacion La operación elegida.
     */
    public static void resultado(int operando1, int operando2, String signoOperacion) {
        try {
            switch (signoOperacion) {
                case "suma": {
                    System.out.printf("Resultado: %d\n", (int) (operando1 + operando2));
                }
                break;
                case "resta": {
                    System.out.printf("Resultado: %d\n", (int) (operando1 - operando2));
                }
                break;
                case "producto": {
                    System.out.printf("Resultado: %d\n", (int) (operando1 * operando2));
                }
                break;
                case "division": {
                    System.out.printf("Resultado: %.3f\n", (operando1 / (double) operando2));
                }
                break;
                case "modulo": {
                    System.out.printf("Resultado: %d\n", (int) (operando1 % operando2));
                }
                break;
                default: { //Si el caso no está contemplado, lo tratamos como una excepción
                    throw new Exception();
                }
            }
        } catch (Exception error2) { //Si salta una excepción, mostramos mensaje de error y volvemos a comenzar el programa
            System.out.println("ERROR. La operacion es incorrecta\n");
            main(null);
        }
    }

    /**
     * main inicia la ejecucuión.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int operando1 = 0, operando2 = 0; //Variables para acumular los valores en tipo entero 
        System.out.print("Introduce el primer numero(E.j: nueve siete -> 97): ");
        String num1 = dato.nextLine().toLowerCase().trim(); //Primer numero recogido en cadena
        System.out.print("Introduce el segundo numero(E.j: nueve siete -> 97): ");
        String num2 = dato.nextLine().toLowerCase().trim(); //Segundo numero recogido en cadena
        System.out.print("Introduce la operacion(Suma/Resta/Producto/Division/Modulo): ");
        String signoOperacion = dato.nextLine().toLowerCase().trim(); //Operación elegida
        //Llamamos a "numeroCifras" para saber si el número tiene 1 o 2 cifras
        operando1 = numeroCifras(num1);
        operando2 = numeroCifras(num2);
        //LLamamos a resultado para que haga la operación elegida
        resultado(operando1, operando2, signoOperacion);
    }
}
