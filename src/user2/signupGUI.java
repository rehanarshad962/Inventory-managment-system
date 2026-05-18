package user2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class signupGUI {
	
	void SignupGUI(UserData userdata) {
		JFrame frame2 = new JFrame();
		frame2.setSize(400,250);
		frame2.setTitle("Signup");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setLayout(null);
		frame2.setLocationRelativeTo(null);
		frame2.setResizable(false);
		
		JLabel label1 = new JLabel("Username");
		label1.setBounds(50, 50, 100, 30);

		JTextField namefield = new JTextField();
		namefield.setBounds(150, 50, 180, 30);

		JLabel label2 = new JLabel("Password");
		label2.setBounds(50, 100, 100, 30);

		JPasswordField passfield = new JPasswordField();
		passfield.setBounds(150, 100, 180, 35);

		JButton button = new JButton("Signup");
		button.setBounds(100, 160, 100, 35);
		
		button.addActionListener(e ->{
			String username = namefield.getText();
			String password = new String(passfield.getPassword());
			
			userdata.addUser(username, password);
			
			JOptionPane.showMessageDialog(frame2, "Account Created");
		});
		frame2.add(label1);
		frame2.add(namefield);
		frame2.add(label2);
		frame2.add(passfield);
		frame2.add(button);
		frame2.setVisible(true);

		
	}
	

}
