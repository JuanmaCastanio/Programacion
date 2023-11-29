package EjemplosBucles;

public class Bandera1 {
    public static void main(String[] args) {
        int numAleatorio = (int) (Math.random()*10 + 1);//Genera el numero aleatorio entre 1 y 10 que se va a repetir
        System.out.println("Numero aleatorio generado:" + numAleatorio);//Para verificar que num aleatorio es
        boolean entrar = true;//Bandera para entrar y salir del bucle
        int i = 1;//Se inicializa un contador
        while (entrar) {
            System.out.println("Hola\nAdios");//Escribe la pareja "Hola" y "Adiós"
            //Comprueba si el contador y el numero aleatorio son el mismo para cambiar el valor de la bandera
            if (numAleatorio == i)
                entrar = false;
            i++; 
        }

    }
}
