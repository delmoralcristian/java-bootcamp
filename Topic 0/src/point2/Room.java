package point2;

public class Room {
	private String description;
	private String color;
	private String size;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public String toString() {
		return "The size is:" + size + ", color:" + color + ", description:" + description;
	}

}
