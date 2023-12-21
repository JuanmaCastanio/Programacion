package Ejercicios;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 * 
 * Clase que representa las coordenadas rectangulares de pntos en el plano x-y
 * 
 */
public class Punto {
    
    //Atributos
    private double x;
    private double y;

    //Constructor por defecto


    public double getCoordenadaX(){
        return x;
    }

    public double getCoordenadaY(){
        return y;
    }

    public void setCoordenadaX(double valorX){
        x = valorX;
    }

    public void setCoordenadaY(double valorY){
        y = valorY;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }





    /**
     * coordenadaX
     * calcula la coordenada x del punto
     * @param grados Radianes del ángulo
     * @param distanciaPunto Distancia del origen al punto
     * @return Coordenada x
     */
    public double coordenadaX(double grados, double distanciaPunto){
        return distanciaPunto *(Math.cos(Math.toRadians(grados)));
    }
    /**
     * coordenadaY
     * calcula la coordenada y del punto
     * @param grados Radianes del ángulo
     * @param distanciaPunto Distancia del origen al punto
     * @return Coordenada y
     */
    public double coordenadaY(double grados, double distanciaPunto){
        return distanciaPunto *(Math.sin(Math.toRadians(grados)));    
    }
}