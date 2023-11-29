package EjerciciosBucles;

import java.util.Random;

public class Triangulo6B {
    public static void main(String[] args) {
        Random generador = new Random();
        int base = generador.nextInt(1,11);
        int mitad = base/2;
        if(base % 2 != 0)
            mitad +=1;
        System.out.println("Base: " + base + "\n");
        for (int i = 1; i <= base; i++) {
            if(i <= mitad){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            else{
                for (int j = base; j >= i; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
