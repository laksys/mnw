// @laksys
// HASHTABLE VS HASHMAP

import static java.lang.System.out;
import java.util.*;

/**	
	java.util.Hashtable class extends java.util.Dictionary implements Map, Cloneable, Serializable.


	There are several differences between HashMap and Hashtable in Java:

	1) Hashtable is synchronized, whereas HashMap is not. 
	This makes HashMap better for non-threaded applications, 
	as unsynchronized Objects typically perform better than synchronized ones.

	2) Hashtable does not allow null keys or values.  
	HashMap allows one null key and any number of null values.

	3) One of HashMap's subclasses is LinkedHashMap, 
	so in the event that you'd want predictable iteration order 
	(which is insertion order by default), you could easily swap out the 
	HashMap for a LinkedHashMap. This wouldn't be as easy if you were using Hashtable.

	Since synchronization is not an issue for you, I'd recommend HashMap. 
	If synchronization becomes an issue, you may also look at ConcurrentHashMap.

								****

	1) HashMap's iterators are NOT fail-safe*. They are fail-fast*. 
	There is a huge difference in meaning between those two terms. 
	2) There is no set operation on a HashMap. 
	3) The put(...) operation won't throw IllegalArgumentException 
	if there was a previous change. 
	4) The fail-fast behaviour of HashMap also occurs if you 
	change a mapping. 
	5) The fail-fast behaviour is guaranteed. 
	(What is not guaranteed is the behaviour of a HashTable 
	if you make a concurrent modification. 
	The actual behaviour is ... unpredictable.)
*/

public class MapTableDemo {
	public static void main(String... args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		//HashMap<Integer, String> ht = new HashMap<>();
		ht.put(1,"Salem");
		ht.put(2,"chennai");
		ht.put(3,"madurai");
		ht.put(4,"coimbatore");
		ht.put(5,"thiruchirapali");

		out.println(ht);
	}
}

/*
	fail-safe: If something is fail-safe, it has been designed so that 
	if one part of it does not work, the whole thing does not become dangerous.

	fail-fast: In systems design, a fail-fast system is one which immediately 
	reports at its interface any condition that is likely to indicate a failure.
	Such designs often check the system's state at several points in an operation, 
	so any failures can be detected early.
*/