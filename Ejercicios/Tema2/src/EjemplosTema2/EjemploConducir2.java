package EjemplosTema2;

import java.util.Scanner;

public class EjemploConducir2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Tienes carnet de conducir? (S/N) ");
        char carnet = sc.next().charAt(0);

        boolean conducir = (edad >= 18) && (carnet == 'S' || carnet == 's');
        System.out.println("Puedes conducir? " + conducir);
        sc.close();
    }
}
