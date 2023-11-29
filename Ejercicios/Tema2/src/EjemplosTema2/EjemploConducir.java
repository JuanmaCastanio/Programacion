package EjemplosTema2;

import java.util.Scanner;

public class EjemploConducir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Tienes carnet de conducir? (S/N) ");
        String carnet = sc.next();

        boolean conducir = (edad >= 18) && (carnet.equals("S") || carnet.equals("s"));
        System.out.println("Puedes conducir? " + conducir);
        sc.close();
    }
}
