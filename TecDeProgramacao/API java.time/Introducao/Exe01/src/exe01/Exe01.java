package exe01;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Exe01 {

    public static void main(String[] args) {
        LocalDateTime nasc = LocalDateTime.of(1982, Month.SEPTEMBER, 8, 17, 30);
        long horasAteHoje = nasc.until(LocalDateTime.now(), ChronoUnit.HOURS);
        System.out.println(" Horas vivo até hoje: " + horasAteHoje);
    }
}
