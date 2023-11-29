import java.util.Random;
import java.util.Scanner;

public class LetrasCascada {
    public static void main(String[] args) throws InterruptedException{
        Scanner dato = new Scanner(System.in);
        Random generador = new Random();
        System.out.print("Escribe una palabra o frase: ");
        String palabra = dato.nextLine();
        int cont = 0;
        String resultado = "";

        do {
            Thread.sleep(75);
            char caracter = (char)generador.nextInt(97, 123);
            if(caracter == palabra.charAt(cont)){
                resultado = resultado + caracter;
                System.out.println(resultado);
                cont++;
            }
            else if(caracter - 32 == palabra.charAt(cont)){
                resultado = resultado + (char)(caracter - 32);
                System.out.println(resultado);
                cont++;
            }
            else if(palabra.charAt(cont) == ' '){
                resultado = resultado + " ";
                System.out.println(resultado);
                cont++;
            }
            else{
                System.out.print(resultado);
                System.out.println(caracter);
            }
        } while (cont != palabra.length());
    }
}
