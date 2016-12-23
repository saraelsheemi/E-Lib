package com.example.win81.e_lib;


<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> aaec12e39d706055eb556954d78924a049cf9f9e
import java.util.Date;

/**
 * Created by hanahana on 19/12/2016.
 */
<<<<<<< HEAD
public class AccountController
{
    private ConnectBuilder obj;
    private Account [] obj1;

public void SignIn(String name_email,String password){};
    public void SignUp(String name , String email , String password ,
                       Date DOB ,int level ,String faculty ,
                       String university ,String gender ,
                       AccountType Type){

    };
    public void Update(){};
    public boolean Delete(){return true;};
=======
public class AccountController {

    private ConnectorBuilder cb = new ConnectorBuilder();
    private ArrayList<Account> accounts = new ArrayList<Account>();
>>>>>>> aaec12e39d706055eb556954d78924a049cf9f9e

    public void signUp(Account newAccount) {

    }

    public void signIn(String name, String password) {

    }

    public void deactivateAccount(int accountID) {

    }
}
