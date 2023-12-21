package Ejercicios;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AppPunto {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto();

        //Los puntos por defecto se han creado en (0.0, 0.0)
        System.out.println(p1.getCoordenadaX());
        System.out.println(p1.getCoordenadaY());
        System.out.println(p2.getCoordenadaX());
        System.out.println(p2.getCoordenadaY());

        //Los colocamos en otros sitios
        p1.setCoordenadaX(3.3);
        p1.setCoordenadaY(17.5);
        
        p2.setCoordenadaX(0);
        p2.setCoordenadaY(10);

        System.out.println(p1.toString());
        System.out.println(p2);

        //Crea 30 puntos situados aleatoriamente en el plano
        //Ten en cuenta las dimensión del plano (tamaño de la pantalla -> Toolkit)
        //No permitas que se generen dos puntos en las mismas coordenadas

        
    }
}