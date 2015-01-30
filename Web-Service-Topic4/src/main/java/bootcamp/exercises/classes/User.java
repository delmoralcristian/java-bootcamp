package bootcamp.exercises.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="user")
public class User {
	
	private String account;
	private String password;
	private String first_name;
	private String last_name;
	
	@Override
	public String toString() {
	   return "User account: " + account + ", password: " + password + ", name: " + first_name + ", surname: " + last_name;
	}
	
	@XmlElement(required=true)
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	@XmlElement(required=true)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@XmlElement(required=true)
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	@XmlElement(required=true)
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
}
