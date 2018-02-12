// java compiler (javac/jvm) warning demo
// compile this code with [-Xlint -version -X] options

import static java.lang.System.out;
import java.util.Vector;

public class CompilerWarningDemo {
	public static void main(String... args) throws Exception {
		out.println("------ Output --------");
		
		// 1 warning: redundant cast to string
		String str = (String) "Hello";

		// 2 warning: division by zerio
		int num = 34 / 1;		
		
		// 3 warning: empty statement after if
		if( num < 0 ); 

		// 4 warning: found raw type
		Vector v = new Vector();

		// 5 
		new CompilerWarningDemo().aMethod();
		out.println("str");
	}
	/** @deprecated reason for why it was deprecated */
	@Deprecated
	public void aMethod(){
		out.println("This is aMethod...");
	}
}