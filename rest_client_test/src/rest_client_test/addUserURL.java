package rest_client_test;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class addUserURL extends ConnectorBuilder {

	@Override
	//example path /account/add/id/name/type/email/password/gender/date/level/faculty/university
	public void buildURL(Object obj, WebTarget target) throws ParseException {
	//	obj = (Account) obj;
		Account account = (Account) obj;
		JSONParser parser = new JSONParser();
//		Object x = parser.parse(target.path("rest").path("account")
//		.path("create").path(Integer.toString(account.getID())).path(account.getName())
//		.path("user").path(account.getEmail()).path(account.getPassword()).path(account.getGender())
//		.path(account.getDateOfBirth()).path(Integer.toString(account.getLevel()))
//		.path(account.getFaculty()).path(account.getUniversity()).request().accept(MediaType.TEXT_PLAIN)
//		.get(String.class).toString());	
		Object x = parser.parse(target.path("rest").path("account")
				.path("create").path("200").path("youssef")
				.path("user").path("sara@yahoo").path("soso").path("female")
				.path("1996-09-22").path("3")
				.path("fci").path("cu").request()
				.accept(MediaType.TEXT_PLAIN).get(String.class).toString());
		JSONObject jsonObj = (JSONObject) x;
		System.out.println(jsonObj.toJSONString());
	}
		
}
