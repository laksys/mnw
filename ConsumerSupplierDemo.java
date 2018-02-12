//https://blog.idrsolutions.com/2015/03/java-8-consumer-supplier-explained-in-5-minutes/
//https://dzone.com/articles/supplier-and-consumer-interface-in-java8

// @laksys
//The interface java.util.function.Consumer / Supplier demo
/**
	Interface Consumer<T>
	---------------------
	This is a functional interface and can therefore be used as the 
	assignment target for a lambda expression or method reference.
	
	Represents an operation that accepts a single input argument 
	and returns no result. Unlike most other functional interfaces, 
	Consumer is expected to operate via side-effects.

	This is a functional interface whose functional method is 
	accept(Object).

	Interface Supplier<T>
	---------------------
	This is a functional interface and can therefore be used as the 
	assignment target for a lambda expression or method reference.
	
	There is no requirement that a new or distinct result be returned 
	each time the supplier is invoked.

	Since it is a functional interface it has functional method called get().

	The supplier does the opposite of the consumer, so it takes no arguments 
	but it returns some value by calling its get() method.
*/
import static java.lang.System.out;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplierDemo {
	public static void main(String... args) {
		out.println("Hello World!");

		Consumer <Integer> con = (i)->out.print(i);
		Consumer <Integer> cat = con.andThen (i->out.print("-----"));

		List <Integer> i = Arrays.asList(new Integer(297), new Integer(234), new Integer(123), new Integer(400));
		print(i,cat);

		cat.accept(i.get(0));
		cat.accept(i.get(1));

		Consumer <String>consumer = ConsumerDemo::printName;
		consumer.accept("laksys");
		consumer.accept("king");
		consumer.accept("metturdam");

		//supplier
		List <String>names = new ArrayList<>();
		names.add("uma");
		names.add("venmathi");
		names.add("ishwarya");
		//Supplier <String> s = (x)-> pn( ()->x);
		//names.stream().forEach(s);
		//combine above 2 lines into single
		names.stream().forEach(x->pn( ()->x ));
		
	}	
	static void print(List<Integer> list, Consumer<Integer> con){
		for(Integer ele: list)
			con.accept(ele);
	}
	static void printName(String name){
		out.println(name);
	}
	static void pn(Supplier<String> arg){
		out.println(arg.get());
	}
}