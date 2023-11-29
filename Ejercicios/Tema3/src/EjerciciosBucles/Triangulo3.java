package EjerciciosBucles;

public class Triangulo3 {
    public static void main(String[] args) {
        int cont = 8;
        for (int i = 1; i < 8; i++) {
            if(i <= 4){
                for (int j = 1; j <= i; j++)
                    System.out.print(j + " ");
            }
            else{
                for (int j = 1; j <= (cont - i); j++)
                    System.out.print(j + " ");
            }
            System.out.println("\n");
        }
    }
}
