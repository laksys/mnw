// @laksys
import static java.lang.System.out;

public class Basics {
	//static block
	static {
		out.println("1 static block...");
	}
	//non static block
	{
		out.println("3 non-static block...");
	}
	//constructor
	Basics() {
		out.println("4 default constructor...");	
		class Bbc {}
	}
	public static void main(String... args) {
		out.println("2 Hello World!");
		new Basics();
		out.println("5 ends...");	
		class Bbc {}
	}
	int x = 99; // class/instance varaible, each one instance has it own copy
	static int y = 100; // static variable, single copy across instance
	final int MAX = 10; // constant	
	static class Bbc{}
}

/*
		int i = 5;
		i = i++;
		out.println(i); // 5

	The statement i = i++ has well-defined behavior in Java. 
	First, the value of i is pushed on a stack. 
	Then, the variable i is incremented. 
	Finally, the value on top the stack is popped off and assigned into i. 
	The net result is that nothing happens -- a smart optimizer could remove the whole statement.

		i = i++;
	is equivalent to
		int tmp = i;
		i++;
		i = tmp;
*/