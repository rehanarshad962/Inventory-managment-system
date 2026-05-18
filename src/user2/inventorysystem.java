package user2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class inventorysystem {
	inventorysystem() {
		JFrame frame = new JFrame();
		frame.setTitle("Inventory Managment System");
		frame.setSize(550,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		JLabel label = new JLabel();
		label.setText("Welcome to Inventory System");
		label.setBounds(150, 20, 300, 30);
		label.setFont(new Font("Ariel", Font.BOLD, 18));
		label.setForeground(Color.blue);
		
		JLabel label_1 = new JLabel("Item Name");
		label_1.setBounds(50, 70, 100, 25);
		
		
		JTextField namefield = new JTextField();
		namefield.setBounds(150, 70, 200, 25);
		
		JLabel CategoryLabel = new JLabel("Category");
		CategoryLabel.setBounds(50, 110, 100, 25);
		String[] categories = {"Electronics", "Clothing", "Food", "Stationary", "Mussa"};
		JComboBox<String> categorybox = new JComboBox<>(categories);
		categorybox.setBounds(150, 110, 200, 25);
		
		JCheckBox availablecheck = new JCheckBox("Available");
		availablecheck.setBounds(150, 150, 100, 25);
		
		JButton addButton = new JButton("Add Item");
		addButton.setBounds(150, 190, 100, 30);
		
		JTextArea outputarea = new JTextArea();
		outputarea.setBounds(50, 240, 480, 180);
		outputarea.setEditable(false);
		outputarea.setBorder(BorderFactory.createLineBorder(Color.gray));
		
		frame.add(label);
		frame.add(label_1);
		frame.add(namefield);
		frame.add(CategoryLabel);
		frame.add(categorybox);
		frame.add(availablecheck);
		frame.add(addButton);
		frame.add(outputarea);
		
		addButton.addActionListener( e -> {
			String name = namefield.getText();
			String category = (String)categorybox.getSelectedItem();
			boolean isAvailable = availablecheck.isSelected();
			
			if(!name.isEmpty()) {
				outputarea.append("Added: " + name + " - " + category + "\n");
				namefield.setText("");
				availablecheck.setSelected(false);
				}
			else {
				JOptionPane.showMessageDialog(frame, "Please enter item name.", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		frame.setVisible(true);
		}

}
