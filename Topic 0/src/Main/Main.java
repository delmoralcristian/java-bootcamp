package Main;

import Classes.Builder;
import Classes.Home;
import Classes.Hospital;

public class Main {

	public static void main(String[] args) {
		Builder hospital = new Hospital(30, 50, "Acevedo 1234", "2234567689", 14, 12, "San Cayetano");
		Builder home = new Home (3, 5, "Mitre 1234", "2234567654", 3);
		hospital.printout();
		home.printout();

	}

}
