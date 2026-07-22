package renterProject.Main.Model;

import java.util.ArrayList;
import java.util.List;


public class mainModel {
	
	public Vehicle[] database = {(new Vehicle("abc123", 5, "gas", "ford", "fiesta", 2012, "automatic", 200)), new Vehicle("def456", 2, "electric", "tesla", "roadster", 2008, "automatic", 3000),
			(new Vehicle("ghi789", 9, "gas", "volkswagen", "type2", 1970, "manual", 1000)), new Vehicle("jkl000", 5, "diesel", "volvo", "xc60", 2026, "automatic", 2000)};

	public List<Vehicle> filterVehicles(String[] input) {
		List<Vehicle> output = new ArrayList<Vehicle>();
		for(Vehicle i : database) {
			if ( i.avalibility && (input[1].equals("") || input[1].equals(i.vehicleID)) && (input[2].equals("") || Integer.parseInt(input[2]) <= i.seatCapacity) && (input[3].equals("") || Integer.parseInt(input[3]) >= i.seatCapacity) &&
					(input[4].equals("") || input[4].equals(i.fuelType)) && (input[5].equals("") || input[5].equals(i.make)) && (input[6].equals("") || input[6].equals(i.model)) && (input[7].equals("") || Integer.parseInt(input[7]) == i.year) &&
					(input[8].equals("") || input[8].equals(i.transmissionType)) && (input[9].equals("") || Integer.parseInt(input[9]) <= i.retailPrice) && (input[10].equals("") || Integer.parseInt(input[10]) >= i.retailPrice))
				output.add(i);
		}
		
		return output;
	}

}
