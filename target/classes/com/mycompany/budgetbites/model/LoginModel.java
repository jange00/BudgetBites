
package com.mycompany.budgetbites.model;

public class LoginModel {
    private String email;
    private String password;
    public LoginModel(String email, String password){
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
