package renterProject.Main.Model;


public class Faculty extends User{

	public String username;
	private String passHash;
	
	public Faculty(String ID, String n, int pNumber, String usern, String hash) {
		super(ID, n, pNumber);	
		usern = username;
		hash = passHash;
	}
	
	public Faculty(String ID, String n, String mail, String usern, String hash) {
		super(ID, n, mail);		
		usern = username;
		hash = passHash;
	}
	
	public Faculty(String ID, String n, String mail, int pNumber, String usern, String hash) {
		super(ID, n, mail, pNumber);		
		usern = username;
		hash = passHash;
	}
}
