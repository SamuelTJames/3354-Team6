package renterProject.Main.Model;

import java.time.*;

public class Customer extends User {
	public LocalDate DOB;
	private String driverLicenceNum;
	
	public Customer(String ID, String n, int pNumber, LocalDate birthDay, String DLNum) {
		super(ID, n, pNumber);	
		DOB = birthDay;
		driverLicenceNum = DLNum;
	}
	
	public Customer(String ID, String n, String mail, LocalDate birthDay, String DLNum) {
		super(ID, n, mail);		
		DOB = birthDay;
		driverLicenceNum = DLNum;
	}
	
	public Customer(String ID, String n, String mail, int pNumber, LocalDate birthDay, String DLNum) {
		super(ID, n, mail, pNumber);		
		DOB = birthDay;
		driverLicenceNum = DLNum;
	}

}
