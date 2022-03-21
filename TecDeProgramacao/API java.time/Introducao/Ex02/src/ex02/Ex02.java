package ex02;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex02 {

    public static void main(String[] args) {
        LocalDateTime dataTimPortugual = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Portugal"));
        System.out.println("Data e Hora de Portugal-> " + dataTimPortugual);
    }
    
}
