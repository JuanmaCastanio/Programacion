package EjemplosBucles;

import java.util.Random;//Clase para generar elementos aleatorios
import java.util.Scanner;

public class Moneda {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Random generador = new Random();
        //Bandera para verificar la permanencia del bucle
        boolean verificacion = true;
        do{
            boolean moneda = generador.nextBoolean();//Genera un boolean 
            if(moneda)//Si es true, sale cara
                System.out.println("----------------------------------\nCARA");
            else//Si sale false, sale cruz
                System.out.println("----------------------------------\nCRUZ");
            //Verificación para intentarlo de nuevo
            System.out.println("----------------------------------\n¿Realizarlo otra vez? (Si/No)");
            String frase = dato.nextLine();
            //Si es una respuesta diferente a si o a no, vuelve a preguntar hasta que sea una respuesta válida
            while(!frase.equalsIgnoreCase("no") && !frase.equalsIgnoreCase("si")){
                System.out.println("----------------------------------\nError. Introduce Si o No");
                frase = dato.nextLine();
            }
            //Si dices no, cambia el valor de la bandera para salir del bucle
            if(frase.equalsIgnoreCase("no"))
                verificacion = false;
        }while(verificacion);
    }
}
