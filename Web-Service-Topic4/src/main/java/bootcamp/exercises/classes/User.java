package bootcamp.exercises.classes;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="user")
public class User {
	
	private String account;
	private String password;
	private String firstName;
	private String lastName;
	private List<User> friends;
	private List<Photo> photos;
	
	@Override
	public String toString() {
	   return "User account: " + account + ", password: " + password + ", name: " + firstName + ", surname: " + lastName;
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
		return firstName;
	}
	public void setFirst_name(String first_name) {
		this.firstName = first_name;
	}
	
	@XmlElement(required=true)
	public String getLast_name() {
		return lastName;
	}
	public void setLast_name(String last_name) {
		this.lastName = last_name;
	}

	@XmlElement(required=true)
	public List<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}

	@XmlElement(required=true)
	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	
	public void addPhoto(Photo photo){
		this.photos.add(photo);
	}
	
	public void addFriend(User user){
		this.friends.add(user);
	}
}
