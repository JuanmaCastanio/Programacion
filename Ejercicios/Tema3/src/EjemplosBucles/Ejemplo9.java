package EjemplosBucles;

public class Ejemplo9 {
    public static void main(String[] args) {
        String palabra = "Multiplataforma";
        //Recorre la palabra mostrando cada caracter en una linea
        for(int i = 0;i<palabra.length();i++){
            System.out.println(palabra.charAt(i));
        }

        String miPalabra = "";
        miPalabra = miPalabra + "hola";
        miPalabra = miPalabra + " pepe";
        System.out.println(miPalabra);
    }
}