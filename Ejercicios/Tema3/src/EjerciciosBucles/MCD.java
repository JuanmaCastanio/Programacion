package EjerciciosBucles;

import java.util.Scanner;

public class MCD {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

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
        boolean continuar = true;//Bandera para controlar el algoritmo
        System.out.print("MCD(" + dividendo + "," + div + ") = ");
        if(div == 0)//Si 'div' = 0, el MCD es el dividendo
            System.out.println(dividendo);
        else{
            do{
                int resto = dividendo % div;//Obtenemos el resto
                //Si 'resto' = 0, el div es el MCD
                if(resto == 0){
                    continuar = false;//Cambiamos la bandera para salir del bucle
                    System.out.println(div);
                }
                //Si no, 'div' pasa a ser 'dividendo' y 'resto' pasa a ser 'div' y repetimos
                dividendo = div;
                div = resto;
            }while (continuar);
        }
    }
}