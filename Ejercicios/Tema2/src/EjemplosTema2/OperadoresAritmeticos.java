package EjemplosTema2;

//Ejemplo de creación de expresiones aritméticas

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        
        int i1 = 25;
        int i2 = 12;

        double d1 = 1.2;
        double d2 = 0.8;
        
        int suma = i1 + i2;
        
        int resta = i1 -i2;

        int producto = i1 * i2;

        double cociente = (d1 / d2);

        double cociente2 =  i1 / (double)i2;

        int resto = i1 % i2;
        
        System.out.println("Suma " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("División: " + cociente);
        System.out.println("Cociente: " + cociente2);
        System.out.println("Resto: " + resto);

        //Probamos los operadores incremento y decremento
        int a = 1;
        int b = 2;
        a = a + 1; //Incrementamos a una unidad
        a++;
        b = b - 1; //Decrementamos b una unidad
        b--;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        //Probamos el pre y el post
        a = 2;
        b = 3;
        int z = 0;
        // z = a++;
        z = ++a;
        System.out.println("z: " + z);
        System.out.println("a: " + a);

        //Probamos contracciones
        a = a + 2;
        a += 2;
        b = b * 5;
        b *= 5;


    }    
}
