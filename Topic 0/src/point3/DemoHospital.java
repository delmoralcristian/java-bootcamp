package point3;

public class DemoHospital {

	public static void main(String[] args) {
		Factory hospitalfactory= new Factory();
		Hospital hospital= hospitalfactory.getHospital("small");
		System.out.println(hospital.toString());
		
		hospital= hospitalfactory.getHospital("big");
		System.out.println(hospital.toString());
	}

}
