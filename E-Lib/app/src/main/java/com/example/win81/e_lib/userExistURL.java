package com.example.win81.e_lib;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class userExistURL extends ConnectorBuilder {
	@Override
	public String buildURL(Object obj, WebTarget target) throws ParseException {
			Account account = (Account) obj;
			JSONParser parser = new JSONParser();
			Object x = parser.parse(target.path("rest").path("account")
					.path("userexist").path(account.getEmail())
					.request()
					.accept(MediaType.TEXT_PLAIN).get(String.class).toString());
			JSONObject jsonObj = (JSONObject) x;
			return jsonObj.toJSONString();
		}

}
