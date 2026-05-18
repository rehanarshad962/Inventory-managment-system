package user2;

import java.util.ArrayList;

public class UserData {
	ArrayList<User> user = new ArrayList<>();
	
	void loadUser() {
		user.add(new User("Admin", "Admin123"));
		user.add(new User("Ali", "Ali234"));
		user.add(new User("Haris", "Haris44"));
		user.add(new User("Jamal", "Jamal89"));
	}
	void showuser() {
		for(User u : user) {
			System.out.println(u.getusername() + ":" + u.getpassword());
		}
	}
	boolean authenticates(String username,  String password) {
		for(User u : user) {
			if(u.getusername().equals(username) && u.getpassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	public void addUser(String name, String pass) {
		user.add(new User(name,pass));
	}

}
