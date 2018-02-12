// @laksys
import static java.lang.System.out;
import javax.swing.*;
import org.jsoup.*;
import org.jsoup.nodes.*;

public class Crawl extends JFrame {
	static final long serialVersionUID = 1l;
	JTextArea ta;
	JButton btn;
	public Crawl(){
		ta = new JTextArea();
		add(new JScrollPane(ta));

		JPanel southPanel = new JPanel();
		southPanel.add( btn = new JButton("Start"));
		add("South", southPanel);
		try {
			Document doc = Jsoup.connect("http://nclt.gov.in/status_principal.html").get();
		} catch (Exception exp) {
		}

		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String... args) {
		SwingUtilities.invokeLater(()->new Crawl());
	}
}