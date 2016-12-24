package com.example.win81.e_lib;



import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hanahana on 19/12/2016.
 */

public class AccountController
{
    private ConnectorBuilder obj;
    private Account [] obj1;

public void SignIn(String name_email,String password){};

    public void SignUp(String name , String email , String password ,
                       Date DOB ,int level ,String faculty ,
                       String university ,String gender ,
                       AccountType Type){

    };
    public void Update(){};
    public boolean Delete(){return true;};

   /* public class AccountController {

    private ConnectorBuilder cb = new ConnectorBuilder();
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public void signUp(Account newAccount) {

    }

    public void signIn(String name, String password) {

    }

    public void deactivateAccount(int accountID) {

    }
}
*/