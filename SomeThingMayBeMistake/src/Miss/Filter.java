//package Miss;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Filter {
	public static void main(String[]args) {
		Console cons=System.console();
		String str = cons.readLine("%s", "Your File: ");
		Path path = Paths.get(str);
		List <String> list=null;
		try(BufferedReader f= Files.newBufferedReader(path);) {
			f.lines().forEach(System.out::print);;
			System.out.println("The numbers of Female is "+f.lines().map(i->i.split(" ")).filter(i->i[4].equals("Female")).count());
			System.out.println("The numbers of male is "+f.lines().filter(i->i.contains("male")).count());
		} catch (IOException e) {
			System.out.println("File not Found!");
		}
	}

}
