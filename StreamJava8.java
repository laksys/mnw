// java8 stream demo
import static java.lang.System.out;

import java.util.*;
import java.util.stream.*;
import java.lang.reflect.*;

class Point {
	private int x=44, y=88;
	int z=99;
}
public class  StreamJava8{
	public static void main(String... args) throws Exception {
		Info.getInfo();
		List <String>list = Arrays.asList("a1", "a2", "b1", "c1", "a3", "c2", "a4","c3","b2");
		ArrayList <String> alist = new ArrayList<>(Arrays.asList("abc","bbc"));
		
		list.stream()
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::print);
		
		//Full Access to Private Attributes and Methods
		Point point = new Point();
		Field field = point.getClass().getDeclaredField("x");
		field.setAccessible(true);
		out.println( field.get(point));
	}
}