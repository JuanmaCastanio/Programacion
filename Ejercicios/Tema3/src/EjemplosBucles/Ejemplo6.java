package EjemplosBucles;

import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int i = dato.nextInt();
        if(i > 0){
            while(i >= 0){
                System.out.println(i);
                i--;
            }
        }
        else{
            while(i <= 0){
                System.out.println(i);
                i++;
            }
        }
    }
}
