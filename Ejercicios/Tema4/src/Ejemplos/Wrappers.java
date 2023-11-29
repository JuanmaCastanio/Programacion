package Ejemplos;

public class Wrappers {
    public static void main(String[] args) {
        
        //Declaramos variables de tipo objeto (Wrappers)
        int i1 = 0;
        i1 = 123;

        Integer i2 = 0;
        i2 = 123;//Autoboxing
        i2 = Integer.valueOf(56);
        i2 = i1;

        String s1 = "Hola";
        System.out.println(s1.equals("Hola"));
        Math.random();
        
    }
}
