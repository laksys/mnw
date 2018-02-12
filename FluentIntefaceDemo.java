// @laksys
// method chaining and part of a concept called 'fluent interfaces'
/** Method chaining, also known as named parameter idiom, 
	is a common syntax for invoking multiple method calls 
	in object-oriented programming languages. 
	Each method returns an object, allowing the calls to be 
	chained together in a single statement. 
	Chaining is syntactic sugar which eliminates the need for 
	intermediate variables. A method chain is also known as a 
	train wreck due to the increase in the number of methods 
	that come one after another in the same line that occurs 
	as more methods are chained together even though 
	line breaks are often added between methods.

	A similar syntax is method cascading, where after the 
	method call the expression evaluates to the current object, 
	not the return value of the method. Cascading can be 
	implemented using method chaining by having the method 
	return the current object itself (this). 
	Cascading is a key technique in fluent interfaces, and 
	since chaining is widely implemented in object-oriented 
	languages while cascading isn't, this form of 
	"cascading-by-chaining by returning this" is often 
	referred to simply as "chaining". 
	Both chaining and cascading come from the Smalltalk language.

*/
import static java.lang.System.out;

public class FluentIntefaceDemo {
	public static void main(String... args) {
		out.println("begin...");
		new Cat()
			.add("abc")
			.add("bbc")
			.add("cbc")
			.print();
		out.println("ends...");
	}
}

class Cat{
	StringBuilder text;
	Cat(){
		text = new StringBuilder();
	}
	public Cat add(String str){
		text.append(str);
		return this;
	}
	public void print(){
		out.println(text);
	}
}