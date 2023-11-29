package EjerciciosFechasNuevas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Fecha3 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

        System.out.print("Introduce una cantida de sgundos: ");
        int segundos = dato.nextInt();

        System.out.println(formato.format(LocalDateTime.now().plusSeconds(segundos)));
    }
}
