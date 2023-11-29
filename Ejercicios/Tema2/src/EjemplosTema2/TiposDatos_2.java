package EjemplosTema2;

//Ejemplos de asignación entre variables

public class TiposDatos_2 {
    public static void main(String[] args) {
        
        //Variables de tipo entero
        int i1 = 0;
        int i2 = 125;
        byte b1 = 0;
        long l1 = 0;
        //Meto el valor de b1 en i2
        i2 = b1;
        System.out.println(i2);
        b1 = (byte) i1;
    
        i2 = (int) l1;
        //Variables tipo real
        float f1 = 0.0f;
        double d1 = 0.0;
        f1 = (float) d1;

        d1 = i2;

        i1 = (int) d1;

        double nota = 3.25;
        int notaTruncada = (int) nota;
        System.out.println(notaTruncada);
        //nota = "hola"; --> No casting por tipos incompatibles

        String cp = "47007";
        int cpNumerico = 47007;

        //cp = cpNumerico;

        int codigo;
        char grupo = 'B';
        codigo = grupo;
        System.out.println(codigo);

        grupo = 90;//Asigno a la variable char el valor numérico ASCII de 90
        System.out.println(grupo);

        //Escape de caracteres (\)
        System.out.println("\thola");
        System.out.println("hola");

        //Mostramos por consola el texto "Para introducir un tabulador usa \t"
        System.out.println("Para introducir una tabulador usa \\t");

        //Declaramos constantes
        final int MESES = 12;

        

    }
}
