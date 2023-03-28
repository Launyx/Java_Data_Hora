import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {
    public static void main(String[] args) {
        // Data hora são objetos imutaveis em java, necessario criar outro objeto para obter valor diferente

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        // Instant n tem minus/plus de dias, mes e anos, utiliza .plus(quantidade, unidade de tempo)
        // Chronounit é uma classe de unidade de tempo, neste caso é instanciado um objeto
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate );

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // Não é possivel pegar duração entre LocalDate pois não tem hora/minutos
        // .attime(hora, minuto) para converter LocalDate para LocalDateTime
        //Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        
        // Também calcula datas do passado para o futuro
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());



    }
}
