package EjerciciosBucles;

public class Rectangulo {
    public static void main(String[] args) {
        int altura = (int) ((Math.random()* (10 -1))+ 1);//Generación de la altura
        int base = (int) ((Math.random()* (10 -1))+ 1);//Generación de la base
        System.out.println("Base: " + base + ", Altura: " + altura);

        System.out.println();
        for (int i = 0; i < altura; i++) { //Controla la altura del rectángulo
            for (int j = 0; j < base; j++) {//Controla la base del rectángulo
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    } 
}
