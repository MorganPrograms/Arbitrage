import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Panels extends JPanel{
	private JComboBox currencies;
	private JComboBox currencies1;
	private JButton Convert;
	private String current; 
	private JLabel Speech;
	private JLabel Result;
	private JTextField Cash;
	private Random gen; 
	public Panels() {
		
		setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.cyan);
		setPreferredSize(new Dimension (750,150));
		Speech = new JLabel("Select the currency you wish to convert on the left and then select the currency you wish to convert to on the right.");
		Speech.setAlignmentX(Component.TOP_ALIGNMENT);
		Result = new JLabel("");
		Cash = new JTextField(5);
		String[] currency = {"USD","EUR","GBP","CND","JPY","TTD","JMD"};
		currencies = new JComboBox(currency);
		currencies1 = new JComboBox(currency);
		Convert = new JButton ("Convert");
		Convert.setBackground(Color.white);
		Convert.setAlignmentX(Component.BOTTOM_ALIGNMENT);
		currencies.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent event) {
				current = currency[currencies.getSelectedIndex()];
					
			}
		});
		currencies1.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent event) {
				current = currency[currencies1.getSelectedIndex()];
					
			}
		});
		Convert.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent event) {
				gen = new Random();
				String y = Result.toString();				
				
				Result.setText(Integer.toString(gen.nextInt(160-100)+100));
				
			}
		});
		JPanel Converts = new JPanel();
		Converts.setBackground(Color.cyan);
		Converts.setLayout(new FlowLayout());
		Converts.add(currencies);
		Converts.add(Cash);
		Converts.add(currencies1); 
		Converts.add(Result); 
		
		add(Box.createRigidArea(new Dimension(0,5)));
		add(Speech);
		add(Box.createRigidArea(new Dimension(0,5)));
		add(Converts); 
		add(Box.createRigidArea(new Dimension(0,5)));
		add(Convert);
		

		
		
	}

}
