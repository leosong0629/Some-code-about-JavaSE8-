
//package Miss;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class makeData {
	public static void main(String[] args) throws IOException {
		Console con = System.console();
		String a = con.readLine("%s", "How many data do you want: ");
		String b = con.readLine("%s", "Path : ");

		int num = Integer.parseInt(a);
		Path p = Files.createFile(Paths.get(b, "data.txt"));

		try (BufferedWriter wr = Files.newBufferedWriter(p)) {
			for (int i = 0; i < num; i++) {
				wr.write("[" + LocalDateTime.now().toString() + "] ");
				int q = (int) (Math.random() * 10000000);
				String gen = Math.random()<0.5?"Male":"Female";
				wr.write(" ID: " + q + " "+"Gender: "+gen);
				wr.newLine();

			}
				wr.flush();
				System.out.println("file complete!");

		} catch (IOException e) {
			System.out.println("Fail to creat file!");
		}
	}
}
