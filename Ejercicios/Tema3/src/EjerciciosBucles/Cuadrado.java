package EjerciciosBucles;

public class Cuadrado {
    public static void main(String[] args) {
        int lado = (int) ((Math.random()* (10 -1))+ 1);//Generación de la altura
        System.out.println("Lado: " + lado);

        System.out.println();
        for (int i = 0; i < lado; i++) { //Controla la altura del rectángulo
            for (int j = 0; j < lado; j++) {//Controla la base del rectángulo
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    } 
}
