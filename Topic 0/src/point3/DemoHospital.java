package point3;

public class DemoHospital {

	public static void main(String[] args) {
		Factory hospitalfactory = new Factory();
		try {
			Hospital hospital = hospitalfactory.getHospital(Dimension.HospitalSmall.getName());
			System.out.println(hospital.toString());
			hospital = hospitalfactory.getHospital(Dimension.HospitalBig.getName());
			System.out.println(hospital.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
