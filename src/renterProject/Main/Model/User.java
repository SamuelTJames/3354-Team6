package renterProject.Main.Model;

public class User {
	public String userID;
	public String name;
	public int phoneNumber;
	public String email;
	
	public User(String ID, String n, String mail) {
		userID = ID;
		name = n;
		email = mail;
	}
	
	public User(String ID, String n, int pNumber) {
		userID = ID;
		name = n;
		phoneNumber = pNumber;
	}
	
	public User(String ID, String n, String mail, int pNumber) {
		userID = ID;
		name = n;
		email = mail;
		phoneNumber = pNumber;
	}
}
