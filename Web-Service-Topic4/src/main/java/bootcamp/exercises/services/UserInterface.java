package bootcamp.exercises.services;

import java.net.URISyntaxException;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import bootcamp.exercises.classes.Photo;
import bootcamp.exercises.classes.User;

public interface UserInterface {
	
	public User getUser(@PathParam("account") String account);
	public User createUser(User user);
	public User updateUser(User user);
	public Response deleteUser(@PathParam("account") String account) throws URISyntaxException;
	public void addFriend(User user, User friend);
	public void uploadPhoto(User user, Photo photo);
	public void likePhoto(User user, Photo photo);
}
