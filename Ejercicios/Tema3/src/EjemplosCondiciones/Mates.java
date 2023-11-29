package EjemplosCondiciones;


public class Mates {
    public static void main(String[] args) {
        /*double base = 5;
        double exp = 7;
        System.out.println("Resultado: " + Math.pow(base,exp));
        System.out.println(Math.random());*/
        while (true) {
            //Generamos aleatorios entre [0,1)
            /*double aleatorio = Math.random();
            System.out.println(aleatorio);*/
            //Generamos aleatorios entre (0,9)
            int aleatorio =(int) (Math.random() * (50 - 10 + 1)  + 10);
            System.out.println(aleatorio);
        }
    }
}
