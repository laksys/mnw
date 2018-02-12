// @laksys
import static java.lang.System.out;
import java.util.*;

public class CollectionDemo {
	public static void main(String... args) {
		//It inherits Dictionary class and implements the Map interface.	
		Hashtable <Integer, String> ht = new Hashtable<>();
		
		ht.put(101, "bbc");
		ht.put(102, "mnw");
		ht.put(103, "def");
		ht.put(104, "null");

		
		//list key only
		for(int temp: ht.keySet())
			out.println(temp);

		//list value only
		for(String temp: ht.values())
			out.println(temp);

		//list both
		//Map.Entry is a key and its value combined into one class.
		for(Map.Entry<Integer, String> m: ht.entrySet())
			out.println(m.getKey() +" : " + m.getValue());

		List <String>list = new ArrayList<>(); list.add("salem"); list.add("chennai"); list.add("madurai"); 
		list.add("trichy"); list.add("coimbatore");

		//public synchronized void forEach(java.util.function.BiConsumer<? super K, ? super V>);
		list.forEach(out::println);
	}
}
