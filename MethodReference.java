// @laksys
/**
	You use lambda expressions to create anonymous methods. 
	Sometimes, however, a lambda expression does nothing but call an existing method. 
	In those cases, it's often clearer to refer to the existing method by name. 
	Method references enable you to do this; they are compact, easy-to-read 
	lambda expressions for methods that already have a name.

	Instead of using
		AN ANONYMOUS CLASS
	you can use
		A LAMBDA EXPRESSION
	And if this just calls one method, you can use
		A METHOD REFERENCE

	There are four types of method references:

	1) A method reference to a static method.
	2) A method reference to an instance method of an object of a particular type.
	3) A method reference to an instance method of an existing object.
	4) A method reference to a constructor.
*/

import static java.lang.System.out;
import java.util.*;

//@FunctionalInterface 
interface Sayable {
	void say();
}

public class MethodReference {
	public static void saySomething(){
		out.println("this is static method");
	}
	public static void running(){
		out.println("this is running thread...");
	}
	public static void main(String... args) {
		// Referenced to static method
		Sayable s = MethodReference::saySomething;
		s.say();

		//Reference to an instance method of a particular object
		List <Integer> list = Arrays.asList(98, 22, 60, 49, 50);
		MyComparator mc = new MyComparator();
		Collections.sort(list, mc::compare);
		out.println(list);

		//Reference to an Instance Method of an Arbitrary Object of a Particular Type
		List <Person>plist = Arrays.asList( new Person("kandhan"), new Person("perumal"), new Person("balan"));
		plist.forEach(Person::printName);

		//Reference to a Constructor


		new Thread(MethodReference::running).start();
	}	
	static class MyComparator {
		public int compare(Integer a, Integer b){
			return a.compareTo(b);
		}
	}
	static class Person {
		private String name;
		Person(String name){
			this.name = name;
		}
		void printName(){
			out.println(name);
		}
	}
}
