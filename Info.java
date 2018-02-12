// @laksys
import static java.lang.System.out;

public class Info {
	public static void getInfo () {
		out.println("Java ver:" + System.getProperty("java.version"));
		//out.println("Java classpath:" + System.getProperty("java.class.path"));
		out.println("OS Name & Ver:" + System.getProperty("os.name") + "; " + System.getProperty("os.version"));
		out.println("Java Home:" + System.getProperty("java.home"));
		out.println("Java runtime ver:" + System.getProperty("java.runtime.version"));
		out.println("Java spec vendor:" + System.getProperty("java.vm.specification.vendor"));
		out.println("User directory:" + System.getProperty("user.dir"));
		out.println("OS arch:" + System.getProperty("os.arch"));
		out.println("Java class ver:" + System.getProperty("java.class.version"));
		//System.getProperties().list(out);
	}
	public static void main (String args[]) {
		Info.getInfo();
	}
}