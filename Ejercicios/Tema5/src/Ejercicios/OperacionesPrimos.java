package Ejercicios;

public class OperacionesPrimos {
    public boolean esPrimo(int numero){
        for(int div = 2;div <= numero / 2;div++){
        if(numero % div == 0){
            return false;
        }
        }
        return true;
    }

    public void cienPrimerosPrimos(){
        OperacionesPrimos primo = new OperacionesPrimos();
        int contPrimos = 0;
        for (int numero = 0; contPrimos <= 100; numero++) {
            if(primo.esPrimo(numero)){
                if(contPrimos == 100){
                   System.out.print(numero );
                    contPrimos++; 
                }
                else{
                    System.out.print(numero + ", ");
                    contPrimos++;
                }
            }    
        }
    }
}
