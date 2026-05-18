package user2;

public class mainmethod {

	public static void main(String[] args) {
		UserData user = new UserData();
		user.loadUser();
		loginGUI gui = new loginGUI();
		gui.loginGUI(user);

	}

}
