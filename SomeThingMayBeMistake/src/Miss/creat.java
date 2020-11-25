package Miss;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class creat {
	public static void main(String[]args) {
		try {
			Files.createFile(Paths.get(""));
		} catch (IOException e) {
			System.out.println("Fail!");
		}
	}

}
