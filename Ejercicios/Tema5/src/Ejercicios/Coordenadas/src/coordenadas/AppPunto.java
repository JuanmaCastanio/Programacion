package coordenadas;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;


public class AppPunto {
    public static void main(String[] args) {
        
        Random generador = new Random();
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
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        for (int i = 0; i < 30; i++) {
            Punto p = new Punto();
            p.setCoordenadaX(generador.nextDouble(0, pantalla.getWidth()));
            p.setCoordenadaY(generador.nextDouble(0, pantalla.getWidth()));
            System.out.println("Punto " + (i + 1) + ": " + p.toString()); 
    
        }
    }
}