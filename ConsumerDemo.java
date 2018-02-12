import static java.lang.System.out;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDemo {
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

		names.stream().forEach(x->pn(()->x));
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