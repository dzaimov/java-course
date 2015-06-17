import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class Budget {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Budget window = new Budget();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Budget() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 811, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateNew1 dialog = new CreateNew1();
				dialog.setModal(true);
				dialog.setVisible(true);
				Budget1 item = dialog.getMainItem();
				if(item == null){
					return;
				}else{
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] { item.getDate(), item.getExpense(),
							item.getPrice()});
					
				}
			}
		});
		btnAdd.setBounds(10, 228, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnCalculateForLast = new JButton("Calculate for last week");
		btnCalculateForLast.setBounds(109, 228, 154, 23);
		frame.getContentPane().add(btnCalculateForLast);
		
		JButton btnCalculateForLast_1 = new JButton("Calculate for last month");
		btnCalculateForLast_1.setBounds(273, 228, 154, 23);
		frame.getContentPane().add(btnCalculateForLast_1);
		
		JButton btnCalculateForLast_2 = new JButton("Calculate for last year");
		btnCalculateForLast_2.setBounds(437, 228, 154, 23);
		frame.getContentPane().add(btnCalculateForLast_2);
		
		JButton btnImport = new JButton("Import");
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "sss"));
					fileChooser.showDialog(null, "Choose...");
					
					File file = fileChooser.getSelectedFile();
					
					List<String> fileContent = Files.readAllLines(file.toPath());
					
					for (String line : fileContent) {
						
						NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
						String[] row = line.split(";");
						DateFormat df = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy", Locale.US);
						Date result = df.parse(row[0]);
						int day = 0;
						int month = 0;
						int year = 0;
						String expense = row[1];
						double price = 0;
						try {
							day = result.getDay();
							month = result.getMonth();
							year = result.getYear();
							price = numberFormat.parse(row[2]).doubleValue();
						} catch (ParseException ex) {
							JOptionPane.showMessageDialog(null, "Error parsing!");
							ex.printStackTrace();
						}
						Budget1 item = new Budget1(day, month, year, expense, price);
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] { item.getDate(), item.getExpense(),
								item.getPrice()});;

					
					}
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error while loading file!");
				}	
				
				JOptionPane.showMessageDialog(null, "Successfully loaded file!");
			}
		});
		
		
		btnImport.setBounds(601, 228, 89, 23);
		frame.getContentPane().add(btnImport);
		
		JButton btnExport = new JButton("Export");
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Storage System File", "sss"));
					fileChooser.showDialog(null, "Choose...");
					
					File file = fileChooser.getSelectedFile();
					if (file == null){
						return;
					}
					String path = file.getPath();
					if (path == null){
						return;
					}
					path = path.endsWith("bdg") ? path : path + ".bdg";
					
					FileWriter fileStream = new FileWriter(path);
					BufferedWriter writer = new BufferedWriter(fileStream);

					ArrayList<String> list = new ArrayList<String>();

			        int rowCount = table.getRowCount();
			        		        
			        for (int i = 0; i < rowCount; i++) {
			        	table.getValueAt(i, 0);
			        		String line = String.format("%s;%s;%s", table.getValueAt(i, 0),
							        								   table.getValueAt(i, 1), 
							        								   table.getValueAt(i, 2)
							        								   );
					        list.add(line);
			        }
					
					for (String line : list) {
						writer.append(line);
						writer.newLine();
					}
					
					writer.close();
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error while saving file!");
				}
				JOptionPane.showMessageDialog(null, "Successfully saved file!");
			}
			
		});
		btnExport.setBounds(700, 228, 89, 23);
		frame.getContentPane().add(btnExport);
		
		Object[][] rowData = new Object[0][3];
		Object[] columnNames = { "Date", "Expence", "Price"};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 775, 206);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable(new DefaultTableModel(rowData, columnNames));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
	}
}
