package Ejemplos;

public class EjemplosString {
    public static void main(String[] args) {
        
        String s1 = "Esto es una cadena muy bonita";
        System.out.println(s1.charAt(0));//-> E

        System.out.println(s1.indexOf("a"));//-> 10
        System.out.println(s1.indexOf("una"));//-> 8
        System.out.println(s1.indexOf("xx"));//-> -1
        System.out.println(s1.indexOf("a", 12));//-> 13

        System.out.println(s1.lastIndexOf("a"));//-> 17

        String s2 = s1.substring(12);//-> cadena
        System.out.println(s2);
        s2 = s1.substring(s1.indexOf("cadena"));//-> cadena
        System.out.println(s2);

        System.out.println(s1.toUpperCase());
        System.out.println(s1);

        String s3 = "          Hola      ";
        System.out.println(s3.trim() + "a");

        String cadena1 = "coche";
        String cadena2 = "pelota";
        System.out.println(cadena1.equals(cadena2));//false
        System.out.println(cadena1.equals(cadena1));//true

        System.out.println(cadena1.compareTo(cadena2));//-> -13
    }
}
