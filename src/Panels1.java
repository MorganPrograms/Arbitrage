import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
public class Panels1 extends JPanel{
	private JLabel USDR, USDQ, JMDR, JMDQ, TTDR, TTDQ, JPYR, JPYQ, EURR, EURQ, GBPR, GBPQ, CNDR, CNDQ, Instruction; 
	private JButton Update;
	private JComboBox currencies;
	private Random gen; 
	
	
	
	
	public Panels1(){
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension (750,150));
		Instruction = new JLabel("Select a currency from the drop-down box to see the exchange rates"); 
		String[] currency = {"USD","EUR","GBP","CND","JPY","TTD","JMD"};
		currencies = new JComboBox(currency);
		USDR = new JLabel("");
		USDQ = new JLabel("USD");
		JMDR = new JLabel("");
		JMDQ = new JLabel("JMD");
		TTDR = new JLabel("");
		TTDQ = new JLabel("TTD");
		JPYR = new JLabel("");
		JPYQ = new JLabel("JPY");
		EURR = new JLabel("");
		EURQ = new JLabel("EUR");
		GBPR = new JLabel("");
		GBPQ = new JLabel("GBP");
		CNDR = new JLabel("");
		CNDQ = new JLabel("CND");
		Update = new JButton("Update"); 
		Update.setBackground(Color.BLUE);
		Update.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent event) {
				gen = new Random();
				int i = 100;
				int l = 160;
				
				
				USDR.setText(Integer.toString(gen.nextInt(l-i)+i));
				JMDR.setText(Integer.toString(gen.nextInt(l-i)+i));
				TTDR.setText(Integer.toString(gen.nextInt(l-i)+i));
				JPYR.setText(Integer.toString(gen.nextInt(l-i)+i));
				EURR.setText(Integer.toString(gen.nextInt(l-i)+i));
				GBPR.setText(Integer.toString(gen.nextInt(l-i)+i));
				CNDR.setText(Integer.toString(gen.nextInt(l-i)+i));
				
				
			}
		});
		JPanel button = new JPanel();
		button.setLayout(new BoxLayout(button, BoxLayout.Y_AXIS));
		button.add(currencies); 
		JPanel quotes = new JPanel();
		quotes.setLayout(new FlowLayout());
		quotes.add(USDR);
		quotes.add(USDQ);
		quotes.add(JMDR);
		quotes.add(JMDQ);
		quotes.add(TTDR);
		quotes.add(TTDQ);
		quotes.add(JPYR);
		quotes.add(JPYQ);
		quotes.add(EURR);
		quotes.add(EURQ);
		quotes.add(GBPR);
		quotes.add(GBPQ);
		quotes.add(CNDR);
		quotes.add(CNDQ);
		quotes.add(Update);
		add(Box.createRigidArea(new Dimension(0,5)));
		add(button);
		add(Box.createRigidArea(new Dimension(0,5)));
		add(quotes);
		
		
		
		
		
		
	}

}
