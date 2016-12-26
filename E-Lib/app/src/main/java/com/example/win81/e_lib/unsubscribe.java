package com.example.win81.e_lib;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class unsubscribe extends ConnectorBuilder {

	@Override
	public String buildURL(Object obj, WebTarget target) throws ParseException {
		
		Course course = (Course)obj;
		Account account = (Account) obj;
		JSONParser parser = new JSONParser();
		

		Object x = parser.parse(target.path("rest").path("course")
				.path("unsubscribe").path(Integer.toString(account.getID()))
				.path(Integer.toString(course.getCourseID())).request()
				.accept(MediaType.TEXT_PLAIN).get(String.class).toString());
		
		JSONObject jsonObj = (JSONObject) x;
		return jsonObj.toJSONString();
		
	}

}
