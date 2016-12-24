package rest_client_test;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class subscribe extends ConnectorBuilder {

	@Override
	public void buildURL(Object obj, WebTarget target) throws ParseException {
		
		Course course = (Course)obj;
		Account account = (Account) obj;
		JSONParser parser = new JSONParser();
		

		Object x = parser.parse(target.path("rest").path("course")
				.path("subscribe").path(Integer.toString(account.getID()))
				.path(Integer.toString(course.getCourseID())).request()
				.accept(MediaType.TEXT_PLAIN).get(String.class).toString());
		
		JSONObject jsonObj = (JSONObject) x;
		System.out.println(jsonObj.toJSONString());

		
	}

}
