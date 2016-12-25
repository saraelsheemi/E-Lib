package com.example.win81.e_lib;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class loadMaterial extends ConnectorBuilder {

	@Override
	public void buildURL(Object obj, WebTarget target) throws ParseException {
		
		Material material = (Material) obj;
		JSONParser parser = new JSONParser();
		
		Object x = parser.parse(target.path("rest").path("material")
				.path("loadmaterial").path(Integer.toString(material.getMaterialID()))
				.request().accept(MediaType.TEXT_PLAIN).get(String.class).toString());
		
		JSONObject jsonObj = (JSONObject) x;
		System.out.println(jsonObj.toJSONString());

		
	}

}
