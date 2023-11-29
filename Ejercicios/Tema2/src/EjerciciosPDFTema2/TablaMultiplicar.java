package EjerciciosPDFTema2;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
            
        System.out.print("Introduce un número: ");
        int numero =  dato.nextInt();

        int tabla0 = numero * 0;
        int tabla1 = numero * 1;
        int tabla2 = numero * 2;
        int tabla3 = numero * 3;        
        int tabla4 = numero * 4;
        int tabla5 = numero * 5;
        int tabla6 = numero * 6;
        int tabla7 = numero * 7;
        int tabla8 = numero * 8;
        int tabla9 = numero * 9;
        int tabla10 = numero * 10;
        System.out.print("Tabla del " + numero + ":" + "\n" + tabla0 + "\n" + tabla1 + "\n" + tabla2 + "\n" + tabla3 
        + "\n" + tabla4 + "\n" + tabla5 + "\n" + tabla6 + "\n" + tabla7 + "\n" + tabla8 + "\n" + tabla9 + "\n" + tabla10);
    }
}
