package Miss;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class weekkk {
	public static void main(String[]args) {
		WeekFields wk=WeekFields.of(Locale.getDefault());
		int i=ZonedDateTime.now().get(wk.weekOfMonth());
		String weekday=LocalDate.now().getDayOfWeek().toString();
		System.out.println(i);
		System.out.println(weekday);
	}

}
