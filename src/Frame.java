import javax.swing.*;

public class Frame {
	public static void main (String[]  args) {
		JFrame frame = new JFrame("Arbritage");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Convert", new Panels());
		tp.addTab("Currencies", new Panels1());
		frame.getContentPane().add(tp);
		frame.pack();
		frame.setVisible(true);
	}

}
