package com.mycompany.budgetbites.model;

public class UserData {
    private String email;
    private String password;
    public UserData(String email, String password){
        this.email = email;
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
    public String getEmail(){
        return this.email;
    }
}