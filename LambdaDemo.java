// @laksys
import static java.lang.System.out;
//Lambdas (essentially concise anonymous inner classes), which are implicitly converted to objects.
//Lambda expression provides implementation of functional interface.
public class LambdaDemo {
	public static void main(String... args) {
		Runnable r = ()->out.println("Hello, World!");
		new Thread(r).start();

		Math m = (a, b) -> {return a*b;};
		out.println( m.calc(10,20)); 

		Test t = (str)->{out.println(str);};
		t.print("laksys");
	}
	// Math is functional interface which contain only one method.
	interface Math {
		int calc( int a, int b);
	}
	// another one functional interface
	interface Test{
		void print(String str);
	}
}
