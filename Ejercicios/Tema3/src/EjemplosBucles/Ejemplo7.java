package EjemplosBucles;

public class Ejemplo7 {
    public static void main(String[] args) {
        //Generamos los números límites
        int n1 = (int) (Math.random() * (50 - 10 + 1) + 10);
        int n2 = (int) (Math.random() * (50 - 10 + 1) + 10);
        // Si son iguales, muestra el número
        if(n1 == n2){
            System.out.println("Los números son iguales ( " + n1 + " = " + n2 + " )");
            System.out.println(n1);
        }
        // Si es n1 menor que n2, n1 es límite inferior y n2 es límite superior
        else if(n1 < n2){
            System.out.println("Números entre " + n1 + " y " + n2 + ":");
            while(n1 <= n2){
                System.out.println(n1);
                n1++;
            }
        }
        // Si no es nada de lo anterior, n2 es límite inferior y n1 es límite superior
        else{
            System.out.println("Números entre " + n2 + " y " + n1 + ":");
            while(n2 <= n1){
                System.out.println(n2);
                n2++;
            }
        } 
    }
}