package Ejercicios;

import java.util.Scanner;

public class MCDMetodos {
    public int calcularMCD(int dividendo, int div){
        int resto;
        do{
            resto = dividendo % div;//Obtenemos el resto
            //Si 'resto' != 0, 'div' pasa a ser 'dividendo' y 'resto' pasa a ser 'div' y repetimos
            if(resto != 0){
                dividendo = div;
                div = resto;
            }  
        }while (resto != 0);
        return div;
    }
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        MCDMetodos app = new MCDMetodos();

        int dividendo, div;//Dividendo y divisor para el algoritmo
        //Verificamos que se introduzcan los datos correctos 
        do {
            //Solución del problema de números decimales
            System.out.print("Introduce el primer número: ");
            dividendo = (int) dato.nextDouble();
            System.out.print("Introduce el segundo número: ");
            div = (int) dato.nextDouble();
            //Resto de verificaciones por si son negativos o por si 'dividendo' > 'div'
            if (dividendo < 0 || div < 0 || div > dividendo)
                System.out.println("Error.Números en formato incorrecto\n");   
        } while (dividendo < 0 || div < 0 || div > dividendo);
        System.out.print("MCD(" + dividendo + "," + div + ") = ");
        if(div == 0)//Si 'div' = 0, el MCD es el dividendo
            System.out.println(dividendo);
        else{
            System.out.println(app.calcularMCD(dividendo, div));
        }
    }
}
