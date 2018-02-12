// @laksys
/**
	The wildcards introduce restrictions in how the collection can be used.		

	PECS - A producer is allowed to produce something more specific, hence extends, 
	a consumer is allowed to accept something more general, hence super. 

	"PECS" is from the collection's point of view. 
	If you are only pulling items from a generic collection, it is a producer 
	and you should use extends; 
	if you are only stuffing items in, it is a consumer and you should use super. 
	If you do both with the same collection, you shouldn't use either extends or super.
	--------------------------------------------------------------	
	Difference between 'super' and 'extends'	

	It depends which way on the inheritance hierarchy it allows. 
	Assume you have a class "Child" which inherits from "Parent" 
	which inherits from "Grandparent".

	<T extends Parent> accepts either Parent or Child 
	while <T super Parent> accepts either Parent or Grandparent.
	------------------------------------------------------------
	Covaraince - Enables you to use a more derived type than 
	originally specified. 
	
	Contravariance - Enables you to use a more generic (less derived)
	type than originally specified. 
	
	Invariance - Means that you can use only the type originally 
	specified; so an invariant generic type parameter is neither 
	covariant nor contravariant. 
*/
import static java.lang.System.out;
import java.util.*;

public class SuperExtendsDemo {
	public static void main(String... args) {	
		
		List <Integer> ilist = new ArrayList<>();		
		ilist.add(new Integer(10));
		ilist.add(new Integer(99));
		doSomething( ilist);

		List <Double> dlist = new ArrayList<>();		
		dlist.add(new Double(1.0));
		dlist.add(new Double(9.9));
		doSomething( dlist);

		List <String> slist = new ArrayList<>();
		slist.add("mettur");
		slist.add("chennai");
		//doSomething(slist); // cant compile

		out.println("-------------------");

		List <? super Number> nlist = new ArrayList<>();
		something(nlist);
		out.println(nlist);				

		List <? extends Number>foo1 = new ArrayList<Integer>();
		List <? extends Number>foo2 = new ArrayList<Double>();

		foo1 = dlist;
		out.println(foo1);
	}
	//It can't add new elements to the list. 
	public static void doSomething(List <? extends Number> list){
		// can't do this like: list.add(new Integer(99));
		for(Number num: list)
			out.println(num);
	}
	public static void something(List <? super Number> list){
		list.add(1);
		list.add(1.2);
		list.add(99l);
		list.add(9.1f);
	}
}

class GrandParent {}
class Parent extends GrandParent {}
class Child extends Parent {}

