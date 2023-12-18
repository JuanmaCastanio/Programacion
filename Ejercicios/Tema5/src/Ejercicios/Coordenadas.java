package Ejercicios;

import java.util.Scanner;

public class Coordenadas {
    /**
     * conversorGradosRadianes
     * transforma los grados en radianes
     * @param grados Grados del ángulo
     * @return Radianes del ángulo
     */
    public double conversorGradosRadianes(double grados){
        return (grados * Math.PI) / 180;
    }
    /**
     * coordenadaX
     * calcula la coordenada x del punto
     * @param radianes Radianes del ángulo
     * @param distanciaPunto Distancia del origen al punto
     * @return Coordenada x
     */
    public double coordenadaX(double radianes, double distanciaPunto){
        return distanciaPunto *(Math.cos(radianes));
    }
    /**
     * coordenadaY
     * calcula la coordenada y del punto
     * @param radianes Radianes del ángulo
     * @param distanciaPunto Distancia del origen al punto
     * @return Coordenada y
     */
    public double coordenadaY(double radianes, double distanciaPunto){
        return distanciaPunto *(Math.sin(radianes));    
    }
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Coordenadas coordenadas = new Coordenadas();
        System.out.print("Introduce la distancia al punto: ");
        double distanciaPunto = dato.nextDouble(); //Distancia del origen al punto
        System.out.print("Introduce los grados del ángulo: ");
        double grados = dato.nextDouble(); //Grados del ángulo
        System.out.println("Coodenada X: " + coordenadas.coordenadaX(coordenadas.conversorGradosRadianes(grados), distanciaPunto));
        System.out.println("Coodenada Y: " + coordenadas.coordenadaY(coordenadas.conversorGradosRadianes(grados), distanciaPunto));
    }
}
