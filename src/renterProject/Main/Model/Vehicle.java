package renterProject.Main.Model;
// ---------------Will be removed in actual implementation in favor of database

public class Vehicle {
	public String vehicleID;
	public int seatCapacity;
	public String fuelType;
	public String make;
	public String model;
	public int year;
	public String transmissionType;
	public int retailPrice;
	public boolean avalibility;
	
	
	public Vehicle(String ID, int Seats, String fuel, String mak, String mode, int yea, String transmission, int price) {
		vehicleID = ID;
		seatCapacity = Seats;
		fuelType = fuel;
		make = mak;
		model = mode;
		year = yea;
		transmissionType = transmission;
		retailPrice = price;
		avalibility = true;
	}
	public String toString() {
		return "ID:\t" + vehicleID  + "Make:\t" + make + "Model:\t" + model + "Year:\t" + year + "Is Avalibile:\t" + avalibility + 
				"\nSeat Number:\t" + seatCapacity + "Fuel:\t" + fuelType + "Transmission:\t" + transmissionType + "Price:\t" + retailPrice;
	}
}
