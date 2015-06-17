import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class CreateNew1 extends JDialog {

	private Budget1 mainNew;

	public Budget1 getMainItem() {
		return mainNew;
	}

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public CreateNew1() {
		mainNew = new Budget1();
		setTitle("CREATE NEW");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblDay = new JLabel("Day:");
		lblDay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDay.setBounds(25, 28, 100, 19);
		getContentPane().add(lblDay);
		
		JLabel lblMonth = new JLabel("Month:");
		lblMonth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMonth.setBounds(25, 66, 100, 19);
		getContentPane().add(lblMonth);
				
		JLabel lblYear = new JLabel("Year:");
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYear.setBounds(25, 110, 100, 19);
		getContentPane().add(lblYear);
		
		JLabel lblExpence = new JLabel("Expence:");
		lblExpence.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblExpence.setBounds(25, 145, 100, 19);
		getContentPane().add(lblExpence);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrice.setBounds(25, 187, 100, 19);
		getContentPane().add(lblPrice);
		
		JFormattedTextField formattedDayField = new JFormattedTextField();
		formattedDayField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		formattedDayField.setBounds(207, 23, 200, 29);
		formattedDayField.setValue(new Integer(1));
		getContentPane().add(formattedDayField);
		
		JFormattedTextField formattedMonthField = new JFormattedTextField();
		formattedMonthField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		formattedMonthField.setBounds(207, 61, 200, 29);
		formattedMonthField.setValue(new Integer(1));
		getContentPane().add(formattedMonthField);
		
		JFormattedTextField formattedYearField = new JFormattedTextField("{0,number,#}");
		formattedYearField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		formattedYearField.setBounds(207, 105, 200, 29);
		formattedYearField.setValue(new Integer(2000));
		getContentPane().add(formattedYearField);
		
		JFormattedTextField formattedExpenceField = new JFormattedTextField();
		formattedExpenceField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		formattedExpenceField.setBounds(207, 140, 200, 29);
		getContentPane().add(formattedExpenceField);
		
		JFormattedTextField formattedPriceField = new JFormattedTextField();
		formattedPriceField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		formattedPriceField.setBounds(207, 182, 200, 29);
		formattedPriceField.setValue(new Double(0d));
		getContentPane().add(formattedPriceField);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
				
				int day = 1;
				int month = 1;
				int year = 1;
				String expense = formattedExpenceField.getText();
				double price = 0;
				try {
					day = numberFormat.parse(formattedDayField.getText()).intValue();
					month = numberFormat.parse(formattedMonthField.getText()).intValue();
					year = numberFormat.parse(formattedYearField.getText()).intValue();
					price = numberFormat.parse(formattedPriceField.getText()).doubleValue();
				} catch (ParseException ex) {
					JOptionPane.showMessageDialog(null, "Error parsing!");
					ex.printStackTrace();
				}
				
				if (formattedExpenceField.getText() == null || formattedExpenceField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter correct expence!");
					
				} else if (formattedDayField.getText() == null || 
						formattedDayField.getText().equals("") ||
						day <= 0 || day > 31) {
							JOptionPane.showMessageDialog(null, "Please enter correct day!");	
				} else if (formattedMonthField.getText() == null || 
						formattedMonthField.getText().equals("") ||
						month <= 0 || month > 12)
						 {
					JOptionPane.showMessageDialog(null, "Please enter correct month!");
					
				} else if (formattedYearField.getText() == null || 
						formattedYearField.getText().equals("") ||
						year <= 0 ) {
					JOptionPane.showMessageDialog(null, "Please enter correct year!");
					
				} else {
					mainNew.setDay(day);
					mainNew.setMonth(month);
					mainNew.setYear(year);
					mainNew.setExpense(expense);
					mainNew.setPrice(price);
					setVisible(false);
				}
			}
		});
		btnAdd.setBounds(36, 228, 89, 23);
		getContentPane().add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainNew = null;
				setVisible(false);
			}
		});
		btnCancel.setBounds(335, 228, 89, 23);
		getContentPane().add(btnCancel);
	}
}
