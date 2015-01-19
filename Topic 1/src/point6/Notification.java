package point6;

import java.util.Calendar;

public class Notification {
	private String title;
	private String body;
	
	public Notification(String title, String body){
		this.title= title;
		this.body= body;
	}
	
	public String toString(){
		return (this.getTitle() + "\n" + Calendar.getInstance().getTime() + "\n" + this.getBody() + "\n");
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setBody(String body){
		this.body=body;
	}
	
	public String getBody(){
		return body;
	}
	
}
