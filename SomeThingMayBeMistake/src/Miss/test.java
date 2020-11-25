//package Miss;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class test {
	public static void main(String[]args) {
		LocalTime lt=LocalTime.now();
		int hour=lt.getHour();
		WeekFields week=WeekFields.of(Locale.getDefault());
		TemporalField weeks=week.weekOfMonth();
		int weeknum=ZonedDateTime.now().get(weeks);
		String weekday=LocalDate.now().getDayOfWeek().toString();


		if(weeknum==3&&hour<=6&&hour>=5&&weekday.equals("THURSDAY")) {
			System.out.println(hour+ " Maintenance Time!Can't acess");
			for(int j=0;j<5;j++) {
				System.out.print("* ");
				try {
				Thread.sleep(1000);
				}catch(InterruptedException e) {
					System.out.println();
					System.out.println("Error!");
				}
			}
			System.out.println();
			System.out.println("System shutdow!");
			return;
		}

		Console con=System.console();
		String s=null;
		char[] c=null;
		String path=null;

		s=con.readLine("%s","YOUR NAME : " );
		c=con.readPassword("%s", "YOUR PASSWORD: ");
		path=con.readLine("%s","Path : ");

		Path p=Paths.get(path);
		Path p0=Paths.get("LIAO.log");
		Path pz=p.resolve(p0);
		Path p1=null;
		try {
			p1=Files.createFile(pz);
		} catch (IOException e) {

			System.out.println("can't creat the file!");
		}

		try(BufferedWriter br
				=Files.newBufferedWriter(pz)){
			br.write("["+LocalDateTime.now().toString()+"] :"+s+" "+c);
			br.flush();

		} catch (IOException e) {

			e.printStackTrace();
		}


	}

}
