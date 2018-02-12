// @laksys
import static java.lang.System.out;
import java.util.*;
/**
	Java Developers decide Strings are immutable due to the following aspect 
	design, efficiency, and security.

	String is immutable for several reasons, here is a summary:

		* Security: parameters are typically represented as String in network connections, 
		database connection urls, usernames/passwords etc. If it were mutable, these 
		parameters could be easily changed.
	
		* Synchronization and concurrency: making String immutable automatically makes 
		them thread safe thereby solving the synchronization issues.
		
		* Caching: when compiler optimizes your String objects, it sees that if two objects 
		have same value (a="test", and b="test") and thus you need only one string object (
		for both a and b, these two will point to the same object).
		
		* Class loading: String is used as arguments for class loading. If mutable, it could 
		result in wrong class being loaded (because mutable objects change their state).


		String was made 'final' so that no one can compromise invariant of String class 
		e.g. Immutability, Caching, hashcode calculation etc by extending and overriding behaviors.
*/
public class StringDemo {
	public static void main(String... args) {	
		
		String s1 = "ibm";
		String s2 = "ibm";

		out.println(s1.hashCode() + ":" + s2.hashCode());
		out.println( s1.equals(s2) ? "s1 and s2 equal" : "s1 and s2 unequal");
		out.println( s1 == s2 ? "s1 and s2 equal" : "s1 and s2 unequal");

		String s3 = new String("ibm");
		String s4 = new String("ibm");
		
		out.println(s3.hashCode() + ":" + s4.hashCode());
		out.println( s3.equals(s4) ? "s3 and s4 equal" : "s3 and s4 unequal");
		out.println( s3 == s4 ? "s3 and s4 equal" : "s3 and s4 unequal");

		/**
			Why does StringBuffer/StringBuilder not override equals or hashCode?

			Because StringBuffer is mutable, and its primary use is for constructing strings. 
			If you want to compare content, call StringBuffer#toString() and compare the returned value.

			It is not generally useful to override hashCode() for mutable objects, 
			since modifying such an object that is used as a key in a HashMap could 
			cause the stored value to be "lost."
		*/
		StringBuffer s5 = new StringBuffer("ibm");
		StringBuffer s6 = new StringBuffer("ibm");

		out.println(s5.hashCode() + ":" + s6.hashCode());
		out.println( s5.equals(s6) ? "s5 and s6 equal" : "s5 and s6 unequal");
		out.println( s5 == s6 ? "s5 and s6 equal" : "s5 and s6 unequal");

		StringBuilder s7 = new StringBuilder("ibm");
		StringBuilder s8 = new StringBuilder("ibm");

		out.println(s7.hashCode() + ":" + s8.hashCode());
		out.println( s7.equals(s8) ? "s7 and s8 equal" : "s7 and s8 unequal");
		out.println( s7 == s8 ? "s7 and s8 equal" : "s7 and s8 unequal");

		StringBuilder sb1 = new StringBuilder("cat");
		StringBuilder sb2 = new StringBuilder("cat");

		HashMap <StringBuilder, String>map = new HashMap<>();

		//map.put(s1,"hello");
		//map.put(s2,"world");

		map.put(sb1, "hello");
		map.put(sb2, "world");

		out.println(map);
	}
}