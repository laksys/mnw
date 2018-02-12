// @laksys
import static java.lang.System.out;
/**
	Nested classes are two types
		1. static (static nested classes)
		2. non-static (inner classes)

	Why Use Nested Classes?
		* It is a way of logically grouping classes that are only used in one place
		* It increases encapsulation
		* It can lead to more readable and maintainable code

	Local classes are classes that are defined in a block, which is a group of zero 
	or more statements between balanced braces. You typically find local classes 
	defined in the body of a method.

	Anonymous classes enable you to make your code more concise. 
	They enable you to declare and instantiate a class at the same time. 
	They are like local classes except that they do not have a name. 
	Use them if you need to use a local class only once.

*/
class Outer{
	private int num = 99;
	class Inner {
		void aMethod(){
			out.println(num);
		}
	}
	void bMethod(){
		new Inner().aMethod();
	}
}

class Cycle implements Cloneable{
	public Cycle(){
		out.println("--------CONSTRUCTING CYCLE---------");
	}
	public Cycle(Cycle c){
		c = this;
	}
}
public class ClassesAndObjects {	
	public static void main(String... args) {
		out.println("begin...");
		
		Outer outer = new Outer();
		Outer.Inner obj = outer.new Inner();
		obj.aMethod();

		outer.bMethod();
		out.println("ends...");		
	
		//There are many different ways to create instance
		//1. Using 'new'
		Cycle c1 = new Cycle();

		//2. Using Class.forName
		try {
			Cycle c2 = (Cycle)Class.forName("Cycle").newInstance();
		} catch (ClassNotFoundException exp){
			out.println(exp.getMessage());
		} catch (InstantiationException exp){
			out.println(exp.getMessage());
		} catch (IllegalAccessException exp){
			out.println(exp.getMessage());
		}
		
		//3. Using clone.
		Cycle c3 = (Cycle)(c1.clone());

		//4. Deserialization
	}
}