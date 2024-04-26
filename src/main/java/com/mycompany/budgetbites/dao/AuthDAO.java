package com.mycompany.budgetbites.dao;
import com.mycompany.budgetbites.database.MySqlConnection;
import com.mycompany.budgetbites.model.LoginModel;
import com.mycompany.budgetbites.model.SignUpModel;
import com.mycompany.budgetbites.model.UserData;
import com.mycompany.budgetbites.model.LoginResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthDAO extends MySqlConnection {
    public boolean signUp(SignUpModel user) {
        try {
            PreparedStatement sp = null;
            Connection conn = openConnection();
            
            String sql = "INSERT INTO users(firstname, lastname, email, password) VALUES(?,?,?,?)";
            sp = conn.prepareStatement(sql);
            sp.setString(1, user.getFirstName());
            sp.setString(2, user.getLastName());
            sp.setString(3, user.getEmail());
            sp.setString(4, user.getPassword());
            int result = sp.executeUpdate(); // returns (1) if insert success else (-1)
            if(result == -1) {
                return false;
            } else {
            return true;
            }
            
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public LoginResponse goin(LoginModel user){
        try{
            PreparedStatement sp = null;
            Connection conn = openConnection();
            
            String sql = "SELECT * from users where email = ? and password = ?";
            sp = conn.prepareStatement(sql);
            sp.setString(1, user.getEmail());
            sp.setString(2, user.getPassword());
            
            ResultSet result = sp.executeQuery();
            if(result == null){
                return null;
            }else{
                result.next();
                LoginResponse lr = new LoginResponse(
                result.getString("email"),
                result.getString("password")
                );
                return lr;
            }
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public UserData login(LoginModel login){
        try{
            PreparedStatement ps = null;
            Connection conn = openConnection();
            String sql = "SELECT * FROM users WHERE email = ? and password = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,login.getEmail());
            ps.setString(2, login.getPassword());
            
            ResultSet result = ps.executeQuery();
            if(result != null && result.next() != false){
                // get data here
                String email = result.getString("email");
                String password = result.getString("password");
                
                UserData user = new UserData(
                        email, password
                );
                return user;
            }else{
                return null;
            }
        }catch(Exception exception){
           return null;
        }
        
    }
}