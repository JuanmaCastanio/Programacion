
package EjerciciosString;

import java.util.Scanner;

public class Busqueda {
    public static void main(String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.print("Cadena donde buscar: ");
        String frase = dato.nextLine();
        System.out.print("Cadena a buscar: ");
        String tramo = dato.next();
        String posiciones = "";
        int cont = 0;


        /*for (int i = 0; i < frase.length() && i + tramo.length() <= frase.length(); i++) {
            if(tramo.equals(frase.substring(i, i + tramo.length()))){
                if(cont == 0)
                    posiciones = posiciones + i;
                else
                    posiciones = posiciones + ", " + i;  
                cont++;
            }  
        }*/
        for(int i = 0;i < frase.length();i++){
            if(frase.indexOf(tramo, i) == i){
                if(cont == 0){
                    posiciones = posiciones + i;
                }
                else{
                    posiciones = posiciones + ", " + i;  
                }
                cont++;
            }
        }
        System.out.println("Posiciones en las que aparece: " + posiciones);
        System.out.println("Número de ocurrencias: " + cont);
    }
}
