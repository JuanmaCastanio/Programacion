package Examen;

import java.text.NumberFormat;
import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        NumberFormat formato = NumberFormat.getCurrencyInstance();//Formateo a euros
        //Acumulan los billetes respectivamente
        int cont500 = 0, cont200 = 0, cont100 = 0, cont50 = 0, cont20 = 0, cont10 = 0, cont5 = 0;
        double dineroSobrante = 0; //Dinero que no se puede dividir mas
        //Validacion para cantidad negativa 
        do {
            System.out.print("Introduce una cantidad (€): ");
            dineroSobrante = dato.nextDouble();
            if (dineroSobrante < 0) {
                System.out.println("ERROR. Cantidad negativa");
            }
        } while (dineroSobrante < 0);
        //Bucle que resta billete a billete y los va acumulando
        while (dineroSobrante - 5 >= 0) {
            if(dineroSobrante - 500 >= 0){
                dineroSobrante = dineroSobrante - 500;
                cont500++;
            }
            else if (dineroSobrante - 200 >= 0) {
                dineroSobrante = dineroSobrante - 200;
                cont200++;
            }
            else if (dineroSobrante - 100 >= 0) {
                dineroSobrante = dineroSobrante - 100;
                cont100++;
            }
            else if (dineroSobrante - 50 >= 0) {
                dineroSobrante = dineroSobrante - 50;
                cont50++;
            }
            else if (dineroSobrante - 20 >= 0) {
                dineroSobrante = dineroSobrante - 20;
                cont20++;
            }
            else if (dineroSobrante - 10 >= 0) {
                dineroSobrante = dineroSobrante - 10;
                cont10++;
            }
            else if (dineroSobrante - 5 >= 0) {
                dineroSobrante = dineroSobrante - 5;
                cont5++;
            }
        }
        //Si no hay billetes de un tipo, no los muestra por pantalla
        if(cont500 > 0){
            System.out.println(cont500 + " billete/s de 500");
        }
        if(cont200 > 0){
            System.out.println(cont200 + " billete/s de 200");
        }
        if(cont100 > 0){
            System.out.println(cont100 + " billete/s de 100");
        }
        if(cont50 > 0){
            System.out.println(cont50 + " billete/s de 50");
        }
        if(cont20 > 0){
            System.out.println(cont20 + " billete/s de 20");
        }
        if(cont10 > 0){
            System.out.println(cont10 + " billete/s de 10");
        }
        if(cont5 > 0){
            System.out.println(cont5 + " billete/s de 5");
        }
        //Muestra la cantidad sobrante
        System.out.println("Sobran " + formato.format(dineroSobrante));
        
    }
}
