package com.example.win81.e_lib;

import javax.ws.rs.client.WebTarget;

import org.json.simple.parser.ParseException;

public abstract class ConnectorBuilder {
	public abstract void buildURL(Object obj, WebTarget target) throws ParseException;


}

