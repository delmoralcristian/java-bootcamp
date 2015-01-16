package point6;

import java.util.ArrayList;
import java.util.List;

public class MailList {
	private String email;
	private List<Notification> messages;
	
	public MailList(String email){
		this.email=email;
		this.messages= new ArrayList<Notification>();
	}
	
	public void SendEmail(String title, String body){
		Notification notification= new Notification(title, body);
		this.messages.add(notification);
	}
	
	public String ShowNotification(){
		String title= "Notifications: \n"  + "\n";
		String notification= "";
		for(Notification i: this.messages){
			notification += i.toString() + "\n";
		}
		return title+ notification;
	}
	
	public List<Notification> getMessages() {
		return messages;
	}
	public void setMessages(List<Notification> messages) {
		this.messages = messages;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

