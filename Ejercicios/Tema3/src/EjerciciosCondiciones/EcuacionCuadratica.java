package EjerciciosCondiciones;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        int a = (int) (Math.random() * (10 + 1));
        int b = (int) (Math.random() * (10 + 1));
        int c = (int) (Math.random() * (10 + 1));
        int discriminante = 0;

        if(a == 0)
            System.out.println("Error, división por cero");
        else
            discriminante = (int) Math.pow(b,2) - (4*a*c);
        if(discriminante > 0){
            System.out.println("Número 1: " + a);
            System.out.println("Número 2: " + b);
            System.out.println("Número 3: " + c);

            System.out.println("Solución 1: " + ((int) (- b +( Math.sqrt(discriminante)/a*2))));
            System.out.println("Solución 2: " + ((int) (- b -( Math.sqrt(discriminante)/a*2))));
        }
        else
            System.out.println("Error de cálculo");
    
    
    }   
}
