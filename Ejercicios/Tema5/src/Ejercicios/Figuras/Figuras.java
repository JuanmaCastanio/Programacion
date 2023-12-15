package Ejercicios.Figuras;

public class Figuras {
    public double areaCirculo(double radio){
        return Math.PI * Math.pow(radio, 2);
    }
    public double areaCuadrado(double lado){
        return Math.pow(lado, 2);
    }
    public double areaRectangulo(double altura, double base){
        return altura * base;
    }
    public double areaTriangulo(double altura, double base){
        return (base * altura) / 2;
    }
    public boolean validarNegativos(double numero){
        if(numero >= 0){
            return false;
        }
        else{
            return true;
        }
    }

}
