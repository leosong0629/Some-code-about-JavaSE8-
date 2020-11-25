package Miss;

import java.nio.file.Path;
import java.nio.file.Paths;

public class miss7 {
	public static void main(String[]args) {
		Path path1=Paths.get("/x/y/A");
		Path path2=Paths.get("/A/B/c.txt");
		Path one=Paths.get("/A/C");
		Path two=Paths.get("/A");
		Path path3=path1.relativize(path2);//パスの起点が異なるのでpath1を全部../（..\）に転換する、両方のどちらが絶対パスじゃないとjava.lang.IllegalArgumentException
		System.out.println(path3);
		System.out.println(path1.resolve(path2));
		System.out.println(path2.relativize(one));//共有していない/B/c.txtを../../で表示
		System.out.println(one.relativize(path2));//共有していない部分/Cを../で表示
		System.out.println(two.relativize(one));//Cで表示
	}

}
