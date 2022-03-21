package ex04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Ex04 {

    public static void main(String[] args) {
        ZoneOffset zoneOffSet = ZoneOffset.of("-03:00");
        LocalDateTime agora = LocalDateTime.now(zoneOffSet);

        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("HH:mm:ss dd MMMM YYYY");
        String ajustado = agora.format(formatacao);
        
        System.out.println(ajustado + " (Fuso" + zoneOffSet + ")");

    }
}
