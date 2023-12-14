package Ejercicios;

public class Utilidades {
    public double conversorCelsiusFarenheit(double gradosCelsius){
        return (9 / (double)5) * gradosCelsius + 32;
    }
    public int divisorMasGrande(int numero){
        int div = 2, divMax = 1; //Divisor actual y divisor más grande
        do {
        if(numero % div == 0){
            divMax = div;
        }
        div++;
        } while (div <= numero / 2);
        return divMax;
    }
    public boolean comprobarPar(int numero){
        if(numero % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
