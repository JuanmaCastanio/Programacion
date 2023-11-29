
package Calculadoras;

import java.util.Scanner;

/**
 *
 * @author Juan José Blanco Díaz
 * @version 1.0
 * @since 24-11-2023
 */

public class CalculadoraBinaria {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Introduce el primer binario de 8 bits: ");
        String byte1 = dato.nextLine();
        int operando1 = Integer.parseInt(byte1, 2);
        System.out.print("Introduce el segundo binario de 8 bits: ");
        String byte2 = dato.nextLine();
        int operando2 = Integer.parseInt(byte2, 2);
        System.out.print("Operación a realizar (AND/OR/XOR): ");
        String operacion = dato.nextLine().trim().toUpperCase();
        
        switch (operacion) {
            case "AND":{
                int resultado = operando1 & operando2;
                System.out.println("Resultado en decimal: " + resultado);
                String resultadoBinario = "";
                boolean continuar = true;
                int cont = 0;
                do{
                    if(resultado == 0){
                        for (int i = 0; i < 8 - cont; i++) {
                            resultadoBinario = 0 + resultadoBinario;
                        }
                        continuar = false;
                    }
                    else if(resultado % 2 == 0){
                        resultadoBinario = 0 + resultadoBinario;
                        cont++;
                    }
                    else if(resultado % 2 != 0){
                        resultadoBinario = 1 + resultadoBinario;
                        cont++;
                    }
                    
                    resultado = resultado / 2;
                }while(continuar);
                System.out.println("Resultado en binario: " + resultadoBinario);
            }break;
            case "OR":{
                int resultado = operando1 | operando2;
                System.out.println("Resultado en decimal: " + resultado);
            }break;
            case "XOR":{
                int resultado = operando1 ^ operando2;
                System.out.println("Resultado en decimal: " + resultado);
            }break;
        
            default:{
                System.out.println("Error. Elección no contemplada");
            }break;
        }
    }
}
