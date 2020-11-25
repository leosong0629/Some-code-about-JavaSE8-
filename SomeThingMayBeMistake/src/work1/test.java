package work1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class test {
	public static void main(String[]args) throws IOException {
		File file=new File("test.txt");
		System.out.println(file.toURI());
		String p=file.getPath();
		System.out.println(p);
		System.out.println(file.exists());
		Path p1=Paths.get("test.txt");
		System.out.println(p1.isAbsolute());
		System.out.println(p1.toAbsolutePath());
		System.out.println(p1.endsWith("t"));
	System.out.println();
		final Path path=Paths.get(".").toAbsolutePath();
		Files.find(path, 10,(a,b)->a.toString().length()>8).forEach((i)->System.out.println("find: "+i));
		System.out.println("Path:"+path+path.getNameCount()+path.toAbsolutePath());
		
		Path path1=Paths.get("/A/B./C/", "../D");
		Path path10=Paths.get("/A/B././C/../D");
		System.out.println(path1);
		Path path2=Paths.get("E");
		Path path3=Paths.get("/F");
		Path path4=Paths.get("");
		Path path5=Paths.get("../D");
		System.out.println("resolve :"+path1.resolve(path2)+" "+"resolveblling :"+path1.resolveSibling(path2));
		System.out.println("resolve :"+path1.resolve(path3)+" "+"resolveblling :"+path1.resolveSibling(path3));
		System.out.println("resolve :"+path1.resolve(path4)+" "+"resolveblling :"+path1.resolveSibling(path4));
		System.out.println(path1.normalize());
		System.out.println(Paths.get("/a/b/").relativize(Paths.get("/E/F")));//絶対パスが必要
		System.out.println(path10.normalize());
		System.out.println(path1.normalize().equals(path10.normalize()));
		System.out.println(path1.toAbsolutePath());
		System.out.println(path10.toAbsolutePath());
		System.out.println(Instant.now());
		System.out.println(OffsetDateTime.now().toInstant());
		System.out.println(ZonedDateTime.now(ZoneId.of("Australia/Sydney")));
	}

}
