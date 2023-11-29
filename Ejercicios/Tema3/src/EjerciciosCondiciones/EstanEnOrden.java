package EjerciciosCondiciones;

import java.util.Scanner;

public class EstanEnOrden {
    public static void main(String[] args) throws Exception {
        Scanner dato = new Scanner(System.in);

        System.out.print("Introduce el número 1: ");
        int n1 = dato.nextInt();
        System.out.print("Introduce el número 2: ");
        int n2 = dato.nextInt();
        System.out.print("Introduce el número 3: ");
        int n3 = dato.nextInt();

        if(n1 == n2 && n2 == n3)
            System.out.println("Los 3 números son iguales");
        else if(n1 >= n2 && n2 >= n3)
                System.out.println("Está ordenado de mayor a menor");
        else if(n1 <= n2 && n2 <= n3)
                System.out.println("Está ordenado de menor a mayor");
        else
            System.out.println("No está ordenado");
    }
}
