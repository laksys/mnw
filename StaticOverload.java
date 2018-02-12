// @laksys

/*
Can we Override static methods in java?
We can declare static methods with same signature in subclass, 
but it is not considered overriding as there won’t be any 
run-time polymorphism. Hence the answer is ‘No’.

Yes, you can overload static method but you cannot override them 
because they are independent of object and resolved at compile time. 
Compiler only needs to know which class they belong to resolve them.
*/

import static java.lang.System.out;

class A{
	static void aMethod(){
		out.println("a class amethod");
	}
}
class B extends A{
	static void aMethod(){
		out.println("b class amethod");
	}
}
public class StaticOverload {
	public static void main(String... args) {
		out.println("----------------------------------");
		A a = new B();
		a.aMethod();
	}
}