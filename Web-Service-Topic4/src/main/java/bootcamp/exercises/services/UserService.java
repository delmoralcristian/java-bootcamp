package bootcamp.exercises.services;

import java.net.URISyntaxException;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bootcamp.exercises.classes.Photo;
import bootcamp.exercises.classes.User;


@Path("/user")
public class UserService implements UserInterface{

	@GET 
	@Path("/get/{account}")
	@Produces(MediaType.APPLICATION_XML)
	@Override
	public User getUser(@PathParam("account") String account){
		User user= new User();
		user.setAccount(account);
		user.setFirst_name("Cristian");
		user.setLast_name("del Moral");
		user.setPassword("14912");
		return user;	
	}
	
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	@Override
	public User createUser(User user){
		return user;
	}
	
	@PUT
	@Path("/update")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	@Override
	public User updateUser(User user){
		user.setFirst_name(user.getFirst_name() + " updated");
		return user;
	}
	
	@DELETE
	@Path("/delete/{account}")
	@Override
	public Response deleteUser(@PathParam("account") String account) throws URISyntaxException{
		return Response.status(200).entity("User with " + account + "is deleted successfully").build();
	}	
	
	
	@Override
	public void addFriend(User user, User friend){
		if(!user.getAccount().equals(friend.getAccount())){
			user.addFriend(friend);
		}
	}

	@Override
	public void uploadPhoto(User user, Photo photo) {
		user.addPhoto(photo);		
	}

	@Override
	public void likePhoto(User user, Photo photo) {
		for(Photo i: user.getPhotos()){
			if(i.getUrl().equals(photo.getUrl())){
				i.setLikeCount(i.getLikeCount()+1);
			}
		}
	}
}
