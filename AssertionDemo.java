// @laksys
/**
	An assertion is a statement in the Java programming that 
	enables you to test your assumptions about your program.
	Each assertion contains a boolean expression that you believe 
	will be true when the assertion executes. If it is not true, 
	the system will throw an error. By verifying that the boolean 
	expression is indeed true, the assertion confirms your 
	assumptions about the behavior of your program, increasing your 
	confidence that the program is free of errors.
*/
import static java.lang.System.out;

public class AssertionDemo {
	public static void main(String... args) {	
		out.println("starts...");

		int value = 15;
		//The assertion statement has two forms. 
		//The first, simpler form is: assert Expression1;
		assert value >= 20;
		//The second form of the assertion statement is: 
		//assert Expression1 : Expression2;
		assert value >= 20 : " Underweight";
		
		out.println("value is "+value);		

		//Putting Assertions Into Your Code. There are many situations 
		//where it is good to use assertions, including:
		//	* Internal Invariants
		//	* Control-Flow Invariants
		//	* Preconditions, Postconditions, and Class Invariants
		//There are also situations where you should not use them:
		//	* Do not use assertions for argument checking in public methods. 
		//	* Do not use assertions to do any work that your application 
		//requires for correct operation. 	
		out.println("ends...");
	}
}