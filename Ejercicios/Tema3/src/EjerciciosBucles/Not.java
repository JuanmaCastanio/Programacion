package EjerciciosBucles;

import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String complementario = "", binario;
        boolean verificacion;
        int numDecimalCom = 0, numDecimal = 0;

        do {
            verificacion = false;
            System.out.print("Introduce un número binario de 8 bits:");
            binario = dato.nextLine();
            if(binario.length() != 8){
                System.out.println("Error.La longitud no es correcta");
                verificacion = true;
            }
            else{
                for(int i = 0;i<binario.length();++i){
                    if(binario.charAt(i) != '0' && binario.charAt(i) != '1' ){
                        System.out.println("Error.El número no es un binario");
                        verificacion = true;
                        i = binario.length();
                    }
                    
                }
            }
        } while (verificacion);

        for(int i = 0;i < binario.length();i++){
            if(binario.charAt(i) == '0'){
                complementario = complementario + '1';
                numDecimalCom =  numDecimalCom + (int) Math.pow(2,binario.length()-1 - i);
            }
            else{
                complementario = complementario + '0';
                numDecimal = numDecimal + (int) Math.pow(2,binario.length()-1 - i);
            }
        }
        System.out.println("Numero Binario: " + binario + ", Numero Decimal: " + numDecimal + "\n");
        System.out.println("Numero Binario complementario: " + complementario + ", Numero Decimal Complementario: " + numDecimalCom);
    }
}
