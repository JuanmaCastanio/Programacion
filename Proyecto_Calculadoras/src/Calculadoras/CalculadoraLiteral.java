package Calculadoras;

/**
 *
 * @author Juan José Blanco Díaz
 * @version 1.0
 * @since 24-11-2023
 */

import java.util.Scanner;

public class CalculadoraLiteral {
    /**
     * convertirNumero
     * Transforma cada número de tipo String recogido en palabra a un número de tipo int 
     * 
     * @param num1 La primera cifra del número
     * @param num2 La segunda cifra del número. Si el número tiene 1 cifra, se asigna por defecto ""
     * @return
     */
    public static int convertirNumero(String num1, String num2){
        try{
            String aux = "";
            String num;
            for (int i = 1; i <= 2; i++) {
                if(i == 1){
                    num = num1;
                }
                else{
                    num = num2;
                }
                switch (num) {
                    case "":{
                    }break;
                    case "cero":{
                        aux = aux + "0";
                    }break;
                    case "uno":{
                        aux = aux + "1";
                    }break;
                    case "dos":{
                        aux = aux + "2";
                    }break; 
                    case "tres":{
                        aux = aux + "3";
                    }break; 
                    case "cuatro":{
                        aux = aux + "4";
                    }break; 
                    case "cinco":{
                            aux = aux + "5";
                    }break; 
                    case "seis":{
                        aux = aux + "6";
                    }break; 
                    case "siete":{
                        aux = aux + "7";
                    }break; 
                    case "ocho":{
                        aux = aux + "8";
                    }break; 
                    case "nueve":{
                        aux = aux + "9";
                    }break;
                    default:{
                        throw new Exception();
                    }
                }
            }
            return Integer.parseInt(aux);
        }catch (Exception error1){
            System.out.println("Los datos introducidos son incorrectos\n");
            main(null);
        }
        return -1;
    }
    /**
     * 
     * @param num
     * @return
     */
    public static int numeroCifras (String num){
        int operando;
        if(!num.contains(" ")){
            operando = convertirNumero(num, "");
        }
        else{
            String primerNum = num.substring(0, num.indexOf(" "));
            String segundoNum = num.substring((num.indexOf(" ") + 1), num.length());
            operando = (int)convertirNumero(primerNum, segundoNum);
        }
        return operando;
    }
    /**
     * 
     * @param operando1
     * @param operando2
     * @param signoOperacion
     */
    public static void resultado(int operando1, int operando2, String signoOperacion){  
        try{    
            switch (signoOperacion) {
                case "suma":{
                   System.out.printf("Resultado: %d\n", (int)(operando1 + operando2));
                }break;
                case "resta":{
                   System.out.printf("Resultado: %d\n", (int)(operando1 - operando2));
                }break;
                case "producto":{
                   System.out.printf("Resultado: %d\n", (int)(operando1 * operando2));
                }break;
                case "division":{
                   System.out.printf("Resultado: %.3f\n", (operando1 / (double)operando2));
                }break;
                case "modulo":{
                   System.out.printf("Resultado: %d\n", (int)(operando1 % operando2));
                }break;
                default:{
                    throw new Exception();
                }
            }
        }catch(Exception error2){
            System.out.println("La operacion es incorrecta\n");
            main(null);
        }
    }
    
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
