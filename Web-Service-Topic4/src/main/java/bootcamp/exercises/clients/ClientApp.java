
package bootcamp.exercises.clients;

import bootcamp.exercises.classes.User;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.Client;

public class ClientApp {

	public static void main(String[] args) {
		Client client= Client.create();
		WebResource webResource= client.resource("http://localhost:8080/Web-Service-Topic4/rest/user/create");
		User user= new User();
		user.setAccount("Martin143");
		user.setFirst_name("Martin");
		user.setLast_name("Gutierrez");
		user.setPassword("121212");
		ClientResponse response= webResource.type("application/xml").post(ClientResponse.class, user);
		System.out.println("Create Operation Response Processing");
		String output= response.getEntity(String.class);
		System.out.println(output);
	
	}

}
