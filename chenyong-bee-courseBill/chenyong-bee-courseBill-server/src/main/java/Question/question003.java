import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class question003 {

  public static void main(String[] args) {
    String dateTime="2011-12-03";
    String date= LocalDate.parse(dateTime).format(DateTimeFormatter.ISO_DATE_TIME);
    System.out.println(date);
  }

}
