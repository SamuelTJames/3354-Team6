package renterProject.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import renterProject.Main.Controller.*;
import renterProject.Main.Model.*;
import renterProject.Main.View.*;
class FilterCLITester {

	@Test
	void test() {
		mainModel test = new mainModel();
		String[][] testCases = {	{"filter","","","","","","","","","",""}, {"filter","","2","8","","","","","automatic","",""},
								{"filter","","3","","electric","","","","automatic","",""}, {"filter","abc123","","","","","","","","",""}, 
								{"filter","","3","5", "diesel", "volvo", "xc60", "2026", "automatic", "200", "2500"}};
		assertEquals(test.database.length, (test.filterVehicles(testCases[0])).size());
		assertEquals(3, (test.filterVehicles(testCases[1])).size());
		assertEquals(0, (test.filterVehicles(testCases[2])).size());
		assertEquals(1, (test.filterVehicles(testCases[3])).size());
		assertEquals(1, (test.filterVehicles(testCases[4])).size());
	}

}
