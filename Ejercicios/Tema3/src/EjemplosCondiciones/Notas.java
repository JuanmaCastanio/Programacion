package EjemplosCondiciones;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Introduce una nota: ");
        int numero = dato.nextInt();
        String nota = "";
        if(numero <=2 && numero >= 0)
            nota = "MB";
        else if (numero == 3 || numero == 4)
            nota = "I";
        else if (numero == 5)
            nota = "A";
        else if (numero == 6)
            nota = "B";
        else if(numero == 7 || numero == 8)
            nota = "N";
        else if(numero >= 8 && numero <= 10)
            nota = "S";

        switch(nota){
            case "MB":{
                System.out.println("Has suspendido");
                break;
            }
            case "I":{
                System.out.println("Insuficiente");
                break;
            }
            case "A":{
                System.out.println("Aprobado");
                break;
            }
            case "B":{
                System.out.println("Bien");
                break;
            }
            case "N":{
                System.out.println("Notable");
                break;
            }
            case "S":{
                System.out.println("Sobresaliente");
                break;
            }
            default:{
                System.out.println("La nota no es correcta");
                break;
            }
            
        }
    }
}
