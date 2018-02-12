// @laksys
import static java.lang.System.out;
/*
Difference between public, protected, friendly and private

————————————+———————+—————————+——————————+——————————+————————|
			| Class | Package | Subclass | Subclass | World	 |
            |       |         |(same pkg)|(diff pkg)|        |
————————————+———————+—————————+——————————+——————————+————————|
public      |   +   |    +    |    +     |     +    |   +    | 
————————————+———————+—————————+——————————+——————————+————————|
protected   |   +   |    +    |    +     |     +    |        |
————————————+———————+—————————+——————————+——————————+————————|
no modifier |   +   |    +    |    +     |          |        |
————————————+———————+—————————+——————————+——————————+————————|
private     |   +   |         |          |          |        |
————————————+———————+—————————+——————————+——————————+————————|

+ : accessible
blank : not accessible

╔═════════════╦═══════╦═════════╦══════════╦═══════╗
║ Modifier    ║ Class ║ Package ║ Subclass ║ World ║
╠═════════════╬═══════╬═════════╬══════════╬═══════╣
║ public      ║ Y     ║ Y       ║ Y        ║ Y     ║
║ protected   ║ Y     ║ Y       ║ Y        ║ N     ║
║ no modifier ║ Y     ║ Y       ║ N        ║ N     ║
║ private     ║ Y     ║ N       ║ N        ║ N     ║
╚═════════════╩═══════╩═════════╩══════════╩═══════╝
*/
class Base {
	int num;
	Base(){
		update("base");
	}
	void update(String str){
		num+=10;
		out.println("base update done in " +str);
	}
	int getValue(){
		return num;
	}
}

class Derived extends Base {
	Derived(){
		super();
		update("derived");
		
	}
	void update(String str){
		num+=20;
		out.println("derived update done in " + str);
	}
}

public class InheritanceDemo {
	public static void main(String... args) {
		//Base b = new Derived();
		//out.println( b.getValue());

		for(int i=0;i <10; i++)
			out.println(i);
		out.println(i);
	}
}