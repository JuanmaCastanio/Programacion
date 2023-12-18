package Ejercicios;

import java.util.Scanner;

public class MayorDe3 {
   /**
    * elMayor
    * compara dos numeros entero y devuelve el mayor de ellos
    * @param num1 Primer número
    * @param num2 Segundo número
    * @return El número mayor de los dos
    */
   public int elMayor(int num1, int num2){
        //Si el primer número es mayor o igual al segundo, devuelve el primero
        if (num1 >= num2) {
            return num1;
        }
        else{
            return num2;
        }
    } 
    /**
     * elMayor
     * compara tres numeros entero y devuelve el mayor de ellos
     * @param num1 Primer número
     * @param num2 Segundo número
     * @param num3 Tercer número
     * @return El número mayor de los tres
     */
    public int elMayor(int num1, int num2, int num3){
        //Si el mayor entre el primero y el segundo es mayor o igual al tercero, devuelve el mayor entre el primero y el segundo
        if(elMayor(num1, num2) >= num3){
            return elMayor(num1, num2);
        }
        else{
            return num3;
        }
    }
    public static void main(String[] args) {
        Scanner dato =  new Scanner(System.in);
        MayorDe3 comparador =  new MayorDe3();
        System.out.print("Introduce el primer número: ");
        int num1 = dato.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = dato.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = dato.nextInt();
        System.out.println("El número mayor es: " + comparador.elMayor(num1, num2, num3));
   } 
}
