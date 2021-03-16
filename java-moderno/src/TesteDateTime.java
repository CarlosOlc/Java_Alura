import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class TesteDateTime {

	public static void main(String[] args) {
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		LocalDate teste = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(teste);
	
		Period periodo = Period.between(agora, teste);
		System.out.println(periodo);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatter.format(teste));
	}

}
