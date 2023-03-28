import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoData{

    public static void main(String[] args) {

        // Classe para formatar uma data a partir de um texto personalizado
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        LocalDate d01 = LocalDate.now();    // Data
        LocalDateTime d02 = LocalDateTime.now();    // Data e hora local
        Instant d03 = Instant.now();    // Data e hora global, possui fuso horário (por padrão utiliza o de londres/green which)

        LocalDate d04 = LocalDate.parse("2022-03-25");
        LocalDateTime d05 = LocalDateTime.parse("2022-03-25T19:30:01");
        Instant d06 = Instant.parse("2022-03-25T19:30:01Z");
        Instant d07 = Instant.parse("2022-03-25T19:30:01-03:00");

        // Graças ao objeto fmt1 instanciado da classe DateTimeFormatter, 
        //é possível passar o texto de dia/mes/ano como parametro para o localDate
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        //LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
    }
}