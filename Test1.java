// @laksys
import static java.lang.System.out;

import java.net.*;
import java.io.*;

public class Test1 {
	public static void main(String... args) throws Exception {	
		out.println("starts...");
			
		File file = new File("c:/nclt/pdf/1.pdf");
		if( file.exists())
			out.println("exists...");

		out.println(file.getName());

		out.println("ends...");
	}
}