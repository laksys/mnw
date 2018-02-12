//@laksys
import static java.lang.System.out;
import java.util.*;

class Circle {
	private double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	@Override
	public String toString(){
		return String.valueOf(radius);
	}

	/*
	@Override
	public boolean equals(Object c){
		Circle t = (Circle) c;
		return radius == t.radius;
	}
	*/
}

public class HashDemo {
	public static void main(String... args) {
		out.println("--------o/p---------\nHello World!");

		Circle c1 = new Circle(9.23);
		Circle c2 = new Circle(1.19);
		Circle c3 = new Circle(4.61);
		Circle c4 = new Circle(1.19);

		HashSet<Circle> set = new HashSet<>();
		set.add(c1); set.add(c2); set.add(c3); set.add(c4);
		out.println(set);

		Hashtable<String, String> tab = new Hashtable<>();
		HashMap<String, String> map = new HashMap<>();


	}
}