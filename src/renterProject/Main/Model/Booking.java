package renterProject.Main.Model;

import java.time.*;

public class Booking {
	private String bookingID;
	public LocalDate bookingDate;
	public LocalDate pickupDate;
	public LocalDate returnDate;
	public String status;
	public double totalPrice;
	private User bookingOwner;

	public Booking(String ID, LocalDate currDate, LocalDate pickup, LocalDate dropOff, double price, User owner) {
		bookingID = ID;
		bookingDate = currDate;
		pickupDate = pickup;
		returnDate = dropOff;
		status = "Booked";
		totalPrice = price;
		bookingOwner = owner;
	}

}
