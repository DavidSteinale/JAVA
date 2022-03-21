package ex03;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Ex03 {

    public static void main(String[] args) {
        ZoneOffset zoneOffSet = ZoneOffset.of("-02:00");      
        OffsetDateTime data = OffsetDateTime.now(zoneOffSet);
        System.out.println("Data e horario do fuso -02:00: " + data);
    }

}
