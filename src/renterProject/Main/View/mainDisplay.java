package renterProject.Main.View;

import java.util.Scanner;

public class mainDisplay {
	private Scanner input;
	
	public mainDisplay() {
		input = new Scanner(System.in);
	}
	
	public void displayOutput(String i) {
		System.out.println(i);
		return;
	}
	
	public String recieveInput() {
		//recieve inputs from GUI
		//Right now will just be a Scanner input as proof of concept
		//input.nextLine();
		return input.nextLine();
	}
}
