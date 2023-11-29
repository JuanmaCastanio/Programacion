
package Ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class MuestraFecha {
    public static void main(String[] args) {
        Date hoy = new Date();
        System.out.println(hoy);
        
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
}
