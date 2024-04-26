package com.mycompany.budgetbites.model;

public class LoginResponse {
    private String email;
    private String password;
    public LoginResponse(String email, String password){
        this.email = email;
        this.password = password;
    }
    
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }  
}