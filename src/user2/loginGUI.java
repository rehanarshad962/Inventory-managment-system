package user2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginGUI {
	
	void loginGUI(UserData userdata) {

		JFrame frame1 = new JFrame();
		frame1.setSize(400, 250);
		frame1.setTitle("Login System");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLayout(null);
		frame1.setLocationRelativeTo(null);
		frame1.setResizable(false);

		JLabel label1 = new JLabel("Username");
		label1.setBounds(50, 50, 100, 30);

		JTextField namefield = new JTextField();
		namefield.setBounds(150, 50, 180, 30);

		JLabel label2 = new JLabel("Password");
		label2.setBounds(50, 100, 100, 30);

		JPasswordField passfield = new JPasswordField();
		passfield.setBounds(150, 100, 180, 35);

		JButton button = new JButton("Login");
		button.setBounds(80, 160, 100, 35);
		
		JButton button2 = new JButton("Signup");
		button2.setBounds(210, 160, 100, 35);
		
		button.addActionListener(e -> {
			String username = namefield.getText();
			String password = new String(passfield.getPassword());
			
			if(userdata.authenticates(username,password)) {
				frame1.dispose();
				new inventorysystem();
			}
			else {
				JOptionPane.showMessageDialog(frame1, "Invalid credentials!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		button2.addActionListener(e ->{
			signupGUI signup = new signupGUI();
			signup.SignupGUI(userdata);
			frame1.dispose();
		});

		frame1.add(label1);
		frame1.add(namefield);
		frame1.add(label2);
		frame1.add(passfield);
		frame1.add(button);
		frame1.add(button2);
		
		frame1.setVisible(true);

	}

}
