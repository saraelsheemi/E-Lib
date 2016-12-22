package rest_client_test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Connector {
	private ConnectorBuilder connectorBuilder; 
	private WebTarget target;
	private Client client;
	private ClientConfig config;
	private Object obj; 
	
	public Connector(Object obj){
		this.obj = obj; 
	}
	public void setConnectorBuilder(ConnectorBuilder connectorBuilder){
		this.connectorBuilder= connectorBuilder;		
	}

	public void initiateURL(){
		config = new ClientConfig();
		client = ClientBuilder.newClient(config);
		target = client.target(UriBuilder.fromUri("http://localhost:8080/Elib_service").build());	
	
	}
	public void sendData() throws ParseException{
		connectorBuilder.buildURL(obj, target);
		
	}

}
