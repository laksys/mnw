// @laksys
import static java.lang.System.out;
import java.io.*;

class Student implements Serializable {
	static final long serialVersionUID = 1;
	private int rollno;
	private String name;
	private transient int cnt; //not serializable
	public Student( int r, String n){
		rollno = r; name = n;
	}
	@Override public String toString(){
		return name + ": " + rollno;
	}
}
public class SerializationDemo {
	public static void main(String... args) {	
		out.println("hello, world!");
		
		// writing
		/*
		Student s = new Student(229, "Govindan");
		out.println(s);
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"))){
			oos.writeObject(s);
			oos.flush();
		}catch(IOException exp){
			exp.printStackTrace();
		}
		*/

		// reading
		try(ObjectInputStream ios = new ObjectInputStream(new FileInputStream("student.dat"))){
			Student s = (Student)ios.readObject();
			out.println(s);
		} catch(IOException | ClassNotFoundException exp){
			exp.printStackTrace();
		}
		out.println("Ends...");
	}
}