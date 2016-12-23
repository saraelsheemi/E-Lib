package rest_client_test;
import java.net.URI; 

import javax.ws.rs.client.Client ;
import javax.ws.rs.client.ClientBuilder ; 
import javax.ws.rs.client.WebTarget ; 
import javax.ws.rs.core.MediaType ; 
import javax.ws.rs.core.Response;

import org.json.simple.JSONObject;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Test {

//	public static void main(String[] args) {
//		String sum = "";
//		try {
//
//			ClientConfig config1 = new ClientConfig();
//
//			Client client = ClientBuilder.newClient(config1);
//
//			WebTarget target = client
//					.target(UriBuilder
//							.fromUri(
//									"http://localhost:8080/Elib_service")
//							.build());
//			JSONParser parser = new JSONParser();
//			Object obj = parser.parse(target.path("rest").path("account")
//					.path("signin")
//					.path("sara@yahoo.com").path("hehe").request()
//					.accept(MediaType.TEXT_PLAIN).get(String.class).toString());
//			JSONObject jsonObj = (JSONObject) obj;
//			System.out.println(jsonObj.toJSONString());
//			//sum = jsonObj.get("email").toString();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
		public static void main (String [] args) throws ParseException{
//			ClientConfig config1 = new ClientConfig();
//
//		Client client = ClientBuilder.newClient(config1);
//
//		WebTarget target = client.target(UriBuilder.fromUri(
//				"http://localhost:8080/Elib_service").build());
//		System.out.println(target.path("hello").path("sara"));

			
			Account x = new Account ();
			x.setDateOfBirth("1996-09-22");
			x.setEmail("sara@yahoo.commm");
			x.setFaculty("jaj");
			x.setID(200);
			x.setGender("female");
			x.setLevel(3);
			x.setPassword("yoy");
			x.setType("user");
			x.setUniversity("cairo");
			x.setName("youssef");
			
			
			ConnectorBuilder adduser = new addUserURL(); 
			ConnectorBuilder signin = new signInURL();
			ConnectorBuilder removeUser = new removeUserURL();
			Connector connector = new Connector(x);
			connector.setConnectorBuilder(signin);
			connector.initiateURL();
			connector.sendData();
		}
}
