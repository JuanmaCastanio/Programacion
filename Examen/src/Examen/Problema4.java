package Examen;

import java.util.Random;
import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Random generador = new Random();
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String amarillo = "\033[33m";
        int lado = generador.nextInt(3, 10);//Genera el la longitud del lado
        System.out.print("Color (1:rojo/2:verde/3:amarillo): ");
        int opcion = dato.nextInt();//Elegir la opcion de color

        switch (opcion) {
            case 1: {
                String espacios = "";//Espacios de separacion con el margen
                int ladoaux = lado;//Variable para recorrer las columnas
                for (int i = 0; i < lado - 1; i++) {
                    System.out.print(espacios);
                    for (int j = 0; j < ladoaux; j++) {
                        //Si es uno de los bordes muestra X y si no, pone un espacio 
                        if (j == 0) {
                            System.out.print("x" + rojo);
                        } else if (j == ladoaux - 1) {
                            System.out.print("x" + rojo);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    espacios = espacios + " ";//Aumento de los espacios
                    ladoaux = ladoaux - 2;//Reducimos los bordes
                    System.out.println();

                }
            }
                break;

            case 2: {
                String espacios = "";//Espacios de separacion con el margen
                int ladoaux = lado;//Variable para recorrer las columnas
                for (int i = 0; i < lado - 1; i++) {
                    System.out.print(espacios);
                    for (int j = 0; j < ladoaux; j++) {
                        //Si es uno de los bordes muestra X y si no, pone un espacio 
                        if (j == 0) {
                            System.out.print("x" + verde);
                        } else if (j == ladoaux - 1) {
                            System.out.print("x" + verde);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    espacios = espacios + " ";//Aumento de los espacios
                    ladoaux = ladoaux - 2;//Reducimos los bordes
                    System.out.println();

                }
            }
                break;

            case 3: {
                String espacios = "";//Espacios de separacion con el margen
                int ladoaux = lado;//Variable para recorrer las columnas
                for (int i = 0; i < lado - 1; i++) {
                    System.out.print(espacios);
                    for (int j = 0; j < ladoaux; j++) {
                        //Si es uno de los bordes muestra X y si no, pone un espacio 
                        if (j == 0) {
                            System.out.print("x" + amarillo);
                        } else if (j == ladoaux - 1) {
                            System.out.print("x" + amarillo);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    espacios = espacios + " ";//Aumento de los espacios
                    ladoaux = ladoaux - 2;//Reducimos los bordes
                    System.out.println();

                }
            }
                break;

            default: {
                //Si el numero no esta contemplado, muestra error
                System.out.println("ERORR. Color no contemplado");
            }
                break;
        }
    }
}
