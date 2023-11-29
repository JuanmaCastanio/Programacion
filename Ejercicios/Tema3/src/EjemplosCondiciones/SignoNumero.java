package EjemplosCondiciones;

import java.util.Scanner;

public class SignoNumero {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int numero = dato.nextInt();
        if(numero == 0)
            System.out.println("Es cero");
        else if(numero > 0)
            System.out.println("Es positivo");
        else
            System.out.println("Es Negativo");
    }
}
