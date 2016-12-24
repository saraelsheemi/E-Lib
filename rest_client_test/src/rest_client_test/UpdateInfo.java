package rest_client_test;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UpdateInfo extends ConnectorBuilder  {
	@Override
	public void buildURL(Object obj, WebTarget target) throws ParseException {
			Account account = (Account) obj;
			JSONParser parser = new JSONParser();
			
			Object x = parser.parse(target.path("rest").path("account")
					.path("updateinfo")
					.path(Integer.toString(account.getID()))
					.path(account.getName())
					.path(account.getType())
					.path(account.getEmail())
					.path(account.getPassword())
					.path(account.getGender())
					.path(account.getDateOfBirth())
					.path(Integer.toString(account.getLevel()))
					.path(account.getFaculty())
					.path(account.getUniversity())
					.request()
					.accept(MediaType.TEXT_PLAIN).get(String.class).toString());
			
			JSONObject jsonObj = (JSONObject) x;
			System.out.println(jsonObj.toJSONString());
		}

}
