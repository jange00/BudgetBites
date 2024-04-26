package com.mycompany.budgetbites.model;

public class SignUpModel {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    
    public SignUpModel(String email, String password, String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }


}
