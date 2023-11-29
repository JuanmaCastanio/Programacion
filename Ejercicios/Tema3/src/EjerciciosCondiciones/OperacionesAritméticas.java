package EjerciciosCondiciones;

public class OperacionesAritméticas {
    public static void main(String[] args) {
        int n1 = (int) (Math.random() * (10 + 1));
        int n2 = (int) (Math.random() * (10 + 1));
    
        System.out.println("Primer número: " + n1);
        System.out.println("Segundo número: " + n2);

        System.out.println("Suma: " + (n1 + n2));
        System.out.println("Resta: " + (n1 - n2));
        System.out.println("Multiplicación: " + (n1 * n2));
        if(n2 >0){
            System.out.println("División: " + (n1 / (double)n2));
            System.out.println("Resto: " + (n1 % (double)n2));
        }
        else
            System.out.println("Error al dividir por cero");
    
    }
}
