package com.example.win81.e_lib;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by hanahana on 19/12/2016.
 */
public class AccountController {
    private ConnectorBuilder connectorBuilder;
    private Connector connector;

public void SignIn(String email,String password) throws ParseException {


    Account account = new Account();
    String obj=null;
    account.setEmail(email);
    account.setPassword(password);
    ConnectorBuilder signIn = new signInURL();
    connector= new Connector(account);
    connector.setConnectorBuilder(signIn);
    connector.initiateURL();
    try {
        obj = connector.sendData();
    } catch (ParseException e) {
        e.printStackTrace();
    }
    JSONParser parser = new JSONParser();
    JSONObject json = (JSONObject) parser.parse(obj);
    String getInfo=null;
    if(json.get("Response").toString().equals("valid")) {
        String id = (String) json.get("ID:");
        account.setID(Integer.parseInt(id));
        Connector connector1 = new Connector(account);
        connector1.setConnectorBuilder(new GetAccountInfoURL());
        connector1.initiateURL();
        getInfo= connector1.sendData();

    }
    JSONObject jsonGetInfo = (JSONObject) parser.parse(getInfo);
    account.setName(jsonGetInfo.get("name").toString());
    account.setDateOfBirth(jsonGetInfo.get("date of birth").toString());
    account.setGender(jsonGetInfo.get("gender").toString());
    account.setLevel(Integer.parseInt(jsonGetInfo.get("level").toString()));
    account.setFaculty(jsonGetInfo.get("faculty").toString());
    account.setUniversity(jsonGetInfo.get("university").toString());
    account.setType(jsonGetInfo.get("type").toString());

}
    public void SignUp(String name,String email,String password,String date) throws ParseException {
        Account account = new Account();
        account.setName(name);
        account.setEmail(email);
        account.setPassword(password);
        account.setDateOfBirth(date);
        ConnectorBuilder signup = new addUserURL();
        connector= new Connector(account);
        connector.setConnectorBuilder(signup);
        connector.initiateURL();
        String x = connector.sendData();

    }
    public void Update(){};
    public boolean Delete(){return true;};


}
