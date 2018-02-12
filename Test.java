import static java.lang.System.out;

class Box<T> {
}

public class Test {	
	public static <T extends Number & Comparable<T>> T max(T []arr) {
		T  m = arr[0];
		for(T t : arr)
			if( t.compareTo(m) > 0)
				m = t;
		return m;
	}
	
	public static void boxTest(Box<Number> n){
		out.println( n);
	}
	
	public static void main(String... args) {
		out.println("------------------------results-----------------------------");
		Double a[] = { 23., 10., 89., 18., .34};
		out.println( max(a));

		boxTest(new Box<Number>());		
		out.println( add( new Integer(234), new Integer(11)));
	}

	public static <T extends Number> T add( T a, T b) {
		T ans;
		if( a instanceof Integer) {
			int ia = (Integer)a;
			int ib = (Integer)b;
			ans = (T)(new Integer(ia + ib));
			return ans;
		}
		return null;
	}
}