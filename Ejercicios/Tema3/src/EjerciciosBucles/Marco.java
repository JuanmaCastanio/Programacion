package EjerciciosBucles;

import java.util.Scanner;
import java.util.Random;

public class Marco {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Random generador = new Random();
        
        System.out.print("Introduzca un rellano para el marco: ");
        char relleno = dato.nextLine().charAt(0);
        int altura = generador.nextInt(10-3+1) + 3;//Generación de la altura
        int base = generador.nextInt(10-3+1) + 3;//Generación de la base
        System.out.println("Base: " + base + ", Altura: " + altura);
        System.out.println();
        for (int i = 0; i < altura; i++) {//Controla la altura del marco
            for (int j = 0; j < base; j++) {//Controla la base del marco
                if(i == 0)//Marco superior
                    System.out.print(relleno);
                else if(i == altura -1)//Marco inferior
                    System.out.print(relleno);
                else if(j == 0)//Marco de la izquierda
                    System.out.print(relleno);
                else if(j == base -1)//Marco de la derecha
                    System.out.print(relleno);
                else//Si no, escribe espacios vacíos
                    System.out.print(" ");
            }
            System.out.println();
        }
    } 
}