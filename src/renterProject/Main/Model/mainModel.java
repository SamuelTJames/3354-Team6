package renterProject.Main.Model;

import java.util.ArrayList;
import java.util.List;


public class mainModel {
	
	Vehicle[] database = {(new Vehicle("ABC123", 5, "Gas", "Ford", "Fiesta", 2012, "Automatic", 200))};

	public List<Vehicle> filterVehicles(String[] input) {
		List<Vehicle> output = new ArrayList<Vehicle>();
		for(Vehicle i : database) {
			if ( i.avalibility && (input[1].equals(i.vehicleID) || input[1].equals("")) && (Integer.parseInt(input[2]) <= i.seatCapacity || input[2].equals("")) && (Integer.parseInt(input[3]) >= i.seatCapacity || input[3].equals("")) &&
					(input[4].equals(i.fuelType) || input[4].equals("")) && (input[5].equals(i.make) || input[5].equals("")) && (input[6].equals(i.model) || input[6].equals("")) && (Integer.parseInt(input[7]) == i.year || input[7].equals("")) &&
					(input[8].equals(i.transmissionType) || input[8].equals("")) && (Integer.parseInt(input[9]) <= i.retailPrice || input[9].equals("")) && (Integer.parseInt(input[10]) >= i.retailPrice || input[10].equals("")))
				;
		}
		
		return output;
	}

}
