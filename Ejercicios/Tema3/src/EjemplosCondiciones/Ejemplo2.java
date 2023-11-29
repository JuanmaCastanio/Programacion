package EjemplosCondiciones;

import java.util.Scanner;
//Programa que cuenta el número de positivos, negativos o nulos

public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        int positivo = 0;
        int negativo = 0;
        int nulo = 0;
        
        

        
        while(true){

            System.out.print("Escriba un número: ");
            double numero = dato.nextDouble();

            if(numero > 0)
                positivo ++;
            else if(numero < 0)
                negativo ++;
            else
                nulo ++;

            System.out.println("Hay " + positivo + " positivos");
            System.out.println("Hay " + negativo + " negativos");
            System.out.println("Hay " + nulo + " ceros");
        }
    }
}
