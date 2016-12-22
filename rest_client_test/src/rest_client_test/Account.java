package rest_client_test;

import java.util.Date;


/**
 * Created by hanahana on 20/12/2016.
 */
public class Account {

    private int ID;
    private String name;
    private String email;
    private String password;
    private String DateOfBirth;
    private String type; 
    private int level;
    private String faculty;
    private String university;
    private String gender;
  //  private AccountType Type;
    public Account (){
    	
    }

    public void setID(int ID){
    	this.ID= ID; 
    }
    
    public void setName(String name){
    	this.name = name; 
    }
    public void setType(String type){
    	this.type=type; 
    }
    public  void setEmail(String Email){
    	email=Email; 
    }
    public  void setPassword(String password){
    	this.password=password; 
    }
    public void setDateOfBirth(String DOB){
    	DateOfBirth=DOB;
    }
    public void setLevel(int level){
    	this.level=level;
    }
    public void setFaculty(String faculty){
    	this.faculty=faculty; 
    }
    public  void setUniversity(String uni){
    	university=uni; 
    }
    public  void setGender(String g){
    	gender=g; 
    }
//    public void setType(AccountType Type){};

    public int getID(){return ID;}
    public String getName(){return name;}
    public String getEmail(){return email;}
    public String getPassword(){return password;}
    public String getDateOfBirth(){return  DateOfBirth;}
    public int getLevel(){return level;}
    public String getFaculty(){return faculty;}
    public String getUniversity(){return university;}
    public String getGender(){return gender;}
   // public AccountType getType(){return type;};



}
