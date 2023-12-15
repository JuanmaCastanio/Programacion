package Ejercicios.Figuras;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AppCalcularAreas {
    public static void main(String[] args) {
        Figuras area = new Figuras();
        Scanner dato = new Scanner(System.in);
        NumberFormat formatoDecimales = NumberFormat.getInstance(Locale.GERMAN);
        formatoDecimales.setMaximumFractionDigits(3);
        System.out.print("Elige una figura (Rectangulo/Cuadrado/Triangulo/Circulo): ");
        String figura = dato.nextLine().trim().toLowerCase();
        switch (figura) {
            case "rectangulo":{
                double altura, base;
                do {
                    System.out.print("Altura (cm): ");
                    altura = dato.nextDouble();
                    System.out.print("Base (cm): ");
                    base = dato.nextDouble();
                    if(area.validarNegativos(altura) && area.validarNegativos(base)){
                        System.out.println("ERROR. Número negativo.");
                    }
                } while (area.validarNegativos(altura) && area.validarNegativos(base));
                System.out.println("Área rectángulo: " + formatoDecimales.format(area.areaRectangulo(altura, base)) + " cm");
            }
                break;

            case "cuadrado":{
                double lado;
                do {
                    System.out.print("Lado (cm): ");
                    lado = dato.nextDouble();
                    if(area.validarNegativos(lado)){
                        System.out.println("ERROR. Número negativo.");
                    }
                } while (area.validarNegativos(lado));
                System.out.println("Área cuadrado: " + formatoDecimales.format(area.areaCuadrado(lado)) + " cm");
            }
                break;

            case "triangulo":{
                double altura, base;
                do {
                    System.out.print("Altura (cm): ");
                    altura = dato.nextDouble();
                    System.out.print("Base (cm): ");
                    base = dato.nextDouble();
                    if(area.validarNegativos(altura) && area.validarNegativos(base)){
                        System.out.println("ERROR. Número negativo.");
                    }
                } while (area.validarNegativos(altura) && area.validarNegativos(base));
                System.out.println("Área triangulo: " + formatoDecimales.format(area.areaTriangulo(altura, base)) + " cm");
            }
                break;

            case "circulo":{
                double radio;
                do {
                    System.out.print("Radio (cm): ");
                    radio = dato.nextDouble();
                    if(area.validarNegativos(radio)){
                        System.out.println("ERROR. Número negativo.");
                    }
                } while (area.validarNegativos(radio));
                System.out.println("Área triangulo: " + formatoDecimales.format(area.areaCirculo(radio)) + " cm");
            }
                break;

            default:{
                System.out.println("ERROR. Valor no contemplado.");
                main(null);
            }
                break;
        }
    }
}
