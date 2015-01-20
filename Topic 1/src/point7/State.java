package point7;

public enum State {
	Play("Play State"), Pause("Pause State"), Stop("Stop State");
	
private String name;
	
	State(String name){
		this.name= name;
	}

	public String getName() {
		return name;
	}
}
