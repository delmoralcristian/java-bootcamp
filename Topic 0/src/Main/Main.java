package Main;

import Classes.Builder;
import Classes.Hospital;

public class Main {

	public static void main(String[] args) {
		Builder hospital = new Hospital(30, 50, "goa", "sfdsf", 14, 12, "San Cayetano");
		hospital.printout();

	}

}
