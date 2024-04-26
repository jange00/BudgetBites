package com.mycompany.budgetbites.database;
import java.sql.*;

public class MySqlConnection implements DbConnection{

    @Override
    public Connection openConnection() {
        try {
            String username = "root";
            String password = "password";
            String database = "budgetbites";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection;
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/" + database, username, password
            );
            if (connection == null) {
                System.out.println("Database Connection Fail");
            } else {
                System.out.println("Database Connection Pass");
            }
            return connection; // Don't forget to return the connection if successful
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }


    @Override
    public void closeConnection(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Connection closed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }  
    }

    @Override
    public ResultSet runQuery(Connection con, String query) {
        try{
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            return result;
        }catch(Exception e){
        System.out.println(e);
        return null;
        }
    }

    @Override
    public int executeUpdate(Connection con, String query) {
        try{
            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate(query);
            return result;
        }catch (Exception e){
            System.out.println(e);
            return -1;
        }
    }
    
    public String getEmailFromRecord(Connection con, int recordId) {
        String email = null;
        try {
            String query = "SELECT email FROM users WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, recordId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                email = rs.getString("email");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println("Error fetching email from record: " + e.getMessage());
        }
        return email;
    }
        
        public int updatePasswordByEmail(Connection con, String email, String newPassword) {
        try {
            String query = "UPDATE users SET password = ? WHERE email = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, newPassword);
            pstmt.setString(2, email);
            int rowsUpdated = pstmt.executeUpdate();
            pstmt.close();
            return rowsUpdated;
        } catch (SQLException e) {
            System.out.println("Error updating password: " + e.getMessage());
            return -1; // or handle the error accordingly
        }
    }
        
    public int addRecipeToFavorites(Connection con, String recipeName) {
            try {
                String query = "INSERT INTO favorite_recipes (recipe_name) VALUES (?)";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, recipeName);
                int rowsInserted = pstmt.executeUpdate();
                pstmt.close();
                return rowsInserted;
            } catch (SQLException e) {
                System.out.println("Error adding recipe to favorites: " + e.getMessage());
                return -1; // or handle the error accordingly
            }
    }
    
}
