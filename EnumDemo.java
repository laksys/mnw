// @laksys
/**
	An enum type is a special data type that enables for a variable 
	to be a set of predefined constants. 

	A Java Enum is a special Java type used to define collections of constants. 
	More precisely, a Java enum type is a special kind of Java class. 
	An enum can contain constants, methods etc. Java enums were added in Java 5. 

*/
import static java.lang.System.out;
import java.util.*;

enum Day {  
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}  
public class EnumDemo {
	public static void main(String... args) {
		//EnumSet class is the specialized Set implementation for use with enum types. 
		for (Day d : EnumSet.range(Day.MONDAY, Day.FRIDAY))
			out.println(d);
	}
}
