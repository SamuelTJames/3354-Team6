package renterProject.Main.Controller;

import renterProject.Main.View.*;

import java.util.ArrayList;
import java.util.List;

import renterProject.Main.Model.*;

public class main {

	public static void main(String[] args) {
		mainDisplay view = new mainDisplay();
		mainModel model = new mainModel();
		String commandInput;
		String[] userInput;
		
		view.displayOutput("Welcolm to the CLI proof of concept for the rental system!\nThe expected inputs are \'command, parameter, paramter, ect\'\nAs of now only filter is implemented");
		userInput = sanatizeInput(view.recieveInput());
		commandInput = userInput[0];
		
		while(commandInput != "close") {
			System.out.println(commandInput);
			try {
				if(commandInput.equals("filter")) {
					if(userInput.length != 6)
						throw new IllegalArgumentException("expected filter input is\n"
								+ "\n\'filter, vehicle ID, minimum seats, maximum seats, fuel type, make, model, year, transmission type, minimum price, maximum price\'"
								+ "\nleave blank inbetween commas to ignore that filter");
					List<Vehicle> temp = model.filterVehicles(userInput);
					if(!temp.isEmpty())
						for(Vehicle i : temp)
							view.displayOutput(i.toString());
					else
						view.displayOutput("No vehicle meets specifications");
					//view.displayOutput(model.filterVehicles(userInput));
				} else if(commandInput.equals("login")) {
					throw new IllegalArgumentException("Command " + commandInput + " is not yet implemented");
				} else if(commandInput.equals("bypass")) {
					throw new IllegalArgumentException("Command " + commandInput + " is not yet implemented");
				} else if(commandInput.equals("add")) {
					throw new IllegalArgumentException("Command " + commandInput + " is not yet implemented");
				} else if(commandInput.equals("book")) {
					throw new IllegalArgumentException("Command " + commandInput + " is not yet implemented");
				} else {
					throw new IllegalArgumentException("No matching command found for " + commandInput);
				}
			}	catch (IllegalArgumentException e) {
					view.displayOutput("Error: " + e.getMessage());
			}
			userInput = sanatizeInput(view.recieveInput());
			commandInput = userInput[0];
		}
		view.displayOutput("Ending program...");
		
	}
	
	public static String[] sanatizeInput(String input) {
		String temp = input;
		temp = temp.toLowerCase();
		temp = temp.replaceAll("\\s+", "");
		return temp.split(",", -1);
	}
}