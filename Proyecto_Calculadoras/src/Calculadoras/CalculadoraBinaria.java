
package Calculadoras;

import java.util.Scanner;

/**
 *
 * @author Juan José Blanco Díaz
 * @version 1.0
 * @since 24-11-2023
 */

public class CalculadoraBinaria {
    public static void seleccionarOperacion(String operacion, int operando1, int operando2){
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
    
    public static String convertirBinario(int enteroDecimal) {
        String resultadoBinario = "";
        boolean continuar = true;
        int cont = 0;
        do {
            if (enteroDecimal == 0) {
                for (int i = 0; i < 8 - cont; i++) {
                    resultadoBinario = 0 + resultadoBinario;
                }
                continuar = false;
            } 
            else if (enteroDecimal % 2 == 0) {
                resultadoBinario = 0 + resultadoBinario;
                cont++;
            } 
            else if (enteroDecimal % 2 != 0) {
                resultadoBinario = 1 + resultadoBinario;
                cont++;
            }

            enteroDecimal = enteroDecimal / 2;
        } while (continuar);
        return resultadoBinario;
    }

    public static boolean verificarBinario(String binario){
        boolean valido = false;
        if(binario.length() == 8){
            for (int i = 0; i < binario.length(); i++) {
                if(binario.charAt(i) == '1' || binario.charAt(i) == '0'){
                    valido = true;
                }
                else{
                    return valido = false;
                }
            }
        }
        return valido;
    }

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int operando1 = 0;
        int operando2 = 0;

        System.out.print("Introduce el primer binario de 8 bits: ");
        String byte1 = dato.nextLine();
        if(verificarBinario(byte1)){
            operando1 = Integer.parseInt(byte1, 2);
            System.out.print("Introduce el segundo binario de 8 bits: ");
            String byte2 = dato.nextLine();
            if(verificarBinario(byte2)){
                operando2 = Integer.parseInt(byte2, 2);
                System.out.print("Operación a realizar (AND/OR/XOR): ");
                String operacion = dato.nextLine().trim().toUpperCase();

                seleccionarOperacion(operacion, operando1, operando2);
            }
            else{
                System.out.println("Error. El segundo binario es incorrecto");
            }
        }
        else{
            System.out.println("Error. El primer binario es incorrecto");
        }
        
        
        
    }
}
