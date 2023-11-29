package EjerciciosCondiciones;

import java.util.Scanner;

public class MiNota {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Introduce la nota 1: ");
        int nota1 = dato.nextInt();
        System.out.print("Introduce la nota 2: ");
        int nota2 = dato.nextInt();
        System.out.print("Introduce la nota 3: ");
        int nota3 = dato.nextInt();
        System.out.print("Introduce la nota 4: ");
        int nota4 = dato.nextInt();
        double media = ((double)(nota1 + nota2 + nota3 +nota4))/4;
        
        if((nota1 >= 0 && nota1 <= 100) && (nota2 >= 0 && nota2 <= 100) && (nota3 >= 0 && nota3 <= 100) && (nota4 >= 0 && nota4 <= 100)){
            if(media >= 0 && media <= 59)
                System.out.println("Tu nota es: E");
            else if(media >= 60 &&media <= 69)
                System.out.println("Tu nota es: D");
            else if(media >= 70 && media <= 79)
                System.out.println("Tu nota es: C");
            else if(media >= 80 && media <= 89)
                System.out.println("Tu nota es: B");
            else if(media >= 90 && media <= 100)
                System.out.println("Tu nota es: A");
            else
                System.out.println("Error, no se puede calcular la nota");
        }
        else
            System.out.println("Error, fuera del rango");
    }
}
