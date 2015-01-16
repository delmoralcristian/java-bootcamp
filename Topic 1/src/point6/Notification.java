package point6;

import java.util.Calendar;

public class Notification {
	private String title;
	private String body;
	private Calendar date;
	
	public Notification(String title, String body){
		this.title= title;
		this.body= body;
		this.date= Calendar.getInstance();
	}
	
	public String toString(){
		return (this.getTitle() + "\n" + this.getDate().getTime() + "\n" + this.getBody() + "\n");
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	
	public void setBody(String body){
		this.body=body;
	}
	
	public String getBody(){
		return body;
	}
	
}
