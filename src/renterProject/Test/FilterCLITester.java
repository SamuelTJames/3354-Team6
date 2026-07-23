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
		String[][] testCases = {	{"BaseNothing","","","","","","","","","",""}, {"BasicFilter","","2","8","","","","","automatic","",""},
								{"NoMatch","","3","","electric","","","","automatic","",""}, {"IDMatch","abc123","","","","","","","","",""}, 
								{"OneMatch","","3","5","diesel","volvo","xc60","2026","automatic","200","2500"},
								{"NumberError1","","notANumber","","","","","","","",""}, {"NumberError2","","9999999999","","","","","","","",""}};
		assertEquals(test.database.length, (test.filterVehicles(testCases[0])).size());
		assertEquals(3, (test.filterVehicles(testCases[1])).size());
		assertEquals(0, (test.filterVehicles(testCases[2])).size());
		assertEquals(1, (test.filterVehicles(testCases[3])).size());
		assertEquals(1, (test.filterVehicles(testCases[4])).size());
		
		assertThrows(NumberFormatException.class, () -> { test.filterVehicles(testCases[5]).size(); });
		assertThrows(NumberFormatException.class, () -> { test.filterVehicles(testCases[6]).size(); });
	}

}
