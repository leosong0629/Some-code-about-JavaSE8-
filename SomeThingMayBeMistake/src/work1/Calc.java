package work1;
	
public class Calc {
	static Integer num1,num2;
		public static void main(String[]args) {
		Integer r;
		num1=5;
		//r=num1+Calc.num2;
		//r=num1+num2;
		//System.out.println(r);
		System.out.println(num1);
		Boolean b1=Boolean.parseBoolean(null);
		Boolean b2=null;
		Boolean b3=Boolean.valueOf("TrUe");
		//boolean b4=null;/NG
		boolean b5=Boolean.parseBoolean(null);
		boolean b6=Boolean.parseBoolean("TruE");
		boolean b7=Boolean.valueOf("TruE");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println((b1=b3)&&b6);
		System.out.println(b1&&b6);
		System.out.println((b5=b6)&&b7);
		System.out.println(b5&&b7);
		System.out.println(b2=b5&&b7);
	}
}
