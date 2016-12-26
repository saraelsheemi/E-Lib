package com.example.win81.e_lib;

import javax.ws.rs.client.WebTarget;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public abstract class ConnectorBuilder {
	public abstract String buildURL(Object obj, WebTarget target) throws ParseException;


}

