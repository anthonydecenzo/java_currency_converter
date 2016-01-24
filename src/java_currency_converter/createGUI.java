package java_currency_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.apache.commons.io.IOUtils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class createGUI implements ActionListener{
	
	public double textField;
	public JButton convertButton = new JButton("Convert");
	public JLabel label1 = new JLabel("Convert         to          this");
	public JComboBox<String> originalCurrency = new JComboBox<String>();
	public JComboBox<String> convertedCurrency = new JComboBox<String>();
	public JFrame frame = new JFrame();
	public static JTextField originalCurrencyTextField = new JTextField();
	public JTextField convertedCurrencyTextField = new JTextField();
	public JLabel equalsLabel = new JLabel("is = to");
	
	public void showGUI() 
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
		
		convertedCurrency.addItem("CAD");
		convertedCurrency.addItem("EUR");
		
		frame.getContentPane().add(equalsLabel);
		frame.getContentPane().add(convertedCurrencyTextField);
		frame.getContentPane().add(originalCurrencyTextField);
		frame.getContentPane().add(convertedCurrency);
		frame.getContentPane().add(label1);
		frame.getContentPane().add(originalCurrency);
		frame.getContentPane().add(convertButton);
		frame.setVisible(true);
		
		
		convertButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		getCurrency getConversion = new getCurrency();
		String comboBoxText2 = (String) convertedCurrency.getSelectedItem();
		
		if(comboBoxText2.equals("CAD"))
		{
			try {
				double test = getConversion.USDCAD();
				String text = Double.toString(test);
				convertedCurrencyTextField.setText(text);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if(comboBoxText2.equals("EUR"))
		{
			try {
				double test = getConversion.USDEUR();
				String text = Double.toString(test);
				convertedCurrencyTextField.setText(text);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
	}
	
	public String textField()
	{
		return originalCurrencyTextField.getText();
	}
	
	
}
	
