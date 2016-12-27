package com.example.win81.e_lib;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AcceptURL extends ConnectorBuilder {

	@Override
	public String buildURL(Object obj, WebTarget target) throws ParseException {
		
		UploadRequest request = (UploadRequest) obj;
		Account account = (Account) obj;
		Course course = (Course)obj;
		
		JSONParser parser = new JSONParser();
		
		Object x = parser.parse(target.path("rest").path("uploadrequest")
				.path("AcceptURL").path(Integer.toString(request.getID()))
				.path(Integer.toString(account.getID()))
				.path(request.getFileDescripion()).path(request.getFileName())
				.path(request.getFileAuthor()).path(Integer.toString(course.getCourseID()))
				.path(request.getDate()).request()
				.accept(MediaType.TEXT_PLAIN).get(String.class).toString());
		
		JSONObject jsonObj = (JSONObject) x;
		return jsonObj.toJSONString();
	}

}
