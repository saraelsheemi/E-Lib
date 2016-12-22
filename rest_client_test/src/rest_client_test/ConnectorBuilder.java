package rest_client_test;

import javax.ws.rs.client.WebTarget;

import org.json.simple.parser.ParseException;

public abstract class ConnectorBuilder {
	public abstract void buildURL(Object obj, WebTarget target) throws ParseException;


}

