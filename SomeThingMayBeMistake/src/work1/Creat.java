package work1;

import java.io.Closeable;
import java.io.IOException;

public class Creat {
	public static void main(String[]ars) {
		try(A a=new A();
				B b=new B()){
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getSuppressed().length);
			//throw e;//NG throwableではないので
		}
		finally {
			System.out.println("Compeleted!");
			
		}
		
		
		try(C c=new C();
				D d=new D()){
			
		}
		catch( RuntimeException e) {
			System.out.println(e.getMessage());
			//e=new RuntimeException();//ok
			e=new ArrayIndexOutOfBoundsException();
			//leave it blank OK
			throw e;//rethrowされる
		}
		finally {
			
		}
	}
	
}

class A implements AutoCloseable{
	@Override
	public void close() throws Exception{
		System.out.println("A is closed!");
		throw new Exception("Catching A!");
	}
	
}

class B implements Closeable{
	@Override
	public void close() throws IOException{
		System.out.println("B is closed!");
		throw new IOException("Catching B!");
	}
}

class C implements AutoCloseable{
	@Override
	public void close() throws RuntimeException{
		
	}
}

class D implements Closeable{
	@Override
	public void close() throws RuntimeException{
		System.out.println("Catching D!");
		throw new RuntimeException("Ex D!");
	}
}
