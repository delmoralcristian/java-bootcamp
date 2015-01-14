package point3;

public abstract class HospitalBuilder {
	private Hospital hospital;
	
	public HospitalBuilder(){
		hospital= new Hospital();
	}
		
		public abstract void setNurses();
		
		public abstract void setDoctor();
		
		public abstract void setDimension();
		
		public abstract void setRoom();
		
		public Hospital getHospital(){
			return hospital;
		}

}
