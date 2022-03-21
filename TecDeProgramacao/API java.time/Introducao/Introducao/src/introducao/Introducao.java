package introducao;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Introducao {

    public static void main(String[] args) {
//        System.out.println("LocalDate.now: "+ LocalDate.now());
//        System.out.println("LocaTime " + LocalTime.now()); 
//        System.out.println("ZonedDateTime.now: " + ZonedDateTime.now());
//        System.out.println("Offsettime " + OffsetTime.now()); // mostra horario e adiferença de fuso horario
//        System.out.println("OffSetDateTime: " + OffsetDateTime.now());
//        System.out.println("Zoneld: " + ZoneId.SHORT_IDS);
//        System.out.println("ChronoUnit: " + ChronoUnit.WEEKS);
//        System.out.println("");
//        System.out.println("");

//         LocalDateTime localDateTime = LocalDateTime.now();
//         ZoneOffset offset = ZoneOffset.of("+09:00");
//         OffsetDateTime offSetByTwo = OffsetDateTime.of(localDateTime, offset);
//
//        System.out.println("ZoneOffSet: " + offset);
//        System.out.println("offSetByTwo:" + offSetByTwo);
//        
//        
//    LocalDate agora = LocalDate.now();
//    LocalDate primeiroDiaDoMes = agora.with(TemporalAdjusters.firstDayOfNextMonth());
//    
//    long diffDays = primeiroDiaDoMes.until(agora, ChronoUnit.DAYS);
//    
//        System.out.println("primeiro dia do mes: " + primeiroDiaDoMes);
//        System.out.println("");
//        System.out.println(" diferrenca de dias " + diffDays);
//        System.out.println("------------");
//    LocalDate primeiroDiaDoMes2 = agora.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));    
//        System.out.println("" + primeiroDiaDoMes2);
//    LocalDate primeiroDiaDoMes3 = agora.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));  
//        System.out.println("" + primeiroDiaDoMes3);
      //  LocalDate primeiroDiaDoMes4 = agora.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
       // System.out.println("" + primeiroDiaDoMes4);

        LocalDateTime nasc = LocalDateTime.of(1982, Month.SEPTEMBER, 8, 17, 30);
        long horasAteHoje = nasc.until(LocalDateTime.now(), ChronoUnit.HOURS);
        System.out.println(" Horas até hoje: " + horasAteHoje);

    }

}
