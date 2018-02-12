// @laksys
import static java.lang.System.out;
import java.io.*;
import java.util.*;

/**
    switch on String.
    Binary Literals with prefix "0b"
    Underscore for Numeric Literals.
    Catching Multiple Exception Types.
    The try -with-resources Statement.
    Type Inference for Generic Instance Creation.
*/
public class Java7Demo {
	public static void main(String... args) {
		// Binary Literals with prefix '0b'
		int x = 0b1000; 
		out.println(x); // 8

		// Underscore for Numeric Literals.
		int y = 1_000; 
		out.println(y); // 1000

		//switch on String. 
		String day = "MON";
		switch(day){
			case "MON": out.println("Monday"); break;
			default: out.println("Other than monday");
		}
		//Type Inference for Generic Instance Creation.
		//Pre-JDK 7
		List<String> lst1 = new ArrayList<String>();
		//JDK 7 supports limited type inference for generic instance creation
		List<String> lst2 = new ArrayList<>();

		//The try with resource statement
		try (BufferedReader in  = new BufferedReader(new FileReader("in.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"))) {
			int charRead;
			while ((charRead = in.read()) != -1) {
				System.out.printf("%c ", (char)charRead);
				out.write(charRead);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
