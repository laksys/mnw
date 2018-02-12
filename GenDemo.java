//@laksys

/**
	Generics are a facility of generic programming that were added 
	to the Java version J2SE 5.0. They were designed to extend 
	Java's type system to allow "a class(type) or method to operate on 
	objects of various types while providing compile-time type safety".

	Generics allow you to abstract over types. 
	The most common examples are container types, 
	such as those in the Collections hierarchy.

	Generics are one of the most controversial Java language features. 
	Generics allows a type or method to operate on objects of various 
	types while providing compile-time type safety, making Java a fully 
	statically typed language.

	Important Points about Java Generics:
	
		1) Generics are implemented using Type Erasure
		2) Generics does not support sub-typing
		3) You can't create Generic Arrays 
		4) Use of wildcards with extends/super to increase API flexibility
		5) Use of Multiple Bounds

	What is not allowed to do with Generics?

		1) You can not create an instance of T
		2) Generics are not compatible with primitives in declarations
		3) You can’t create Generic exception class
		4) You can’t have static field of type


	In the heart of generics is “type safety“. What exactly is type safety? 
	It’s just a guarantee by compiler that if correct Types are used 
	in correct places then there should not be any ClassCastException 
	in runtime

	Another important term in java generics is “type erasure“. 
	It essentially means that all the extra information added using 
	generics into sourcecode will be removed from bytecode generated 
	from it. Inside bytecode, it will be old java syntax which you 
	will get if you don’t use generics at all. This necessarily 
	helps in generating and executing code written prior java 5 
	when generics were not added in language.

	“Java Generics” is a technical term denoting a set of language 
	features related to the definition and use of generic 
	types and methods. In java, Generic types or methods differ 
	from regular types and methods in that they have type parameters.

	“Java Generics are a language feature that allows for 
	definition and use of generic types and methods.”

	Generic types are instantiated to form parameterized types by 
	providing actual type arguments that replace the formal type 
	parameters. A class like LinkedList<E> is a generic type, that 
	has a type parameter E . Instantiations, such as LinkedList<Integer> 
	or a LinkedList<String>, are called parameterized types, 
	and String and Integer are the respective actual type arguments.
*/

import static java.lang.System.out;
import java.util.*;

class Box<T>{
	T data;
	//static T cnt; // not ok
	//T arr[] = new T[10];
	public void put(T data){
		this.data = data;
	}
	public T get(){
		return data;
	}
}
public class GenDemo {
	public static void main(String... args) {
		out.println("-----------------------------------\nbegin...");
		
		List <Integer> ints = Arrays.asList(1,2,3);
		int x = ints.get(1);
		out.println(x);

		Box<Integer> b = new Box<>();
		b.put(12);
		out.println(b.get());

		List <String> str = new ArrayList<>();
		//List <Object> obj = str; // not ok

		// unbounded 
		List <?> intList = new ArrayList<Integer>();
		intList = new ArrayList<Double>();

		out.println("ends...");
	}
}