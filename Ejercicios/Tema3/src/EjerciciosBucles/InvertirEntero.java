package EjerciciosBucles;

import java.util.Scanner;

public class InvertirEntero {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        //Petición de un número entero
        System.out.print("Introduce un número entero: ");
        int num = dato.nextInt();
        //Conversion del num. entero a String
        String cadenaNum = String.valueOf(num);
        //Acumulador para el núm. invertido
        String numInvertido = "";
        //Si es negativo, se inicializa con un menos
        if(cadenaNum.charAt(0) == '-')
            numInvertido = "-";
        for(int i = cadenaNum.length() - 1;i >= 0; i--){
            //Escribe el número empezando por detrás y obviando el '-' si es negativo
            if (cadenaNum.charAt(i) != '-')
                numInvertido = numInvertido + cadenaNum.charAt(i);

        }
        //Muestra el número invertido
        System.out.println("Número invertido: " + numInvertido);   
    }
}
