package java_currency_converter;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class execute {
	JButton convertButton = new JButton("Convert");
	JLabel label1 = new JLabel("Convert         to          this");
	JComboBox<String> originalCurrency = new JComboBox<String>();
	JComboBox<String> convertedCurrency = new JComboBox<String>();
	JFrame frame = new JFrame();
	JTextField originalCurrencyTextField = new JTextField();
	JTextField convertedCurrencyTextField = new JTextField();
	JLabel equalsLabel = new JLabel("is = to");
	public static void main(String [] args)
	{
		execute program = new execute();
		program.createGUI();
	}
	
	
	public void createGUI()
	{
		frame.setTitle("Currency Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(310, 300);
		frame.getContentPane().setLayout(null);
		
		label1.setBounds(50, 10, 150, 20);
		convertButton.setBounds(208, 231, 80, 20);
		originalCurrency.setBounds(50, 40, 60, 20);
		
		convertedCurrency.setBounds(150, 40, 60, 20);
		
		originalCurrencyTextField.setBounds(50, 70, 60, 20);
		
		equalsLabel.setBounds(110, 70, 80, 20);
		
		convertedCurrencyTextField.setBounds(150, 70, 60, 20);
		
		originalCurrency.addItem("USD");
		originalCurrency.addItem("CAD");
		
		convertedCurrency.addItem("CAD");
		convertedCurrency.addItem("USD");
		
		frame.getContentPane().add(equalsLabel);
		frame.getContentPane().add(convertedCurrencyTextField);
		frame.getContentPane().add(originalCurrencyTextField);
		frame.getContentPane().add(convertedCurrency);
		frame.getContentPane().add(label1);
		frame.getContentPane().add(originalCurrency);
		frame.getContentPane().add(convertButton);
		frame.setVisible(true);
		
		
		convertButton.addActionListener(new convertListener());
	}
	
	class convertListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			originalCurrencyTextField.setText("test");
		}
	}
}
