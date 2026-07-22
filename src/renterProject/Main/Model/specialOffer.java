package renterProject.Main.Model;

import java.time.*;

public class specialOffer {

	public String offerID;
	public String Description;
	public double discountAmount;
	public LocalDate startDate;
	public LocalDate endDate;
	
	public specialOffer(String ID, String Desc, double discount, LocalDate start, LocalDate end) {
		offerID = ID;
		Description = Desc;
		discountAmount = discount;
		startDate = start;
		endDate = end;
	}

}
