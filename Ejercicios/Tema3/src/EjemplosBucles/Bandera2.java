package EjemplosBucles;

public class Bandera2 {
    public static void main(String[] args) {
        int numAleatorio = (int) (Math.random()*10 + 1);//Genera el numero aleatorio entre 1 y 10 que se va a repetir
        System.out.println("Numero aleatorio generado:" + numAleatorio);//Para verificar que num aleatorio es
        boolean entrar = true;//Bandera para entrar y salir del bucle
        int i = 1;//Se inicializa un contador
        while (entrar) {
            //"Hola" se genera con impares
            if (i % 2 != 0) 
                System.out.println("Hola");
            //"Si no es impar, par con "Adios"
            else 
                System.out.println("Adios");
            //Comprueba si el contador y el numero aleatorio son el mismo para cambiar el valor de la bandera
            if (numAleatorio == i)
                entrar = false;
            i++; 
        }
    }
}
